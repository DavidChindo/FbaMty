package com.fibramty.fbmty.View.Adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.fibramty.fbmty.Library.Validators;
import com.fibramty.fbmty.Presenter.Callbacks.DownloadCallback;
import com.fibramty.fbmty.R;

import butterknife.BindView;
import butterknife.ButterKnife;
import io.realm.RealmList;

/**
 * Created by david.barrera on 5/3/18.
 */

public class DownloadAdapter extends RecyclerView.Adapter<DownloadAdapter.ViewHolder> {

    RealmList<String> mUrls;
    Context mContext;
    DownloadCallback mDownloadCallback;

    public DownloadAdapter(RealmList<String> urls, Context context, DownloadCallback downloadCallback) {
        this.mUrls = urls;
        this.mContext = context;
        this.mDownloadCallback = downloadCallback;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_downloads_file,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {

        String url = mUrls.get(position);
        holder.title.setText(Validators.validateString(url));
        holder.container.setTag(url);
        holder.container.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mDownloadCallback.onOpenUrl(String.valueOf(view.getTag()));
            }
        });
    }

    @Override
    public int getItemCount() {
        return mUrls == null ? 0 : mUrls.size();
    }

    class ViewHolder extends RecyclerView.ViewHolder{

        @BindView(R.id.item_download)LinearLayout container;
        @BindView(R.id.item_download_title)TextView title;


        public ViewHolder(View itemView) {
            super(itemView);
            ButterKnife.bind(this,itemView);

        }
    }
}
