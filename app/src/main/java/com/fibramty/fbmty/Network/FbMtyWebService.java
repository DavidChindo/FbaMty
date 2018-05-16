package com.fibramty.fbmty.Network;

import com.fibramty.fbmty.Network.Request.ActionTicketRequest;
import com.fibramty.fbmty.Network.Request.LoginRequest;
import com.fibramty.fbmty.Network.Request.Models.Maintenance;
import com.fibramty.fbmty.Network.Request.Models.Payment;
import com.fibramty.fbmty.Network.Request.RegisterRequest;
import com.fibramty.fbmty.Network.Response.HoldingResponse;
import com.fibramty.fbmty.Network.Response.LoginResponse;
import com.fibramty.fbmty.Network.Response.MaintenanceResponse;
import com.fibramty.fbmty.Network.Response.MyTicketResponse;
import com.fibramty.fbmty.Network.Response.PaymentResponse;

import java.util.List;

import okhttp3.MultipartBody;
import okhttp3.RequestBody;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.Multipart;
import retrofit2.http.POST;
import retrofit2.http.Part;
import retrofit2.http.Path;

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

    @GET("api/MySpace/paymentsByHolding/0")
    Call<List<Payment>> payments(@Header("Authorization") String authorization);


    @GET("api/MySpace/getHoldingUserParkingLotsTickets/{idEdificio}")
    Call<ResponseBody> searchPayments(@Header("Authorization") String authorization,@Path("idEdificio") long idEdificio);

    @GET("api/MySpace/cajonesEstByUserAndHolding/{idEdificio}")
    Call<ResponseBody> parkingBoxesByHolding(@Header("Authorization") String authorization,@Path("idEdificio") long idEdificio);

    @Multipart
    @POST("api/MySpace/sendTicket")
    Call<Long> sendTicket(@Header("Authorization") String authorization,
                          @Part MultipartBody.Part file,
                          @Part("serviceId") RequestBody serviceId,
                          @Part("holdingId") RequestBody holdingId,
                          @Part("descripcion") RequestBody email);

    @FormUrlEncoded
    @POST("api/MySpace/cancelTicket")
    Call<ResponseBody> cancelTicket(@Header("Authorization")String authorization,
                                    @Field("holdingId") long idHolding,
                                    @Field("Id") long id);

    @FormUrlEncoded
    @POST("/api/MySpace/deleteTicket")
    Call<ResponseBody> deleteTicket(@Header("Authorization")String authorization,
                                    @Field("holdingId") long idHolding,
                                    @Field("Id") long id);

    @GET("api/MySpace/servicesByUserAndHolding/{idHolding}")
    Call<List<MyTicketResponse>> myTickets(@Header("Authorization")String authorization,@Path("idHolding") long idHolding);

    @GET("api/MySpace/maintenanceByHolding/{idHolding}")
    Call<List<Maintenance>> maintenances(@Header("Authorization")String authorization,@Path("idHolding") long idHolding);
}
