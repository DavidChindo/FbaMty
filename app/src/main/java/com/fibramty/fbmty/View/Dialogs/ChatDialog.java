package com.fibramty.fbmty.View.Dialogs;

import android.app.Activity;
import android.app.ProgressDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.RadioGroup;
import android.widget.TextView;


import com.fibramty.fbmty.Library.DesignUtils;
import com.fibramty.fbmty.Network.Response.MessageResponse;
import com.fibramty.fbmty.Presenter.Callbacks.ChatCallback;
import com.fibramty.fbmty.Presenter.ChatPresenter;
import com.fibramty.fbmty.R;
import com.fibramty.fbmty.View.Activity.MainActivity;
import com.fibramty.fbmty.View.Adapter.MessageAdapter;
import com.fibramty.fbmty.View.Adapter.ParkingsRequestAdapter;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import io.realm.RealmList;

public class ChatDialog extends AppCompatActivity implements ChatCallback {

    @BindView(R.id.dialog_chat_edt_comments)EditText msgEdt;
    @BindView(R.id.fr_chat_recycler)RecyclerView recyclerView;
    @BindView(R.id.fr_chat_btn_send)ImageButton btnSend;
    @BindView(R.id.no_messages)TextView txtMsg;
    @BindView(R.id.chat_toolbar)Toolbar toolbar;

    private RecyclerView.LayoutManager mLayoutManager;
    RealmList<MessageResponse> mMessages;
    ProgressDialog mProgressDialog;

    ChatPresenter chatPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chat_dialog);
        ButterKnife.bind(this);

        toolbar.setTitle("Chat");
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        chatPresenter = new ChatPresenter(this,this);
        chatPresenter.messages(MainActivity.holdingResponse.getId());
    }

    @OnClick(R.id.fr_chat_btn_send)
    void onChattingClick(){
        mProgressDialog = ProgressDialog.show(this, null, "Enviando...");
        mProgressDialog.setCancelable(false);
        chatPresenter.valid(msgEdt);
    }

    @Override
    public void onLoadMessages(RealmList<MessageResponse> messages) {

        mMessages = messages;
        mLayoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(mLayoutManager);

        recyclerView.setAdapter(new MessageAdapter(this,mMessages,recyclerView));

        recyclerView.getLayoutManager().smoothScrollToPosition(recyclerView,null, mMessages.size()-1);

    }

    @Override
    public void onErrrorMessages(String msg) {
        DesignUtils.errorMessage(this,"",msg);
        recyclerView.setVisibility(View.GONE);
        txtMsg.setVisibility(View.VISIBLE);
    }

    @Override
    public void onSuccessSentMessage(boolean isSent) {
        mProgressDialog.dismiss();
        msgEdt.setText("");
        msgEdt.clearFocus();
        DesignUtils.hideKeyboard(this);
        if (isSent){
            chatPresenter.messages(MainActivity.holdingResponse.getId());
        }
    }

    @Override
    public void onErrorSentMessage(String msg) {
        mProgressDialog.dismiss();
        DesignUtils.errorMessage(this,"",msg);
    }

    @Override
    public void onValid(boolean isValid, String msg) {
        if (isValid){
            chatPresenter.chatSent(msgEdt.getText().toString(), MainActivity.holdingResponse.getId());
        }
    }
}
