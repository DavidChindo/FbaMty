package com.fibramty.fbmty.View.Activity;

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

import com.fibramty.fbmty.Library.DesignUtils;
import com.fibramty.fbmty.Library.Statics;
import com.fibramty.fbmty.Network.Request.Models.Payment;
import com.fibramty.fbmty.R;
import com.fibramty.fbmty.View.Adapter.PaymentsAdapter;
import com.fibramty.fbmty.View.Dialogs.ChatDialog;

import java.util.ArrayList;

import butterknife.BindDimen;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import fr.ganfra.materialspinner.MaterialSpinner;
import retrofit2.http.PATCH;

public class PaymentsActivity extends AppCompatActivity {

    @BindView(R.id.toolbar)Toolbar toolbar;
    @BindView(R.id.act_payments_lv_payments)ListView paymentslv;
    @BindView(R.id.act_payments_sp_month)MaterialSpinner spMonth;
    @BindView(R.id.act_payments_sp_year)MaterialSpinner spYear;
    private ArrayList<Payment> payments;

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
        payments = new ArrayList<Payment>();
        for (int i = 0; i < 4; i++){
            Payment payment = new Payment("2202","la rebelión no nace sólo, y forzosamente, " +
                    "en el oprimido, sino que puede nacer también ante el espectáculo de la opresión de " +
                    "que otro es víctima","Dos billones de euros","02-Febrero-2017","22-Febrero-2017","Pendiente","ReedWood");
            payments.add(payment);
        }
        paymentslv.setAdapter(new PaymentsAdapter(this,R.layout.item_payments,payments));
        spMonth.setAdapter(new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1, Statics.Months));
        spYear.setAdapter(new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1, Statics.Years));
    }

    //startRegionClick
    @OnClick(R.id.act_payment_fb_chat)
    void onOpenChat(){
        //DesignUtils.snackMessage(this,"Abrir modal enviar mensaje");
        startActivity(new Intent(this,ChatDialog.class));
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

}
