package com.fibramty.fbmty.View.Dialogs;

import android.app.Activity;
import android.app.ProgressDialog;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.fibramty.fbmty.Library.Connection;
import com.fibramty.fbmty.Library.DesignUtils;
import com.fibramty.fbmty.Library.Validators;
import com.fibramty.fbmty.Network.Request.ActionTicketRequest;
import com.fibramty.fbmty.Network.Response.MyTicketResponse;
import com.fibramty.fbmty.Presenter.Callbacks.MyTicketsCallback;
import com.fibramty.fbmty.Presenter.MyTicketsPresenter;
import com.fibramty.fbmty.R;
import com.google.gson.Gson;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MyTicketDialog extends Activity implements MyTicketsCallback{

    @BindView(R.id.dialog_myticket_title)TextView txtTitle;
    @BindView(R.id.dialog_myticket_no_ticket)TextView txtNoTicket;
    @BindView(R.id.dialog_myticket_date)TextView txtDate;
    @BindView(R.id.dialog_myticket_observations)TextView txtObservations;
    @BindView(R.id.dialog_myticket_status)TextView txtStatus;
    @BindView(R.id.dialog_myticket_cancel)Button btnCancel;
    @BindView(R.id.dialog_myticket_ln_btn)LinearLayout lnBtn;

    MyTicketResponse myTicketResponse;
    MyTicketsPresenter myTicketsPresenter;
    ProgressDialog mProgressDialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_ticket_dialog);
        ButterKnife.bind(this);
        Bundle bundle = getIntent().getExtras();
        if (bundle != null){
            String paymentString = bundle.getString("myticket");
            myTicketResponse = (new Gson()).fromJson(paymentString,MyTicketResponse.class);
        }
        initViews();
    }

    private void initViews(){
        myTicketsPresenter = new MyTicketsPresenter(this,this);
        if (myTicketResponse != null){
            txtTitle.setText(Validators.validateString(myTicketResponse.getDescription()));
            txtNoTicket.setText(String.valueOf(myTicketResponse.getId()));
            txtDate.setText(Validators.validateString(myTicketResponse.getRequestDate()));
            txtObservations.setText(Validators.validateString(myTicketResponse.getObservationsAdmin()));
            txtStatus.setText(myTicketResponse.getStatus() == 0 ? "Pendiente" : "Cancelado");
            btnCancel.setVisibility(myTicketResponse.getStatus() == 0 ? View.VISIBLE : View.GONE);
        }
    }

    @OnClick(R.id.dialog_myticket_delete)
    void onDeleteClick(){
        if (Connection.isConnected(this)){
            ActionTicketRequest actionTicketRequest = new ActionTicketRequest(myTicketResponse.getHoldingId(),myTicketResponse.getId());
            mProgressDialog = ProgressDialog.show(this,null,"Enviando...");
            mProgressDialog.setCancelable(false);
            myTicketsPresenter.deleteMyTicket(actionTicketRequest);
        }else{
            DesignUtils.showToast(this,this.getString(R.string.network_error));
        }
    }

    @OnClick(R.id.dialog_myticket_cancel)
    void onCancelClick(){
        if (Connection.isConnected(this)){
            ActionTicketRequest actionTicketRequest = new ActionTicketRequest(myTicketResponse.getHoldingId(),myTicketResponse.getId());
            mProgressDialog = ProgressDialog.show(this,null,"Enviando...");
            mProgressDialog.setCancelable(false);
            myTicketsPresenter.cancelMyTicket(actionTicketRequest);
        }else{
            DesignUtils.showToast(this,this.getString(R.string.network_error));
        }
    }

    @OnClick(R.id.dialog_myticket_view_file)
    void viewFile(){
        if (myTicketResponse.getFilePath() != null && !myTicketResponse.getFilePath().isEmpty()){
            Uri uri = Uri.parse(myTicketResponse.getFilePath());
            Intent intent = new Intent(Intent.ACTION_VIEW, uri);
            startActivity(intent);
        }else{
            DesignUtils.showToast(this,"Por el momento no se puede visualizar el documento");
        }
    }

    @Override
    public void onSuccessMyTickets(List<MyTicketResponse> ticketResponses) {

    }

    @Override
    public void onErrorMyTickets(String msg) {

    }

    @Override
    public void onSuccessCancel(String msg) {
        DesignUtils.showToast(this,msg);
        mProgressDialog.dismiss();
        finish();
    }

    @Override
    public void onErrorCancel(String msg) {
        DesignUtils.showToast(this,msg);
        mProgressDialog.dismiss();
    }

    @Override
    public void onSuccessDelete(String msg) {
        DesignUtils.showToast(this,msg);
        mProgressDialog.dismiss();
        finish();
    }


    @Override
    public void onErrorDelete(String msg) {
        DesignUtils.showToast(this,msg);
        mProgressDialog.dismiss();
    }
}
