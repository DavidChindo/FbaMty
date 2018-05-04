package com.fibramty.fbmty.View.Adapter;

import android.content.Context;
import android.support.annotation.LayoutRes;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.fibramty.fbmty.Network.Response.MyTicketResponse;
import com.fibramty.fbmty.R;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by david.barrera on 4/21/18.
 */

public class MyTicketsAdapter extends ArrayAdapter<MyTicketResponse> {

    private Context mContext;
    private List<MyTicketResponse> mMyTickets;

    public MyTicketsAdapter(@NonNull Context context, @LayoutRes int resource, List<MyTicketResponse> mMyTickets) {
        super(context, resource);
        this.mContext = context;
        this.mMyTickets = mMyTickets;
    }

    @Override
    public int getCount() {
        return mMyTickets.size();
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        ViewHolder holder = null;
        if (convertView == null){
            convertView = LayoutInflater.from(mContext).inflate(R.layout.item_my_tickets,null);
            holder = new ViewHolder(convertView);
            convertView.setTag(holder);
        }else{
            holder = (ViewHolder)convertView.getTag();
        }

        final MyTicketResponse myTicket = mMyTickets.get(position);


        holder.status.setText(myTicket.getStatus() == 0 ? "Pendiente" : "Cancelado");
        holder.ticket.setText(String.valueOf(myTicket.getId()));
        holder.date.setText(onlyDate(myTicket.getRequestDate()));

        return convertView;
    }

    class ViewHolder{
        @BindView(R.id.item_myticket_ticket)TextView ticket;
        @BindView(R.id.item_mytickets_date)TextView date;
        @BindView(R.id.item_myticket_status)TextView status;

        public ViewHolder(View v){
            ButterKnife.bind(this,v);
        }
    }

    private String onlyDate(String date){
        if (date != null && !date.isEmpty()){
            String[] datesSplit = date.split("T");
            return datesSplit[0];
        }else{
            return date;
        }
    }

}
