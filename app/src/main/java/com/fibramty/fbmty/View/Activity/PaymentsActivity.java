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
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

import com.facebook.shimmer.ShimmerFrameLayout;
import com.fibramty.fbmty.Dal.RealmManager;
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

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import butterknife.OnItemClick;
import fr.ganfra.materialspinner.MaterialSpinner;
import io.realm.Realm;

public class PaymentsActivity extends AppCompatActivity implements PaymentsCallback {

    @BindView(R.id.toolbar)Toolbar toolbar;
    @BindView(R.id.act_payments_lv_payments)ListView paymentslv;
    @BindView(R.id.act_payments_sp_month)MaterialSpinner spMonth;
    @BindView(R.id.act_payments_rgb)RadioGroup rgbPayed;
    @BindView(R.id.act_payment_rb_payed)RadioButton rbPayed;
    @BindView(R.id.act_payment_rb_notpayed)RadioButton rbNotPayed;
    @BindView(R.id.no_payments)TextView noPayments;
    @BindView(R.id.shimmer_view_container)ShimmerFrameLayout shimmerFrameLayout;
    @BindView(R.id.act_payments_header)LinearLayout paymentHeaderLn;

    private List<Payment> mPayments;
    private PaymentsPresenter paymentsPresenter;
    ProgressDialog mProgressDialog;
    List<String> datesFiltes;

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
        datesFiltes = new ArrayList<String>();
        paymentsPresenter = new PaymentsPresenter(this,this);
        /*mProgressDialog = ProgressDialog.show(this, null, "Descargando...");
        mProgressDialog.setCancelable(false);*/
        shimmerFrameLayout.startShimmerAnimation();
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

    @OnClick(R.id.act_payments_btn_search)
    void onSearchPayments(){
        if (spMonth.getSelectedItemPosition() != AdapterView.INVALID_POSITION && rgbPayed.getCheckedRadioButtonId() > 0){
            String paymented = rgbPayed.getCheckedRadioButtonId() == R.id.act_payment_rb_payed ? rbPayed.getText().toString() : rbNotPayed.getText().toString();
            paymentsPresenter.paymentsFilter(((String)spMonth.getSelectedItem()),paymented);
        }
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
    public void onPaymentsSuccess(List<Payment> payments, boolean isFilter) {
        if (!isFilter) {
            mPayments = payments;
            Realm realm = Realm.getDefaultInstance();
            RealmManager.insert(realm, mPayments);
            datesFiltes = RealmManager.listUnique(realm);
            realm.close();
            spMonth.setAdapter(new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, datesFiltes));
            //mProgressDialog.cancel();
            shimmerFrameLayout.setVisibility(View.GONE);
            shimmerFrameLayout.stopShimmerAnimation();
        }
        if (payments != null && payments.size() > 0) {
            paymentslv.setAdapter(new PaymentsAdapter(PaymentsActivity.this, R.layout.item_payments, payments));
            paymentHeaderLn.setVisibility(View.VISIBLE);
            noPayments.setVisibility(View.GONE);
            paymentslv.setVisibility(View.VISIBLE);
        } else {
            paymentHeaderLn.setVisibility(View.GONE);
            noPayments.setVisibility(View.GONE);
            paymentslv.setVisibility(View.VISIBLE);
        }
    }

    @Override
    public void onPaymentsError(String msg) {
        DesignUtils.errorMessage(this,"Pagos",msg);
        noPayments.setVisibility(View.VISIBLE);
        paymentslv.setVisibility(View.GONE);
        paymentHeaderLn.setVisibility(View.GONE);
        //mProgressDialog.cancel();
        shimmerFrameLayout.setVisibility(View.GONE);
        shimmerFrameLayout.stopShimmerAnimation();
    }
}
