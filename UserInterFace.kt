package com.example.postapidataview

import android.service.autofill.UserData
import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.Body
import retrofit2.http.POST

interface UserInterFace {
    @POST("users/signup")
    fun postUsersDetails(@Body user : Userdata): io.reactivex.Observable<DataModal>

    @POST("users/signin")
    fun postUsersLong(@Body user : Map<String,String>): io.reactivex.Observable<DataModal>

    companion object {
        fun create(): UserInterFace {
            val retrofit = Retrofit.Builder()
                .baseUrl("https://quoteapi.cyclic.app/")
                .addConverterFactory(GsonConverterFactory.create())
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .build()

            return retrofit.create(UserInterFace::class.java)
        }

    }
}