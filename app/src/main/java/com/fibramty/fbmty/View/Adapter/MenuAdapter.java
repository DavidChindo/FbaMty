package com.fibramty.fbmty.View.Adapter;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.fibramty.fbmty.R;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by david.barrera on 4/17/18.
 */

public class MenuAdapter extends ArrayAdapter{

    private TypedArray mImages;
    private String[] mTitles;
    private int mLayout;

    public MenuAdapter(@NonNull Context context, int resource,TypedArray images, String[] titles) {
        super(context, resource);
        mImages = images;
        mTitles = titles;
        mLayout = resource;
    }

    @Override
    public int getCount() {
        return mImages.length();
    }

    @SuppressLint("InflateParams")
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        ViewHolder holder = null;
        if (convertView == null){
            convertView = LayoutInflater.from(getContext()).inflate(mLayout,null);
            holder = new ViewHolder(convertView);
            convertView.setTag(holder);
        }else{
            holder = (ViewHolder)convertView.getTag();
        }

        holder.title.setText(mTitles[position]);
        holder.img.setImageResource(mImages.getResourceId(position,-1));
        return convertView;
    }

    class ViewHolder{
        @BindView(R.id.act_menu_img)ImageView img;
        @BindView(R.id.act_menu_txt)TextView title;

        public ViewHolder(View view){
            ButterKnife.bind(this,view);
        }
    }
}
