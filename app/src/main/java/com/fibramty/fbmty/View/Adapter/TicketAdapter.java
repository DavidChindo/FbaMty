package com.fibramty.fbmty.View.Adapter;

import android.content.Context;
import android.content.res.TypedArray;
import android.support.annotation.LayoutRes;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.constraint.solver.SolverVariable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.fibramty.fbmty.R;

import java.util.ArrayList;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by david.barrera on 12/8/17.
 */

public class TicketAdapter extends ArrayAdapter{

    private TypedArray mImageList;
    private String[] mTitles;
    private Context mContex;


    public TicketAdapter(@NonNull Context context, @LayoutRes int resource, TypedArray images, String[] titles) {
        super(context, resource);
        mContex = context;
        mImageList = images;
        mTitles = titles;
    }

    @Override
    public int getCount() {
        return mImageList.length();
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        ViewHolder holder = null;

        if (convertView == null){
            convertView = LayoutInflater.from(mContex).inflate(R.layout.item_ticket,null);
            holder = new ViewHolder(convertView);
            convertView.setTag(holder);
        }else{
            holder = (ViewHolder) convertView.getTag();
        }

        holder.title.setText(mTitles[position]);
        holder.image.setImageResource(mImageList.getResourceId(position,-1));

        return convertView;
    }

    class ViewHolder{

        @BindView(R.id.item_ticket_img)ImageView image;
        @BindView(R.id.item_ticket_title)TextView title;

        public ViewHolder(View view){
            ButterKnife.bind(this,view);
        }
    }
}
