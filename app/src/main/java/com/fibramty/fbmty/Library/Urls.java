package com.fibramty.fbmty.Library;

import android.app.admin.ConnectEvent;
import android.content.Context;

import com.fibramty.fbmty.R;

/**
 * Created by david.barrera on 3/11/18.
 */

public class Urls {

    public static final int STAGE_QA = 1;
    public static final int STAGE_PRODUCTION = 2;

    public static String initStatics(Context context, int  mode){
        if (mode == STAGE_QA) {
            return context.getResources().getString(R.string.url_qa);
        }else if(mode == STAGE_PRODUCTION) {
            return context.getResources().getString(R.string.url_prod);
        }else{
            return context.getResources().getString(R.string.url_prod);
        }
    }

    public static String endPoint(Context context){
         return context.getResources().getString(R.string.url_qa);
    }
}
