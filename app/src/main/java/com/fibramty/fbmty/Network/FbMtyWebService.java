package com.fibramty.fbmty.Network;

import com.fibramty.fbmty.Network.Request.Models.Maintenance;
import com.fibramty.fbmty.Network.Request.Models.Payment;
import com.fibramty.fbmty.Network.Request.RegisterRequest;
import com.fibramty.fbmty.Network.Request.ResetPasswordRequest;
import com.fibramty.fbmty.Network.Response.HoldingResponse;
import com.fibramty.fbmty.Network.Response.LoginResponse;
import com.fibramty.fbmty.Network.Response.MessageResponse;
import com.fibramty.fbmty.Network.Response.MyTicketResponse;
import com.fibramty.fbmty.Network.Response.ServicesDataResponse;
import com.fibramty.fbmty.Network.Response.ServicesDescResponse;

import java.util.List;

import io.realm.RealmList;
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

    @Multipart
    @POST("api/MySpace/sendTicket")
    Call<Long> sendTicket(@Header("Authorization") String authorization,
                          @Part MultipartBody.Part file,
                          @Part("serviceId") RequestBody serviceId,
                          @Part("holdingId") RequestBody holdingId,
                          @Part("descripcion") RequestBody email);

    @FormUrlEncoded
    @POST("api/MySpace/cancelTicket")
    Call<ResponseBody> cancelTicket(@Header("Authorization") String authorization,
                                    @Field("holdingId") long idHolding,
                                    @Field("Id") long id);

    @FormUrlEncoded
    @POST("api/MySpace/deleteTicket")
    Call<ResponseBody> deleteTicket(@Header("Authorization") String authorization,
                                    @Field("holdingId") long idHolding,
                                    @Field("Id") long id);

    @GET("api/MySpace/servicesByUserAndHolding/{idHolding}")
    Call<List<MyTicketResponse>> myTickets(@Header("Authorization") String authorization, @Path("idHolding") long idHolding);

    @GET("api/MySpace/maintenanceByHolding/{idHolding}")
    Call<List<Maintenance>> maintenances(@Header("Authorization") String authorization, @Path("idHolding") long idHolding);

    @GET("api/MySpace/cajonesEstByUserAndHolding/{idHolding}")
    Call<List<ServicesDescResponse>> cajonesEstByUserAndHolding(@Header("Authorization") String authorization, @Path("idHolding") long idHolding);

    @GET("api/MySpace/getHoldingUserParkingLotsTickets/{idHolding}")
    Call<List<ServicesDataResponse>> getHoldingUserParkingLotsTickets(@Header("Authorization") String authorization, @Path("idHolding") long idHolding);

    @GET("api/MySpace/tarjetasEstByUserAndHolding/{idHolding}")
    Call<List<ServicesDescResponse>> tarjetasEstByUserAndHolding(@Header("Authorization") String authorization, @Path("idHolding") long idHolding);

    @GET("api/MySpace/getHoldingUserParkingMembershipsTickets/{idHolding}")
    Call<List<ServicesDataResponse>> getHoldingUserParkingMembershipsTickets(@Header("Authorization") String authorization, @Path("idHolding") long idHolding);

    @GET("api/MySpace/CortesiasEstByUserAndHolding/{idHolding}")
    Call<List<ServicesDescResponse>> CortesiasEstByUserAndHolding(@Header("Authorization") String authorization, @Path("idHolding") long idHolding);

    @GET("api/MySpace/getHoldingUserParkingCardsTickets/{idHolding}")
    Call<List<ServicesDataResponse>> getHoldingUserParkingCardsTickets(@Header("Authorization") String authorization, @Path("idHolding") long idHolding);

    @FormUrlEncoded
    @POST("api/MySpace/sendCajonesEstTickets")
    Call<Long> sendCajonesEstTickets(@Header("Authorization") String authorization,
                                    @Field("parkingHoldingId") long idHolding,
                                    @Field("holdingId") long id,
                                    @Field("numCortesias") int numCortesias,
                                    @Field("numMntos") int numMntos,
                                    @Field("precioCortesia") int precioCortesia,
                                    @Field("precioMnto") int precioMnto,
                                    @Field("tipoAccion") int tipoAccion);

    @FormUrlEncoded
    @POST("api/MySpace/sendTarjetasEstTickets")
    Call<Long> sendTarjetasEstTickets(@Header("Authorization") String authorization,
                                             @Field("parkingHoldingId") long idHolding,
                                             @Field("holdingId") long id,
                                             @Field("numCortesias") int numCortesias,
                                             @Field("precioCortesia") int priceCortesias);

    @FormUrlEncoded
    @POST("api/MySpace/sendCortesiasEstTickets")
    Call<Long> sendCortesiasEstTickets(@Header("Authorization") String authorization,
                                              @Field("parkingHoldingId") long idHolding,
                                              @Field("holdingId") long id,
                                              @Field("numCortesias") int numCortesias,
                                              @Field("precioCortesia") int priceCortesias);

    @POST("api/Account/Logout")
    Call<ResponseBody> logOut(@Header("Authorization") String authorization);

    @GET("api/MySpace/getHoldingUserMessages/{idHolding}")
    Call<RealmList<MessageResponse>> messages(@Header("Authorization")String authorization, @Path("idHolding") long idHolding);

    @FormUrlEncoded
    @POST("api/MySpace/sendMessage")
    Call<Boolean> sentMessage(@Header("Authorization") String authorization,
                              @Field("holdingId")long idHolding,
                              @Field("message")String message);

    @POST("Home/ResetPassword")
    Call<ResponseBody> resetPassword(@Body ResetPasswordRequest resetPasswordRequest);
}
