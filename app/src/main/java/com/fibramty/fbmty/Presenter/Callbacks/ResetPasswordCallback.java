package com.fibramty.fbmty.Presenter.Callbacks;

/**
 * Created by david.barrera on 7/12/18.
 */

public interface ResetPasswordCallback {

    void onSuccessResetPassword(String msg);

    void onErrorResetPassword(String msg);
}
