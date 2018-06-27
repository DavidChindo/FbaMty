package com.fibramty.fbmty.View.Fragment;


import android.app.ProgressDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.app.AlertDialog;
import android.support.v7.widget.CardView;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.TextView;

import com.fibramty.fbmty.Library.DesignUtils;
import com.fibramty.fbmty.Library.Statics;
import com.fibramty.fbmty.Network.Response.ServicesDescResponse;
import com.fibramty.fbmty.Presenter.Callbacks.ParkingsRequestCallback;
import com.fibramty.fbmty.Presenter.ParkingsRequestPresentet;
import com.fibramty.fbmty.R;
import com.fibramty.fbmty.View.Activity.MainActivity;
import com.fibramty.fbmty.View.Activity.ParkingsActivity;
import com.fibramty.fbmty.View.Adapter.ParkingsRequestAdapter;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindString;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnCheckedChanged;
import butterknife.OnClick;

public class ParkingsRequest extends Fragment implements ParkingsRequestCallback{

    @BindView(R.id.fr_parkings_recycler)RecyclerView recyclerView;
    @BindView(R.id.fr_parkings_card_short_view)CardView shortCardView;
    @BindView(R.id.fr_parkings_card_view)CardView cardView;
    @BindView(R.id.fr_parkings_title_instructions)TextView txtTitle;

    @BindView(R.id.fr_parkings_edt_price_card)EditText edtPriceCard;
    @BindView(R.id.fr_parkings_edt_cards_rent)EditText edtRentCard;
    @BindView(R.id.title_cardsxrent)TextView txtTitleRent;
    @BindView(R.id.fr_parking_rgb_cardType)RadioGroup cardRgb;
    @BindView(R.id.cardType)TextView cardTypeTxt;

    @BindView(R.id.fr_parking_rgb_action)RadioGroup actionRgb;
    @BindView(R.id.fr_parking_rgb_box)RadioGroup boxRgb;
    @BindView(R.id.fr_parking_rgb_place)RadioGroup rgbPlace;
    @BindView(R.id.fr_parkings_edt_parkings_rent)EditText parkingsRent;
    @BindView(R.id.fr_parkings_edt_price_rent)EditText priceRent;
    @BindView(R.id.fr_parkings_edt_parkings_mtto)EditText parkingsMtto;
    @BindView(R.id.fr_parkings_edt_price_mtto)EditText priceMtto;

    @BindString(R.string.request_parkings)String titleParkings;
    @BindString(R.string.request_cards)String titleCards;
    @BindString(R.string.request_courtesies)String titleCourtesies;
    @BindString(R.string.cardsxrent)String edtCardsTitle;
    @BindString(R.string.courtesies)String edtCourtesiesTitle;

    private RecyclerView.LayoutManager mLayoutManager;
    List<ServicesDescResponse> mServicesDescResponses;
    ProgressDialog mProgressDialog;

    ParkingsRequestPresentet parkingsRequestPresentet;

    int idService = -1;
    int rentValue = 0;
    int mttoValue = 0;
    int actionType = 0;

    ServicesDescResponse mServicesDescResponse;

    public ParkingsRequest() {
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
        View view = inflater.inflate(R.layout.fragment_parkings_request, container, false);
        ButterKnife.bind(this,view);

        Bundle bundle = getArguments();
        if (bundle != null){
            idService = bundle.getInt("idService");
        }

        return view;
    }

    private void initViews(){
        mServicesDescResponses = new ArrayList<ServicesDescResponse>();
        hideKeyBoard();

        parkingsRequestPresentet = new ParkingsRequestPresentet(this,getActivity());
        requestServices(idService);

        txtTitle.setText(titleInstructions(idService));

        onRadioGroupChecked();
        onTextWatcherListener();
    }

    @Override
    public void onLoadServicesParkings(List<ServicesDescResponse> servicesDescResponses) {

        mServicesDescResponses = servicesDescResponses;
        mLayoutManager = new LinearLayoutManager(getContext());
        recyclerView.setLayoutManager(mLayoutManager);

        recyclerView.setAdapter(new ParkingsRequestAdapter(servicesDescResponses,getActivity()));

        if (idService == Statics.SERVICE_PARKINGS)
            mServicesDescResponse  = servicesDescResponseById(rentValue,mttoValue);
        else if (idService == Statics.SERVICE_CARDS)
            mServicesDescResponse  = servicesDescResponseCard(0);
        else
            mServicesDescResponse = servicesDescResponses.get(0);
    }

