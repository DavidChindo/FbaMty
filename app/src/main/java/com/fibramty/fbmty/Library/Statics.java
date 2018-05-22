package com.fibramty.fbmty.Library;

import com.fibramty.fbmty.Network.Request.Models.Maintenance;

import java.sql.Struct;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by david.barrera on 11/29/17.
 */

public class Statics {

    public static int OK = 200;
    public static int UNAUTHORIZED = 401;
    public static int BAD_REQUEST = 400;
    public static int INTERNAL_SERVER = 500;

    public static final String WM_PREFS = "prefsFbMty";
    public static final String LOGIN_PREFS = "prefsLogin";
    public static final String IS_FbMty_PREFS = "prefsFbMty";
    public static final String SELECTED_POSITION = "prefsPositionSelected";

    public static String PASS = "";

    public static final String NAME_FOLDER = "FbMty";

    public static final int SERVICE_PARKINGS = 0;
    public static final int SERVICE_CARDS = 1;
    public static final int SERVICE_COURTESIES = 2;
}

