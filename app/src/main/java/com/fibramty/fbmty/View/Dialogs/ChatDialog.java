package com.fibramty.fbmty.View.Dialogs;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.fibramty.fbmty.R;

import butterknife.ButterKnife;

public class ChatDialog extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chat_dialog);
        ButterKnife.bind(this);
    }
}