    @Override
    public void onErrorServicesParkings(String msgError) {
        recyclerView.setVisibility(View.GONE);
        DesignUtils.errorMessage(getActivity(),"",msgError);
    }

    @Override
    public void onSuccessSubmitTicketService(String msg) {
        mProgressDialog.dismiss();
        clearFields();
        DesignUtils.successMessage(getActivity(),"",msg);
        ParkingsActivity.mViewPager.postDelayed(new Runnable()
        {
            @Override
            public void run()
            {
                ParkingsActivity.mViewPager.setCurrentItem(1, true);
            }
        }, 100);
    }

    @Override
    public void onErrorSubmitTicketService(String msg) {
        mProgressDialog.dismiss();
        clearFields();
        DesignUtils.errorMessage(getActivity(),"",msg);
    }

    @Override
    public void onReloadServicesList() {

    }

    @OnClick(R.id.fr_parkings_btn_request)
    void onRequestParkingsClick(){

        if ((parkingsRent.getText().toString() != null && !parkingsRent.getText().toString().isEmpty()) &&
                (parkingsMtto.getText().toString() != null && !parkingsMtto.getText().toString().isEmpty())) {
            AlertDialog.Builder builder;
            builder = new AlertDialog.Builder(getActivity());
            builder.setCancelable(false);
            builder.setTitle("Solicitud")
                    .setMessage("¿Seguro de mandar la solicitud?")
                    .setPositiveButton(R.string.accept, new DialogInterface.OnClickListener() {
                        public void onClick(DialogInterface dialog, int which) {
                            mProgressDialog = ProgressDialog.show(getActivity(), null, "Enviando...");
                            mProgressDialog.setCancelable(false);
                            sentRequestService(idService);

                        }
                    })
                    .setNegativeButton(R.string.cancel, new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialogInterface, int i) {
                            dialogInterface.dismiss();
                        }
                    })
                    .show();
        }else{
            DesignUtils.errorMessage(getActivity(),"Validación","Campos Requeridos");
        }

    }

    @OnClick(R.id.fr_parkings_btn_request_cancel)
    void onCancelParkingsClick(){
        getActivity().finish();
    }

    @OnClick(R.id.fr_parkings_btn_card_request)
    void onRequestCardCourtesiesClick(){

        if (edtRentCard.getText().toString() != null && !edtRentCard.getText().toString().isEmpty()) {
            AlertDialog.Builder builder;
            builder = new AlertDialog.Builder(getActivity());
            builder.setCancelable(false);
            builder.setTitle("Solicitud")
                    .setMessage("¿Seguro de mandar la solicitud?")
                    .setPositiveButton(R.string.accept, new DialogInterface.OnClickListener() {
                        public void onClick(DialogInterface dialog, int which) {
                            mProgressDialog = ProgressDialog.show(getActivity(), null, "Enviando...");
                            mProgressDialog.setCancelable(false);
                            sentRequestService(idService);

                        }
                    })
                    .setNegativeButton(R.string.cancel, new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialogInterface, int i) {
                            dialogInterface.dismiss();
                        }
                    })
                    .show();
        }else{
            DesignUtils.errorMessage(getActivity(),"Validación","Campos Requeridos");
        }

    }

    @OnClick(R.id.fr_parkings_btn_request_card_cancel)
    void onCancelCardCourtesiesClick(){
        getActivity().finish();
    }

    private void onRadioGroupChecked(){
        actionRgb.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                actionType = i == R.id.fr_parkings_rgb_add ? 0 : 1;
            }
        });

        boxRgb.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                rentValue = i == R.id.fr_parkings_rgb_contract ? 0 : 1;
                mttoValue = rgbPlace.getCheckedRadioButtonId() == R.id.fr_parkings_rgb_pool ? 0 : 1;
                mServicesDescResponse  = servicesDescResponseById(rentValue,mttoValue);

                if (parkingsRent.getText().toString() != null && !parkingsRent.getText().toString().isEmpty()){
                    priceRent.setText(String.valueOf(Integer.valueOf(parkingsRent.getText().toString()) * mServicesDescResponse.getRentPrice()));
                }else{
                    priceRent.setText("0");
                }

                if (parkingsMtto.getText().toString() != null && !parkingsMtto.getText().toString().isEmpty()){
                    priceMtto.setText(String.valueOf(Integer.valueOf(parkingsMtto.getText().toString()) * mServicesDescResponse.getAmountPrice()));
                }else{
                    priceMtto.setText("0");
                }
            }
        });

        rgbPlace.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                mttoValue = i == R.id.fr_parkings_rgb_pool ? 0 : 1;
                rentValue = boxRgb.getCheckedRadioButtonId()== R.id.fr_parkings_rgb_contract ? 0 : 1;
                mServicesDescResponse  = servicesDescResponseById(rentValue,mttoValue);

                if (parkingsMtto.getText().toString() != null && !parkingsMtto.getText().toString().isEmpty()){
                    priceMtto.setText(String.valueOf(Integer.valueOf(parkingsMtto.getText().toString()) * mServicesDescResponse.getAmountPrice()));
                }else{
                    priceMtto.setText("0");
                }

                if (parkingsRent.getText().toString() != null && !parkingsRent.getText().toString().isEmpty()){
                    priceRent.setText(String.valueOf(Integer.valueOf(parkingsRent.getText().toString()) * mServicesDescResponse.getRentPrice()));
                }else{
                    priceRent.setText("0");
                }
            }
        });

        cardRgb.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                mServicesDescResponse = servicesDescResponseCard(i == R.id.fr_parkings_rgb_normal ? 0 : 1);
                if (edtRentCard.getText().toString() != null && !edtRentCard.getText().toString().isEmpty()){
                    edtPriceCard.setText(String.valueOf(Integer.valueOf(edtRentCard.getText().toString()) * mServicesDescResponse.getRentPrice()));
                }else{
                    edtPriceCard.setText("0");
                }
            }
        });
    }

    private void onTextWatcherListener(){
        parkingsRent.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void afterTextChanged(Editable editable) {
                if (editable.toString() != null && !editable.toString().isEmpty()){
                    priceRent.setText(String.valueOf(Integer.valueOf(editable.toString()) * mServicesDescResponse.getRentPrice()));
                }else{
                    priceRent.setText("0");
                }
            }
        });

        parkingsMtto.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void afterTextChanged(Editable editable) {

                if (editable.toString() != null && !editable.toString().isEmpty()){
                    priceMtto.setText(String.valueOf(Integer.valueOf(editable.toString()) * mServicesDescResponse.getAmountPrice()));
                }else{
                    priceMtto.setText("0");
                }

            }
        });

        edtRentCard.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void afterTextChanged(Editable editable) {

                if (editable.toString() != null && !editable.toString().isEmpty()){
                    edtPriceCard.setText(String.valueOf(Integer.valueOf(editable.toString()) * mServicesDescResponse.getRentPrice()));
                }else{
                    edtPriceCard.setText("0");
                }

            }
        });
    }

    private void requestServices(int idTempService){
        switch (idTempService){
            case Statics.SERVICE_PARKINGS:
                parkingsRequestPresentet.cajonesEstByUserAndHolding(MainActivity.holdingResponse.getId());
                break;
            case Statics.SERVICE_CARDS:
                parkingsRequestPresentet.tarjetasEstByUserAndHolding(MainActivity.holdingResponse.getId());
                break;
            case  Statics.SERVICE_COURTESIES:
                parkingsRequestPresentet.CortesiasEstByUserAndHolding(MainActivity.holdingResponse.getId());
                break;
        }
    }

    private String titleInstructions(int idTempService){
        switch (idTempService){
            case Statics.SERVICE_PARKINGS:
                shortCardView.setVisibility(View.GONE);
                cardView.setVisibility(View.VISIBLE);
                return titleParkings;
            case Statics.SERVICE_CARDS:
                shortCardView.setVisibility(View.VISIBLE);
                cardView.setVisibility(View.GONE);
                cardTypeTxt.setVisibility(View.VISIBLE);
                cardRgb.setVisibility(View.VISIBLE);
                txtTitleRent.setText(edtCardsTitle);
                return titleCards;
            case  Statics.SERVICE_COURTESIES:
                shortCardView.setVisibility(View.VISIBLE);
                cardView.setVisibility(View.GONE);
                cardTypeTxt.setVisibility(View.GONE);
                cardRgb.setVisibility(View.GONE);
                txtTitleRent.setText(edtCourtesiesTitle);
                return titleCourtesies;
                default:
                    return "";
        }
    }

    private void hideKeyBoard(){
        try {
            getActivity().getWindow().setSoftInputMode(
                    WindowManager.LayoutParams.SOFT_INPUT_STATE_ALWAYS_HIDDEN);
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    private ServicesDescResponse servicesDescResponseById(int box, int place){
        ServicesDescResponse servicesDescResponse = null;

        if (box == 0 && place == 0){
            for (int i = 0; i < mServicesDescResponses.size() ; i++){
                if (mServicesDescResponses.get(i).getId() == 10){
                    servicesDescResponse =  mServicesDescResponses.get(i);
                }
            }
        }else if (box == 0 && place == 1){
            for (int i = 0; i < mServicesDescResponses.size() ; i++){
                if (mServicesDescResponses.get(i).getId() == 11){
                    servicesDescResponse =  mServicesDescResponses.get(i);
                }
            }
        }else if (box == 1 && place == 0){
            for (int i = 0; i < mServicesDescResponses.size() ; i++){
                if (mServicesDescResponses.get(i).getId() == 12){
                    servicesDescResponse =  mServicesDescResponses.get(i);
                }
            }
        }else if (box == 1 && place == 1){
            for (int i = 0; i < mServicesDescResponses.size() ; i++){
                if (mServicesDescResponses.get(i).getId() == 13){
                    servicesDescResponse =  mServicesDescResponses.get(i);
                }
            }
        }

        return  servicesDescResponse;
    }

    private ServicesDescResponse servicesDescResponseCard(int type){
        ServicesDescResponse servicesDescResponse = null;

        if (type == 0){
            for (int i = 0; i < mServicesDescResponses.size() ; i++){
                if (mServicesDescResponses.get(i).getId() == 14){
                    servicesDescResponse =  mServicesDescResponses.get(i);
                }
            }
        }else{
            for (int i = 0; i < mServicesDescResponses.size() ; i++){
                if (mServicesDescResponses.get(i).getId() == 15){
                    servicesDescResponse =  mServicesDescResponses.get(i);
                }
            }
        }

        return servicesDescResponse;
    }

    private void sentRequestService(int idTempService){

        switch (idTempService){
            case Statics.SERVICE_PARKINGS:

                int numCortesias = Integer.valueOf(parkingsRent.getText().toString());
                int numMto = Integer.valueOf(parkingsMtto.getText().toString());
                int precioCortesia = Integer.valueOf(priceRent.getText().toString());
                int precioMtto = Integer.valueOf(priceMtto.getText().toString());
                parkingsRequestPresentet.sentCajonesEst(mServicesDescResponse.getId(),mServicesDescResponse.getHoldingId(),numCortesias,numMto,precioCortesia,precioMtto,actionType);

                break;

            case Statics.SERVICE_CARDS:

                int numCortesiasCards = Integer.valueOf(edtRentCard.getText().toString());
                int precioCortesiasCards = Integer.valueOf(edtPriceCard.getText().toString());
                parkingsRequestPresentet.sendTarjetasEstTickets(mServicesDescResponse.getId(),mServicesDescResponse.getHoldingId(),numCortesiasCards,precioCortesiasCards);

                break;

            case Statics.SERVICE_COURTESIES:

                int numCortesiasCards1 = Integer.valueOf(edtRentCard.getText().toString());
                int precioCortesiasCards1 = Integer.valueOf(edtPriceCard.getText().toString());
                parkingsRequestPresentet.sendCortesiasEstTickets(mServicesDescResponse.getId(),mServicesDescResponse.getHoldingId(),numCortesiasCards1,precioCortesiasCards1);

                break;
        }
    }

    private void clearFields(){
        edtPriceCard.setText("");
        edtRentCard.setText("");
        parkingsRent.setText("");
        priceRent.setText("");
        parkingsMtto.setText("");
        priceMtto.setText("");
    }
}
