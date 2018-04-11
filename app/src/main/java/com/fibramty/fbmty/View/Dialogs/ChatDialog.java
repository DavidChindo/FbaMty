package com.fibramty.fbmty.View.Dialogs;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.RadioGroup;

import com.fibramty.fbmty.Presenter.Callbacks.ChatCallback;
import com.fibramty.fbmty.Presenter.ChatPresenter;
import com.fibramty.fbmty.R;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class ChatDialog extends Activity implements ChatCallback {

    @BindView(R.id.dialog_chat_edt_name)EditText nameEdt;
    @BindView(R.id.dialog_chat_edt_title)EditText titleEdt;
    @BindView(R.id.dialog_chat_edt_comments)EditText commentsEdt;
    @BindView(R.id.dialog_chat_rgb)RadioGroup chatRgb;



    ChatPresenter chatPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chat_dialog);
        ButterKnife.bind(this);
        chatPresenter = new ChatPresenter(this,this);
    }

    @OnClick(R.id.dialog_chat_add)
    void onChattingClick(){
        chatPresenter.valid(nameEdt);
    }

    @Override
    public void onValid(boolean isValid, String msg) {
        if (isValid){
            if (chatRgb.getCheckedRadioButtonId() > -1){
                chatPresenter.chatSent();
            }
        }
    }
}
