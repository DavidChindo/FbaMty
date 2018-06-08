package com.fibramty.fbmty.View.Activity;

import android.app.ProgressDialog;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import com.facebook.shimmer.ShimmerFrameLayout;
import com.fibramty.fbmty.Library.DesignUtils;
import com.fibramty.fbmty.Library.Statics;
import com.fibramty.fbmty.Network.Request.Models.Payment;
import com.fibramty.fbmty.Network.Response.MyTicketResponse;
import com.fibramty.fbmty.Presenter.Callbacks.MyTicketsCallback;
import com.fibramty.fbmty.Presenter.MyTicketsPresenter;
import com.fibramty.fbmty.Presenter.PaymentsPresenter;
import com.fibramty.fbmty.R;
import com.fibramty.fbmty.View.Adapter.MyTicketsAdapter;
import com.fibramty.fbmty.View.Dialogs.MyTicketDialog;
import com.fibramty.fbmty.View.Dialogs.PaymentDialog;
import com.google.gson.Gson;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnItemClick;

public class MyTicketsActivity extends AppCompatActivity implements MyTicketsCallback{

    @BindView(R.id.toolbar)Toolbar toolbar;
    @BindView(R.id.no_my_tickets)TextView txtNoData;
    @BindView(R.id.act_mytickets_lv_tickets)ListView lvMyTickets;
    @BindView(R.id.shimmer_view_container)ShimmerFrameLayout shimmerFrameLayout;
    List<MyTicketResponse> mMyTickets;
    MyTicketsPresenter myTicketsPresenter;
    ProgressDialog mProgressDialog;
    MyTicketsAdapter myTicketsAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_tickets);
        ButterKnife.bind(this);
        toolbar.setTitle("Mis Tickets");
        initViews();

    }

    private void initViews(){
        mMyTickets = new ArrayList<MyTicketResponse>();
        myTicketsPresenter = new MyTicketsPresenter(this,this);


    }

    @Override
    protected void onResume() {
        super.onResume();
        /*mProgressDialog = ProgressDialog.show(this,null,"Cargando...");
        mProgressDialog.setCancelable(false);*/
        myTicketsPresenter.myTickets(MainActivity.holdingResponse.getId());
        shimmerFrameLayout.startShimmerAnimation();
    }

    @OnItemClick(R.id.act_mytickets_lv_tickets)
    void onOpenPayments(int position){
        Intent intent = new Intent(this, MyTicketDialog.class);
        intent.putExtra("myticket",(new Gson()).toJson(mMyTickets.get(position)));
        startActivity(intent);
    }

    @Override
    public void onSuccessMyTickets(List<MyTicketResponse> ticketResponses) {
        if (ticketResponses != null && ticketResponses.size() > 0) {
            mMyTickets = ticketResponses;
            lvMyTickets.setAdapter(new MyTicketsAdapter(this, R.layout.item_my_tickets, mMyTickets));
            lvMyTickets.setVisibility(View.VISIBLE);
            txtNoData.setVisibility(View.GONE);
        }else{
            lvMyTickets.setVisibility(View.GONE);
            txtNoData.setVisibility(View.VISIBLE);
        }
        shimmerFrameLayout.setVisibility(View.GONE);
        shimmerFrameLayout.stopShimmerAnimation();
        //mProgressDialog.dismiss();
    }

    @Override
    public void onErrorMyTickets(String msg) {
        DesignUtils.errorMessage(this,"Mis tickets",msg);
        lvMyTickets.setVisibility(View.GONE);
        txtNoData.setVisibility(View.VISIBLE);
        shimmerFrameLayout.setVisibility(View.GONE);
        shimmerFrameLayout.stopShimmerAnimation();
        //mProgressDialog.dismiss();
    }

    @Override
    public void onSuccessCancel(String msg) {
        DesignUtils.errorMessage(this,"Mis tickets",msg);
        mProgressDialog.dismiss();
        mProgressDialog = ProgressDialog.show(this,null,"Cargando...");
        mProgressDialog.setCancelable(false);
        myTicketsPresenter.myTickets(MainActivity.holdingResponse.getId());
    }

    @Override
    public void onErrorCancel(String msg) {
        DesignUtils.errorMessage(this,"Mis tickets",msg);
        mProgressDialog.dismiss();
    }

    @Override
    public void onSuccessDelete(String msg) {
        DesignUtils.errorMessage(this,"Mis tickets",msg);
        mProgressDialog.dismiss();
        mProgressDialog = ProgressDialog.show(this,null,"Cargando...");
        mProgressDialog.setCancelable(false);
        myTicketsPresenter.myTickets(MainActivity.holdingResponse.getId());
    }


    @Override
    public void onErrorDelete(String msg) {
        DesignUtils.errorMessage(this,"Mis tickets",msg);
        mProgressDialog.dismiss();
    }
}
