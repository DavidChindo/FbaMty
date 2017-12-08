package com.fibramty.fbmty.View.Activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.widget.GridView;

import com.fibramty.fbmty.Library.DesignUtils;
import com.fibramty.fbmty.R;
import com.fibramty.fbmty.View.Adapter.TicketAdapter;
import com.fibramty.fbmty.View.Dialogs.TicketDialog;

import java.util.ArrayList;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnItemClick;

public class TicketActivity extends AppCompatActivity {

    @BindView(R.id.toolbar)Toolbar toolbar;
    @BindView(R.id.act_ticket_grid)GridView gridView;
    private String[] mTitles;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ticket);
        ButterKnife.bind(this);
        toolbar.setTitle("Ticket");
        initViews();

    }

    private  void initViews(){
        mTitles = getResources().getStringArray(R.array.tickets_titles);
        gridView.setAdapter(new TicketAdapter(this,R.layout.item_ticket,getResources().obtainTypedArray(R.array.tickets_images),
                mTitles));
    }

    @OnItemClick(R.id.act_ticket_grid)
    void onTicketSelected(int position){
        Intent intent = new Intent(this, TicketDialog.class);
        intent.putExtra("ticket",mTitles[position]);
        startActivity(intent);
        //DesignUtils.snackMessage(this,"Ticket seleccionado " + mTitles[position]);

    }
}
