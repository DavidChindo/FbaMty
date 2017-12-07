package com.fibramty.fbmty.Network;

import com.fibramty.fbmty.Network.Request.LoginRequest;
import com.fibramty.fbmty.Network.Response.LoginResponse;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Header;
import retrofit2.http.POST;

/**
 * Created by david.barrera on 12/7/17.
 */

public interface FbMtyWebService {

    @POST("")
    Call<LoginResponse> login(@Body LoginRequest loginRequest);
}
