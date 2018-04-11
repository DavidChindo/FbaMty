package com.fibramty.fbmty.Network;

import com.fibramty.fbmty.Network.Request.LoginRequest;
import com.fibramty.fbmty.Network.Request.RegisterRequest;
import com.fibramty.fbmty.Network.Response.HoldingResponse;
import com.fibramty.fbmty.Network.Response.LoginResponse;

import java.util.List;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.Header;
import retrofit2.http.POST;

/**
 * Created by david.barrera on 12/7/17.
 */

public interface FbMtyWebService {

    @FormUrlEncoded
    @POST("token")
    Call<LoginResponse> login(@Field("grant_type") String grantType,
                              @Field("username") String username,
                              @Field("password") String password,
                              @Field("pushID") String pushID);

    @POST("api/MySpace/holdingsByUser")
    Call<List<HoldingResponse>> holdingByUser(@Header("Authorization") String authorization);

    @POST("api/Account/Register")
    Call<ResponseBody> register(@Body RegisterRequest registerRequest);
}
