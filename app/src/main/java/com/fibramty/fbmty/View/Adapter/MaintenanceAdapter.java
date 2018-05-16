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

import com.fibramty.fbmty.Network.Request.Models.Maintenance;
import com.fibramty.fbmty.Network.Request.Models.Payment;
import com.fibramty.fbmty.R;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by david.barrera on 12/7/17.
 */

public class MaintenanceAdapter extends ArrayAdapter<Maintenance> {

    private Context mContext;
    private List<Maintenance> mMaintenances;

    public MaintenanceAdapter(@NonNull Context context, @LayoutRes int resource, @NonNull List<Maintenance> objects) {
        super(context, resource, objects);
        this.mContext = context;
        this.mMaintenances = objects;
    }

    @Override
    public int getCount() {
        return mMaintenances.size();
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        ViewHolder holder = null;
        if (convertView == null){
            convertView = LayoutInflater.from(mContext).inflate(R.layout.item_maintenance,null);
            holder = new ViewHolder(convertView);
            convertView.setTag(holder);
        }else{
            holder = (ViewHolder)convertView.getTag();
        }

        final Maintenance maintenance = mMaintenances.get(position);

        holder.title.setText(maintenance.getTitle());
        holder.description.setText(maintenance.getDescription());

        return convertView;
    }

    class ViewHolder{

        @BindView(R.id.item_maintenance_txt_title)TextView title;
        @BindView(R.id.item_maintenance_txt_description)TextView description;

        public ViewHolder(View v){
            ButterKnife.bind(this,v);
        }
    }
}
