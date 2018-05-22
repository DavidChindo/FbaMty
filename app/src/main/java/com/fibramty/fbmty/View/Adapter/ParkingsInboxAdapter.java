package com.fibramty.fbmty.View.Adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.fibramty.fbmty.Library.LogicUtils;
import com.fibramty.fbmty.Network.Response.ServicesDataResponse;
import com.fibramty.fbmty.Network.Response.ServicesDescResponse;
import com.fibramty.fbmty.R;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by david.barrera on 5/18/18.
 */

public class ParkingsInboxAdapter extends RecyclerView.Adapter<ParkingsInboxAdapter.ViewHolder> {

    List<ServicesDataResponse> mServicesData;
    Context mContext;

    public ParkingsInboxAdapter(List<ServicesDataResponse> servicesData, Context context) {
        this.mServicesData = servicesData;
        this.mContext = context;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_services_data,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {

        ServicesDataResponse servicesDataResponse = mServicesData.get(position);

        if (servicesDataResponse != null){
            holder.ticket.setText(String.valueOf(servicesDataResponse.getId()));
            holder.dateRequest.setText(LogicUtils.formatterDate(servicesDataResponse.getRequestDate()));
            holder.action.setText(action(servicesDataResponse.getOption()));
            holder.status.setText(status(servicesDataResponse.getStatus()));
            holder.rentNum.setText(String.valueOf(servicesDataResponse.getCourtesiesNum()));
            setMtto(holder,servicesDataResponse.getMaintenanceNum());
        }

    }

    @Override
    public int getItemCount() {
        return mServicesData == null ? 0 : mServicesData.size();
    }

    class ViewHolder extends RecyclerView.ViewHolder{

        @BindView(R.id.item_services_data_txt_ticket)TextView ticket;
        @BindView(R.id.item_services_data_txt_request)TextView dateRequest;
        @BindView(R.id.item_services_data_txt_action)TextView action;
        @BindView(R.id.item_services_data_txt_status)TextView status;
        @BindView(R.id.item_services_data_txt_request_rent)TextView rentNum;
        @BindView(R.id.item_services_data_txt_mtto)TextView mttoNum;
        @BindView(R.id.item_services_data_rl_mtto)RelativeLayout rlMtto;


        public ViewHolder(View itemView) {
            super(itemView);
            ButterKnife.bind(this,itemView);

        }
    }

    private String status(int idStatus){
        switch(idStatus){
            case 0:
                return "Pendiente";
            case 1:
                return "En Atención";
            case 2:
                return "Autorizado";
            case 3:
                return "Cancelado";
            default:
                return "";
        }
    }

    private String action(int idAction){
        return idAction == 0 ? "Agregar" : "Eliminar";
    }

    private void setMtto(ViewHolder holder, int mttoNum){
        if (mttoNum > 0){
            holder.mttoNum.setText(String.valueOf(mttoNum));
            holder.rlMtto.setVisibility(View.VISIBLE);
        }else{
            holder.rlMtto.setVisibility(View.GONE);
        }
    }
}

