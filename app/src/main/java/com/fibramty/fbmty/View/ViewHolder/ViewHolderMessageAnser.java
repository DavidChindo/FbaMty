package com.fibramty.fbmty.View.ViewHolder;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import com.fibramty.fbmty.R;

/**
 * Created by david.barrera on 5/22/18.
 */

public class ViewHolderMessageAnser  extends RecyclerView.ViewHolder {

    public TextView txtView;

    public ViewHolderMessageAnser(View itemView) {
        super(itemView);

        txtView = (TextView)itemView.findViewById(R.id.item_message_answer_txt);
    }
}

