package com.fibramty.fbmty.View.Fragment;


import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;

import com.fibramty.fbmty.Dal.Objects.StatusParkings;
import com.fibramty.fbmty.Library.DesignUtils;
import com.fibramty.fbmty.Library.Statics;
import com.fibramty.fbmty.Network.Response.ServicesDataResponse;
import com.fibramty.fbmty.Network.Response.ServicesDescResponse;
import com.fibramty.fbmty.Presenter.Callbacks.ParkingsInboxCallback;
import com.fibramty.fbmty.Presenter.ParkingsInboxPresenter;
import com.fibramty.fbmty.R;
import com.fibramty.fbmty.View.Activity.MainActivity;
import com.fibramty.fbmty.View.Adapter.ParkingsInboxAdapter;
import com.fibramty.fbmty.View.Adapter.ParkingsRequestAdapter;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * A simple {@link Fragment} subclass.
 */
public class ParkingsInbox extends Fragment implements ParkingsInboxCallback {

    @BindView(R.id.fr_parkings_inbox_spinner_status)Spinner statusSp;
    @BindView(R.id.fr_parkings_inbox_results_number)TextView numberTxt;
    @BindView(R.id.fr_parkings_inbox_recycler)RecyclerView recyclerView;

    private RecyclerView.LayoutManager mLayoutManager;
    List<ServicesDataResponse> mServicesDataResponses;
    ParkingsInboxPresenter parkingsInboxPresenter;

    int idService = -1;

    public ParkingsInbox() {
        // Required empty public constructor
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        initViews();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_parkings_inbox, container, false);
        ButterKnife.bind(this,view);

        Bundle bundle = getArguments();

        if (bundle != null){
            idService = bundle.getInt("idService");
        }

        return view;
    }

    private void initViews(){
        statusSp.setAdapter(new ArrayAdapter<StatusParkings>(getActivity(),android.R.layout.simple_list_item_1,StatusParkings.statusParkings()));

        parkingsInboxPresenter = new ParkingsInboxPresenter(this,getActivity());
        requestServices(idService);
    }

    @Override
    public void onResume() {
        super.onResume();
        initViews();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        initViews();
    }

    @OnClick(R.id.fr_parkings_inbox_btn_search)
    void onSearchClick(){

    }


    @Override
    public void onLoadServicesData(List<ServicesDataResponse> servicesDataResponses) {

        mServicesDataResponses = servicesDataResponses;
        mLayoutManager = new LinearLayoutManager(getContext());
        recyclerView.setLayoutManager(mLayoutManager);

        recyclerView.setAdapter(new ParkingsInboxAdapter(servicesDataResponses,getActivity()));
        numberTxt.setText(String.valueOf(servicesDataResponses.size()));

        recyclerView.setVisibility(View.VISIBLE);
    }

    @Override
    public void onErrorServicesData(String msg) {
        recyclerView.setVisibility(View.GONE);
        DesignUtils.errorMessage(getActivity(),"",msg);
    }

    private void requestServices(int idTempService){
        switch (idTempService){
            case Statics.SERVICE_PARKINGS:
                parkingsInboxPresenter.getHoldingUserParkingLotsTickets(MainActivity.holdingResponse.getId());
                break;
            case Statics.SERVICE_CARDS:
                parkingsInboxPresenter.getHoldingUserParkingCardsTickets(MainActivity.holdingResponse.getId());
                break;
            case  Statics.SERVICE_COURTESIES:
                parkingsInboxPresenter.getHoldingUserParkingMembershipsTickets(MainActivity.holdingResponse.getId());
                break;
        }
    }

}


