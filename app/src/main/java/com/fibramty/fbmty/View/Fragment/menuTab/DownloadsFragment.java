package com.fibramty.fbmty.View.Fragment.menuTab;


import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.fibramty.fbmty.Presenter.Callbacks.DownloadCallback;
import com.fibramty.fbmty.R;
import com.fibramty.fbmty.View.Activity.MainActivity;
import com.fibramty.fbmty.View.Adapter.DownloadAdapter;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * Created by Chindo
 */

public class DownloadsFragment extends Fragment implements DownloadCallback{

    @BindView(R.id.fr_downloads_architect)ImageView imgArchitect;
    @BindView(R.id.fr_downloads_plans)TextView txtPlans;
    @BindView(R.id.fr_downloads_rv_others)RecyclerView recyclerView;
    @BindView(R.id.no_urls)TextView noData;

    private RecyclerView.LayoutManager mLayoutManager;

    public DownloadsFragment() {
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        initViews();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view =  inflater.inflate(R.layout.fragment_downloads, container, false);
        ButterKnife.bind(this, view);
        return view;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        Log.d("DownloadFragment","oNActivityCreated");
    }

    private void initViews(){
        if (MainActivity.holdingResponse != null){
            imgArchitect.setVisibility(MainActivity.holdingResponse.getArchitecturalPreview() != null &&
                    !MainActivity.holdingResponse.getArchitecturalPreview().isEmpty() ? View.VISIBLE : View.GONE);
            txtPlans.setVisibility(MainActivity.holdingResponse.getArchitecturalPreview() != null &&
                    !MainActivity.holdingResponse.getArchitecturalPreview().isEmpty() ? View.VISIBLE : View.GONE);

            if (MainActivity.holdingResponse.getOtroList() != null && MainActivity.holdingResponse.getOtroList().size() > 0) {
                mLayoutManager = new LinearLayoutManager(getContext());
                recyclerView.setLayoutManager(mLayoutManager);

                recyclerView.setAdapter(new DownloadAdapter(MainActivity.holdingResponse.getOtroList(), getActivity(), this));
            }else {
                recyclerView.setVisibility(View.GONE);
            }

            if (!imgArchitect.isShown() && !recyclerView.isShown()){
                noData.setVisibility(View.VISIBLE);
            }
        }
    }

    @OnClick({R.id.fr_downloads_architect,R.id.fr_downloads_plans})
    void onOpenPlans(){
        Uri uri = Uri.parse(MainActivity.holdingResponse.getArchitecturalPreview());
        Intent intent = new Intent(Intent.ACTION_VIEW, uri);
        startActivity(intent);
    }

    @Override
    public void onOpenUrl(String url) {
        if (url != null && !url.isEmpty()){
            Uri uri = Uri.parse(url);
            Intent intent = new Intent(Intent.ACTION_VIEW, uri);
            startActivity(intent);
        }
    }
}
