package com.fibramty.fbmty.View.Dialogs;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

import com.fibramty.fbmty.Library.Validators;
import com.fibramty.fbmty.Network.Request.Models.Payment;
import com.fibramty.fbmty.R;
import com.google.gson.Gson;

import java.util.IllegalFormatCodePointException;

import butterknife.BindView;
import butterknife.ButterKnife;

public class PaymentDialog extends Activity {

    @BindView(R.id.dialog_payment_docto)TextView txtDocto;
    @BindView(R.id.dialog_payment_status)TextView txtStatus;
    @BindView(R.id.dialog_payment_date)TextView txtDate;
    @BindView(R.id.dialog_payment_amount)TextView txtAmount;
    @BindView(R.id.dialog_payment_currency)TextView txtCurrency;
    @BindView(R.id.dialog_payment_type_docto)TextView txtTypeDocto;
    @BindView(R.id.dialog_payment_desc)TextView txtDesc;

    Payment payment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_payment_dialog);
        ButterKnife.bind(this);
        Bundle bundle = getIntent().getExtras();
        if (bundle != null){
            String paymentString = bundle.getString("payment");
            payment = (new Gson()).fromJson(paymentString,Payment.class);
        }
        initViews();
    }

    private void initViews(){
        if (payment != null){
            txtDocto.setText(Validators.validateString(payment.getDocumentNumber()));
            txtStatus.setText(Validators.validateString(payment.getStatus()));
            txtDate.setText(Validators.validateString(payment.getDateValidity()));
            txtAmount.setText(Validators.validateString(payment.getAmount()));
            txtCurrency.setText(Validators.validateString(payment.getCurrency()));
            txtTypeDocto.setText(Validators.validateString(payment.getName()));
            txtDesc.setText(Validators.validateString(payment.getDescription()));
        }
    }
}
