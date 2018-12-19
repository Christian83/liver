package com.liverpool.liverpool.modules.repository;

import java.io.IOException;

import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class DataModule {

    private static Retrofit retrofit = null;

    public static Retrofit getClient() {
        HttpLoggingInterceptor interceptor = new HttpLoggingInterceptor();
        interceptor.setLevel(HttpLoggingInterceptor.Level.BODY);
        OkHttpClient.Builder httpClient = new OkHttpClient.Builder();
        httpClient.addInterceptor(new Interceptor() {
            @Override
            public Response intercept(Chain chain) throws IOException {
                Request original = chain.request();

                // Customize the request
                Request request = original.newBuilder()
                        .addHeader("content-type","application/json")
                        .addHeader("connection","keep-alive")
                        .addHeader("cache-control","max-age=0")
                        .build();

                Response response = chain.proceed(request);

                // Customize or return the response
                return response;
            }
        });
        OkHttpClient client = httpClient.build();

        retrofit = new Retrofit.Builder()
                .baseUrl("https://shoppapp.liverpool.com.mx/")
                .addConverterFactory(GsonConverterFactory.create())
                .client(client)
                .build();

        return retrofit;
    }
}
