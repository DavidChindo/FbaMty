package com.fibramty.fbmty.Presenter.Callbacks;

/**
 * Created by david.barrera on 5/16/18.
 */

public interface ProfileCallback {

    void logoutSuccess(String msg);

    void logoutError(String msg);
}
