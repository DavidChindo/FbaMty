package com.fibramty.fbmty.Library;

import android.app.Activity;
import android.widget.EditText;
import android.widget.RadioGroup;

import com.fibramty.fbmty.R;

import java.util.ArrayList;

/**
 * Created by david.barrera on 11/29/17.
 */

public class Validators {

    public static boolean validateEdt(EditText edt, Activity activity, String question){
        if (edt.getText().toString().trim().isEmpty()){
            edt.requestFocus();
            DesignUtils.errorMessage(activity,"Campo Obligatorio", activity.getString(R.string.validate_field, question));
            return false;
        }
        return true;
    }

    public static boolean validateRadioGroup(RadioGroup radioGroup, Activity activity, String question){
        if (radioGroup.getCheckedRadioButtonId() == -1)
        {
            radioGroup.requestFocus();
            radioGroup.setFocusable(true);
            radioGroup.setFocusableInTouchMode(true);
            DesignUtils.errorMessage(activity,"Campo Obligatorio", activity.getString(R.string.validate_field, question));
            return false;
        }
        return  true;
    }

    public static boolean validateArrayListString(ArrayList<String> arrayListl, Activity activity, String question){
        if (arrayListl.isEmpty() && arrayListl.size() <= 0 ){
            DesignUtils.errorMessage(activity,"Campo Obligatorio", activity.getString(R.string.validate_field, question));
            return false;
        }
        return true;
    }

    public static String validateString(String word){
        if (word != null && !word.isEmpty()){
            return word;
        } else{
            return "";
        }
    }
}
