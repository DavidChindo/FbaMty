package com.fibramty.fbmty.Presenter;

import android.content.Context;

import com.fibramty.fbmty.Presenter.Callbacks.MainCallback;

/**
 * Created by david.barrera on 12/6/17.
 */

public class MainPresenter {

    private final MainCallback mMainCallback;

    public MainPresenter(Context context, MainCallback mainCallback){
        this.mMainCallback = mainCallback;
    }

}
