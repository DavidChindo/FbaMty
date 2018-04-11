package com.fibramty.fbmty.Presenter;

import android.content.Context;
import android.widget.EditText;

import com.fibramty.fbmty.Library.Validators;
import com.fibramty.fbmty.Presenter.Callbacks.ChatCallback;
import com.fibramty.fbmty.R;

import java.util.List;

/**
 * Created by david.barrera on 4/11/18.
 */

public class ChatPresenter {

    private final ChatCallback mChatCallback;
    private Context mContext;

    public ChatPresenter(Context context, ChatCallback chatCallback){
        this.mChatCallback= chatCallback;
        this.mContext = context;
    }

    public void valid(EditText field){
        boolean isValid = true;
        String msg = "";
        if (Validators.validateEdt(field.getText().toString())) {
            isValid &= true;
        }else {
            msg = mContext.getString(R.string.validate_field, "Nombre");
            isValid &= false;
        }
        mChatCallback.onValid(isValid,msg);
    }

    public void chatSent(){}
}
