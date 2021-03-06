package com.fibramty.fbmty.Library;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.support.design.widget.Snackbar;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AlertDialog;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.Toast;

import com.fibramty.fbmty.R;

import org.aviran.cookiebar2.CookieBar;

/**
 * Created by david.barrera on 11/29/17.
 */

public class DesignUtils {

    public static void successMessage(Activity activity, String title, String message){
        CookieBar.Build(activity)
                .setTitle(title)
                .setMessage(message)
                .setBackgroundColor(R.color.green)
                .setTitleColor(R.color.colorWhite)
                .show();
    }

    public static void infoMessage(Activity activity, String title, String message){
        CookieBar.Build(activity)
                .setTitle(title)
                .setMessage(message)
                .setBackgroundColor(R.color.colorPrimaryDark)
                .setTitleColor(R.color.colorWhite)
                .show();
    }

    public static void errorMessage(Activity activity, String title, String message){
        CookieBar.Build(activity)
                .setTitle(title)
                .setMessage(message)
                .setBackgroundColor(R.color.red)
                .setTitleColor(R.color.colorWhite)
                .show();
    }

    public static void errorMessage(Activity activity, String title, int message){
        CookieBar.Build(activity)
                .setTitle(title)
                .setMessage(message)
                .setBackgroundColor(R.color.red)
                .setTitleColor(R.color.colorWhite)
                .show();
    }

    public static void warningMessage(Activity activity, String title, String message){
        CookieBar.Build(activity)
                .setTitle(title)
                .setMessage(message)
                .setBackgroundColor(R.color.orange)
                .setTitleColor(R.color.colorWhite)
                .show();
    }

    public static void snackMessage(Activity activity, String message){
        snack(activity.findViewById(android.R.id.content), message, null, null);

    }

    public static void showToast(Context context,String message){
        Toast.makeText(context,message,Toast.LENGTH_SHORT).show();
    }

    public static void setListViewHeightBasedOnChildrenAdapter(ListView listView) {
        ListAdapter listAdapter = listView.getAdapter();
        if (listAdapter == null) {
            return;
        }

        int desiredWidth = View.MeasureSpec.makeMeasureSpec(listView.getWidth(), View.MeasureSpec.UNSPECIFIED);
        int totalHeight = 0;
        View view = null;
        for (int i = 0; i < listAdapter.getCount(); i++) {
            view = listAdapter.getView(i, view, listView);
            if (i == 0)
                // This next line is needed before you call measure or else you won't get measured height at all. The listitem needs to be drawn first to know the height.
                view.setLayoutParams(new LinearLayout.LayoutParams(LinearLayout.LayoutParams.WRAP_CONTENT, LinearLayout.LayoutParams.WRAP_CONTENT));

            view.measure(desiredWidth, View.MeasureSpec.UNSPECIFIED);
            totalHeight += view.getMeasuredHeight();
        }
        ViewGroup.LayoutParams params = listView.getLayoutParams();
        params.height = totalHeight + (listView.getDividerHeight() * (listAdapter.getCount() - 1));
        listView.setLayoutParams(params);
        listView.requestLayout();
    }

    public static void hideKeyboard(Activity activity) {
        View view = activity.getCurrentFocus();
        if (view != null) {
            InputMethodManager inputManager = (InputMethodManager) activity.getSystemService(Context.INPUT_METHOD_SERVICE);
            inputManager.hideSoftInputFromWindow(view.getWindowToken(), InputMethodManager.HIDE_NOT_ALWAYS);
        }
    }

    public static int getToolbarHeight(Context context) {
        return (int) context.getResources().getDimension(R.dimen.abc_action_bar_default_height_material);
    }

    public static int getStatusBarHeight(Context context) {
        return (int) context.getResources().getDimension(R.dimen.status_bar_size);
    }

    public static String validateCredentials(Context contex,String username,String password){
        if (Connection.isConnected(contex)) {
            if (username.isEmpty() && password.isEmpty()) {
                return "Favor de ingresar usuario y contraseña";
            } else {
                if (!username.isEmpty()) {
                    if (!password.isEmpty()) {
                        return "";
                    } else {
                        return "La contraseña es requerida";
                    }
                } else {
                    return "El usuario es requerido";
                }
            }
        }else{
            return "No hay conexión a internet";
        }
    }

    public static void snack(View view, String message, Integer actionMessage, View.OnClickListener action) {
        if (view.getResources() != null) {
            Snackbar snackbar = Snackbar.make(view, message, Snackbar.LENGTH_LONG);
            if (actionMessage != null) {
                snackbar.setAction(actionMessage, action);
            }
            snackbar.getView().setBackgroundColor(ContextCompat.getColor(view.getContext(), R.color.colorPrimaryDark));
            snackbar.show();
        }
    }

    public static  void showDialog(String title, String msg, final Context context){
        AlertDialog.Builder builder;
        builder = new AlertDialog.Builder(context);
        builder.setCancelable(false);
        builder.setTitle(title)
                .setMessage(msg)
                .setPositiveButton(R.string.accept, new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.dismiss();
                    }
                })
                .show();
    }

    public static  void showDialogWithFinish(String title, String msg, final Activity activity){
        AlertDialog.Builder builder;
        builder = new AlertDialog.Builder(activity);
        builder.setCancelable(false);
        builder.setTitle(title)
                .setMessage(msg)
                .setPositiveButton(R.string.accept, new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.dismiss();
                        activity.finish();
                    }
                })
                .show();
    }
}
