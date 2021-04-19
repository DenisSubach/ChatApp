package com.subach.chatapp.Fragments;

import com.subach.chatapp.Notifications.MyResponse;
import com.subach.chatapp.Notifications.Sender;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Headers;
import retrofit2.http.POST;

public interface APIService {
    @Headers(
            {
                    "Content-Type:application/json",
                    "Authorization:key=AAAACjNGSbY:APA91bE7BsAIwAKpGeWxxMhUNy19n6ZhRB7temqLeWBWFo5rdd3sSt6fzrFL6r9YPalIFTQ-2ULjR5pgEI2Y0gVNibkZsbYJKQDupjIEfb5JkicdwXVmZMyMtTioTC7IsrqdqNss8a17"
            }
    )

    @POST("fcm/send")
    Call<MyResponse> sendNotification(@Body Sender body);
}
