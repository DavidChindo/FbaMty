package com.fibramty.fbmty.View.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.fibramty.fbmty.Network.Request.Models.Service;
import com.fibramty.fbmty.R;

import java.util.ArrayList;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by david.barrera on 1/25/18.
 */

public class ServicesAdapter extends ArrayAdapter<Service> {

    private Context mContext;
    private ArrayList<Service> mServices;

    public ServicesAdapter(Context context, int resource, ArrayList<Service> services) {
        super(context, resource, services);
        this.mContext = context;
        this.mServices = services;
    }

    @Override
    public int getCount() {
        return mServices.size();
    }

    @Override
    public View getView(final int position, View convertView, ViewGroup parent) {
        ViewHolder holder = null;
        if (convertView == null) {
            convertView = LayoutInflater.from(mContext).inflate(R.layout.item_services, null);
            holder = new ViewHolder(convertView);
            convertView.setTag(holder);
        } else {
            holder = (ViewHolder) convertView.getTag();
        }
        final Service service = mServices.get(position);
        if (service != null){
            holder.text.setText(service.getTitle());
        }

        return convertView;
    }

    class ViewHolder {

        @BindView(R.id.item_services_text)
        TextView text;
        @BindView(R.id.item_services_img)
        ImageView img;

        public ViewHolder(View v) {
            ButterKnife.bind(this, v);
        }
    }

}

