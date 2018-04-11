package com.fibramty.fbmty.View.Adapter;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.fibramty.fbmty.Network.Request.Models.ActivityHolding;
import com.fibramty.fbmty.R;

import java.util.ArrayList;

import butterknife.BindView;
import butterknife.ButterKnife;
import io.realm.RealmList;

/**
 * Created by david.barrera on 1/25/18.
 */

public class ActivityAdapter extends ArrayAdapter<ActivityHolding> {

    private Context mContext;
    private RealmList<ActivityHolding> mActivities;

    public ActivityAdapter(Context context, int resource, RealmList<ActivityHolding> activities) {
        super(context, resource, activities);
        this.mContext = context;
        this.mActivities = activities;
    }

    @Override
    public int getCount() {
        return mActivities.size();
    }

    @Override
    public View getView(final int position, View convertView, ViewGroup parent) {
        ViewHolder holder = null;
        if (convertView == null) {
            convertView = LayoutInflater.from(mContext).inflate(R.layout.item_activity, null);
            holder = new ViewHolder(convertView);
            convertView.setTag(holder);
        } else {
            holder = (ViewHolder) convertView.getTag();
        }
        final ActivityHolding activityHolding = mActivities.get(position);
        if (activityHolding != null){
            holder.date.setText(activityHolding.getDateStart());
            holder.desc.setText(activityHolding.getDescription());
            Log.d("ActivityAdapter","descr "+activityHolding.getDescription());
        }

        return convertView;
    }

    class ViewHolder {

        @BindView(R.id.item_activity_date)
        TextView date;
        @BindView(R.id.item_activity_desc)
        TextView desc;
        @BindView(R.id.item_activity_notify)
        View notify;

        public ViewHolder(View v) {
            ButterKnife.bind(this, v);
        }
    }

}



