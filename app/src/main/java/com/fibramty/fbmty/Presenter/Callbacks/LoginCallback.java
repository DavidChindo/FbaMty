package com.fibramty.fbmty.Presenter.Callbacks;

import com.fibramty.fbmty.Network.Response.LoginResponse;

/**
 * Created by david.barrera on 12/7/17.
 */

public interface LoginCallback {

    void onLoginSuccess(LoginResponse loginResponse);

    void onLoginError(String msg);
}
