package com.fibramty.fbmty.View.Adapter;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.support.annotation.LayoutRes;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.fibramty.fbmty.Network.Request.Models.Payment;
import com.fibramty.fbmty.R;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by david.barrera on 12/7/17.
 */

public class PaymentsAdapter extends ArrayAdapter<Payment> {

    private Context mContext;
    private List<Payment> mPayments;

    public PaymentsAdapter(@NonNull Context context, @LayoutRes int resource,List<Payment> payments) {
        super(context, resource);
        this.mContext = context;
        this.mPayments = payments;
    }

    @Override
    public int getCount() {
        return mPayments.size();
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        ViewHolder holder = null;
        if (convertView == null){
            convertView = LayoutInflater.from(mContext).inflate(R.layout.item_payments,null);
            holder = new ViewHolder(convertView);
            convertView.setTag(holder);
        }else{
            holder = (ViewHolder)convertView.getTag();
        }

        final Payment payment = mPayments.get(position);

        holder.number.setText(payment.getDocumentNumber());
        holder.status.setText(payment.getStatus());
        holder.date.setText(payment.getDateValidity());
        holder.colorStatus.setBackgroundColor(colorStatus(payment.getStatus()));
        return convertView;
    }

    class ViewHolder{
        @BindView(R.id.item_payments_number)TextView number;
        @BindView(R.id.item_payments_date)TextView date;
        @BindView(R.id.item_payments_status)TextView status;
        @BindView(R.id.item_payments_color_status)View colorStatus;

        public ViewHolder(View v){
            ButterKnife.bind(this,v);
        }
    }

    private int colorStatus(String status){
        return status.toLowerCase().equals("pagada") ? mContext.getResources().getColor(R.color.green) : mContext.getResources().getColor(R.color.red);
    }

}
