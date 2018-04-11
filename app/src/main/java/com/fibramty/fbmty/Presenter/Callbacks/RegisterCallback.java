package com.fibramty.fbmty.Presenter.Callbacks;

/**
 * Created by david.barrera on 4/10/18.
 */

public interface RegisterCallback {

    void onSuccessRegister(String msg);

    void onErrorRegister(String msg);

    void onValidFields(Boolean isValid,String msg);

    void onValidPassword(Boolean isEquals,String msg);
}
