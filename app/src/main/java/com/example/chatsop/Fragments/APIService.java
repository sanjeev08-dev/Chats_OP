package com.example.chatsop.Fragments;

import com.example.chatsop.Notifications.MyResponse;
import com.example.chatsop.Notifications.Sender;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Headers;
import retrofit2.http.POST;

public interface APIService {
    @Headers(
            {
                    "Content-Type:application/json",
                    "Authorization:key=AAAAhX45dGQ:APA91bHqu6M0yFZfL8sbxb4xpEValFjE2I473hhd385j4etRfYbM1UCRJ7DkEDvqyjkaeWa7A5Na3DhpGmEI4lNuB5KnI1YbrfoWiWFYXNm0RL_RJSJ6748-4jlbxuhAWT6PCsa2w39-"
            }
    )

    @POST("fcm/send")
    Call<MyResponse> sendNotification(@Body Sender body);
}
