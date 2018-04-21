package com.fibramty.fbmty.View.Activity;

import android.app.AlertDialog;
import android.app.ProgressDialog;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.ContextMenu;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import com.fibramty.fbmty.Library.DesignUtils;
import com.fibramty.fbmty.Library.Statics;
import com.fibramty.fbmty.Network.Request.Models.Payment;
import com.fibramty.fbmty.Presenter.Callbacks.PaymentsCallback;
import com.fibramty.fbmty.Presenter.PaymentsPresenter;
import com.fibramty.fbmty.R;
import com.fibramty.fbmty.View.Adapter.PaymentsAdapter;
import com.fibramty.fbmty.View.Dialogs.ChatDialog;
import com.fibramty.fbmty.View.Dialogs.PaymentDialog;
import com.google.gson.Gson;

import java.util.ArrayList;
import java.util.List;

import javax.crypto.spec.DESedeKeySpec;

import butterknife.BindDimen;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import butterknife.OnItemClick;
import fr.ganfra.materialspinner.MaterialSpinner;
import retrofit2.http.PATCH;

public class PaymentsActivity extends AppCompatActivity implements PaymentsCallback {

    @BindView(R.id.toolbar)Toolbar toolbar;
    @BindView(R.id.act_payments_lv_payments)ListView paymentslv;
    @BindView(R.id.act_payments_sp_month)MaterialSpinner spMonth;
    @BindView(R.id.act_payments_sp_year)MaterialSpinner spYear;
    @BindView(R.id.no_payments)TextView noPayments;
    private List<Payment> mPayments;
    private PaymentsPresenter paymentsPresenter;
    ProgressDialog mProgressDialog;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_payments);
        ButterKnife.bind(this);
        toolbar.setTitle("Consulta de Pagos");
        initViews();
        setSupportActionBar(toolbar);
        getSupportActionBar().setHomeButtonEnabled(true);

    }

    private void initViews(){
        mPayments = new ArrayList<Payment>();
        paymentsPresenter = new PaymentsPresenter(this,this);
        spMonth.setAdapter(new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1, Statics.Months));
        spYear.setAdapter(new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1, Statics.Years));
        mProgressDialog = ProgressDialog.show(this, null, "Descargando...");
        mProgressDialog.setCancelable(false);
        paymentsPresenter.payments();
    }

    //startRegionClick
    @OnClick(R.id.act_payment_fb_chat)
    void onOpenChat(){
        startActivity(new Intent(this,ChatDialog.class));
    }

    @OnItemClick(R.id.act_payments_lv_payments)
    void onOpenPayments(int position){
        Intent intent = new Intent(this, PaymentDialog.class);
        intent.putExtra("payment",(new Gson()).toJson(mPayments.get(position)));
        startActivity(intent);
    }

    //Endregion

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.payment_menu,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle item selection
        switch (item.getItemId()) {
            case R.id.act_payment_download:
                DesignUtils.snackMessage(this,"Descargando Instructivo de pago");
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }

    @Override
    public void onPaymentsSuccess(List<Payment> payments) {
        if (payments != null && payments.size() > 0){
            mPayments = payments;
            paymentslv.setAdapter(new PaymentsAdapter(PaymentsActivity.this,R.layout.item_payments,payments));
            noPayments.setVisibility(View.GONE);
            paymentslv.setVisibility(View.VISIBLE);
        }else{
            noPayments.setVisibility(View.GONE);
            paymentslv.setVisibility(View.VISIBLE);
        }
        mProgressDialog.cancel();
    }

    @Override
    public void onPaymentsError(String msg) {
        DesignUtils.errorMessage(this,"Pagos",msg);
        noPayments.setVisibility(View.VISIBLE);
        paymentslv.setVisibility(View.GONE);
        mProgressDialog.cancel();
    }
}
