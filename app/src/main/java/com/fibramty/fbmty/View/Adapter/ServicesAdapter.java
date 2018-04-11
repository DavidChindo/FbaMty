package com.fibramty.fbmty.View.Adapter;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.ahmadrosid.svgloader.SvgLoader;
import com.bumptech.glide.Glide;
import com.bumptech.glide.load.engine.DiskCacheStrategy;
import com.fibramty.fbmty.Library.Urls;
import com.fibramty.fbmty.Network.Request.Models.Service;
import com.fibramty.fbmty.R;

import java.util.ArrayList;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by david.barrera on 1/25/18.
 */

public class ServicesAdapter extends ArrayAdapter<Service> {

    private Activity mActivity;
    private ArrayList<Service> mServices;

    public ServicesAdapter(Activity context, int resource, ArrayList<Service> services) {
        super(context, resource, services);
        this.mActivity = context;
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
            convertView = LayoutInflater.from(mActivity).inflate(R.layout.item_services, null);
            holder = new ViewHolder(convertView);
            convertView.setTag(holder);
        } else {
            holder = (ViewHolder) convertView.getTag();
        }
        final Service service = mServices.get(position);
        if (service != null){
            holder.text.setText(service.getTitle());

            SvgLoader.pluck()
                    .with(mActivity)
                    .setPlaceHolder(R.drawable.ico_gas, R.drawable.ico_gas)
                    .load(Urls.endPoint(mActivity)+service.getIcon()+".svg", holder.img);
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

