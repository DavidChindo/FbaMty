package com.fibramty.fbmty.View.Adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.fibramty.fbmty.Network.Response.ServicesDescResponse;
import com.fibramty.fbmty.R;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by david.barrera on 5/17/18.
 */

public class ParkingsRequestAdapter extends RecyclerView.Adapter<ParkingsRequestAdapter.ViewHolder> {

    List<ServicesDescResponse> mServicesDesc;
    Context mContext;

    public ParkingsRequestAdapter(List<ServicesDescResponse> servicesDesc, Context context) {
        this.mServicesDesc = servicesDesc;
        this.mContext = context;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_services_req,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {

        ServicesDescResponse servicesDescResponse = mServicesDesc.get(position);

        if (servicesDescResponse != null){
            holder.title.setText(titleCard(servicesDescResponse.getDescription()));
            holder.numServices.setText(numberFormat(holder.title.getText().toString(),servicesDescResponse.getAvailables()));
            holder.rentNums.setText(mContext.getString(R.string.price,servicesDescResponse.getRentPrice()));
            holder.priceMtto.setText(mContext.getString(R.string.price,servicesDescResponse.getAmountPrice()));
            hideMtto(holder.title.getText().toString(),holder);
        }

    }

    @Override
    public int getItemCount() {
        return mServicesDesc == null ? 0 : mServicesDesc.size();
    }

    class ViewHolder extends RecyclerView.ViewHolder{

        @BindView(R.id.item_services_req_img)ImageView imageView;
        @BindView(R.id.item_services_req_title)TextView title;
        @BindView(R.id.item_services_req_num)TextView numServices;
        @BindView(R.id.item_services_req_rent_price)TextView rentNums;
        @BindView(R.id.item_services_req_divider_ver)View dividerVer;
        @BindView(R.id.item_services_req_mtto)TextView titleMtto;
        @BindView(R.id.item_services_req_mtto_num)TextView priceMtto;


        public ViewHolder(View itemView) {
            super(itemView);
            ButterKnife.bind(this,itemView);

        }
    }

    private String titleCard(String description){
        String title = "";
        if (description != null && !description.isEmpty()){
            if (description.toLowerCase().contains("contrato pool")){
                return  "Contrato Pool";
            }else if(description.toLowerCase().contains("contrato reservado")){
                return "Contrato Reservado";
            }else if(description.toLowerCase().contains("adicionales pool")){
                return "Adicionales Pool";
            }else if(description.toLowerCase().contains("adicionales reservado")){
                return "Adicionales Reservado";
            }else if(description.toLowerCase().contains("estacionamiento normal")){
                return "Normal";
            }else if(description.toLowerCase().contains("tag master")){
                return "Tag Master";
            }else if(description.toLowerCase().contains("cortesia")){
                return "Cortesías de Estacionamiento";
            }
        }
        return title;
    }

    private String numberFormat(String title, int counts){
        if (title.contains("Contrato") || title.contains("Adicionales")){
            return mContext.getString(R.string.num_boxes, counts);
        }else if (title.contains("Normal") || title.contains("Tag")){
            return mContext.getString(R.string.num_cards, counts);
        }else{
            return mContext.getString(R.string.num_courtesies, counts);
        }
    }

    private void hideMtto(String title,ViewHolder holder){
        if (title.contains("Normal") || title.contains("Tag") || title.contains("Estacionamiento")){
            holder.dividerVer.setVisibility(View.GONE);
            holder.titleMtto.setVisibility(View.GONE);
            holder.priceMtto.setVisibility(View.GONE);
        }else{
            holder.dividerVer.setVisibility(View.VISIBLE);
            holder.titleMtto.setVisibility(View.VISIBLE);
            holder.priceMtto.setVisibility(View.VISIBLE);
        }
    }

}

