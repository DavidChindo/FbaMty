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
import com.google.android.gms.dynamic.IFragmentWrapper;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import butterknife.OnItemSelected;

/**
 * A simple {@link Fragment} subclass.
 */
public class ParkingsInbox extends Fragment implements ParkingsInboxCallback {

    @BindView(R.id.fr_parkings_inbox_spinner_status)Spinner statusSp;
    @BindView(R.id.fr_parkings_inbox_results_number)TextView numberTxt;
    @BindView(R.id.no_results)TextView notResults;
    @BindView(R.id.fr_parkings_inbox_recycler)RecyclerView recyclerView;

    private RecyclerView.LayoutManager mLayoutManager;
    List<ServicesDataResponse> mServicesDataResponses;
    List<ServicesDataResponse> mServicesDataResponsesFilters;
    ParkingsInboxPresenter parkingsInboxPresenter;
    List<StatusParkings> statusParkings;
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
        statusParkings = StatusParkings.statusParkings();

        statusSp.setAdapter(new ArrayAdapter<StatusParkings>(getActivity(),android.R.layout.simple_list_item_1,statusParkings));
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

    @OnItemSelected(R.id.fr_parkings_inbox_spinner_status)
    void onSearchClick(int position){
        mServicesDataResponsesFilters = new ArrayList<ServicesDataResponse>();
        StatusParkings statusParking = statusParkings.get(position);
        if (statusParking != null){
            if (statusParking.getValue() >= 0) {

                for (int i = 0; i < mServicesDataResponses.size(); i++) {
                    if (mServicesDataResponses.get(i).getStatus() == statusParking.getValue()) {
                        mServicesDataResponsesFilters.add(mServicesDataResponses.get(i));
                    }
                }

                if (mServicesDataResponsesFilters != null && mServicesDataResponsesFilters.size() > 0) {
                    recyclerView.setAdapter(new ParkingsInboxAdapter(mServicesDataResponsesFilters, getActivity()));
                    numberTxt.setText(String.valueOf(mServicesDataResponsesFilters.size()));
                    recyclerView.setVisibility(View.VISIBLE);
                    notResults.setVisibility(View.GONE);
                } else {
                    numberTxt.setText(String.valueOf("0"));
                    recyclerView.setVisibility(View.GONE);
                    notResults.setVisibility(View.VISIBLE);
                }

            }else{
                recyclerView.setAdapter(new ParkingsInboxAdapter(mServicesDataResponses, getActivity()));
                numberTxt.setText(String.valueOf(mServicesDataResponses.size()));
                recyclerView.setVisibility(View.VISIBLE);
                notResults.setVisibility(View.GONE);
            }
        }

    }


    @Override
    public void onLoadServicesData(List<ServicesDataResponse> servicesDataResponses) {

        mServicesDataResponses = servicesDataResponses;
        if (mServicesDataResponses != null && mServicesDataResponses.size() > 0) {
            mLayoutManager = new LinearLayoutManager(getContext());
            recyclerView.setLayoutManager(mLayoutManager);

            recyclerView.setAdapter(new ParkingsInboxAdapter(servicesDataResponses, getActivity()));
            numberTxt.setText(String.valueOf(servicesDataResponses.size()));

            recyclerView.setVisibility(View.VISIBLE);
        }else{
            numberTxt.setText(String.valueOf("0"));
            recyclerView.setVisibility(View.VISIBLE);
            notResults.setVisibility(View.GONE);
        }
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


