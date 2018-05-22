package com.fibramty.fbmty.View.Adapter;

import android.app.Activity;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.fibramty.fbmty.Network.Response.MessageResponse;
import com.fibramty.fbmty.R;
import com.fibramty.fbmty.View.ViewHolder.ViewHolderMessageAnser;
import com.fibramty.fbmty.View.ViewHolder.ViewHolderMessageSent;

import io.realm.RealmList;

/**
 * Created by david.barrera on 5/22/18.
 */

public class MessageAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    public static final String TAG = "question_adapter";
    private final Activity context;

    private RealmList<MessageResponse> messages;
    private RecyclerView mRecyclerView;


    public MessageAdapter(Activity context, RealmList<MessageResponse> messageResponses, RecyclerView recyclerView) {
        this.messages= messageResponses;
        this.context = context;
        this.mRecyclerView = recyclerView;
    }


    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        MessageResponse message = messages.get(viewType);

        if (!message.isResponse()){
            View v = LayoutInflater.from(parent.getContext())
                    .inflate(R.layout.item_message_sent,parent,false);
            return new ViewHolderMessageSent(v);
        }else{
            View v = LayoutInflater.from(parent.getContext())
                    .inflate(R.layout.item_message_answe,parent,false);
            return new ViewHolderMessageAnser(v);
        }

    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {

        MessageResponse message = messages.get(position);

        if (!message.isResponse()){
            ViewHolderMessageSent viewHolderMessageSent = (ViewHolderMessageSent) holder;
            viewHolderMessageSent.txtView.setTag(message);
            viewHolderMessageSent.txtView.setText(message.getMessage());
        }else{
            ViewHolderMessageAnser viewHolderMessageAnser= (ViewHolderMessageAnser) holder;
            viewHolderMessageAnser.txtView.setTag(message);
            viewHolderMessageAnser.txtView.setText(message.getMessage());
        }

    }

    @Override
    public int getItemViewType(int position) {
        return position;
    }

    @Override
    public int getItemCount() {
        return messages.size();
    }

    public void setMessages(RealmList<MessageResponse> messageResponses){this.messages = messageResponses;}
}
