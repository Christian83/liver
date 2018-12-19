package com.liverpool.liverpool.modules.repository.plp;

import com.liverpool.liverpool.modules.repository.viewmodel.PLPResponse;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface PLPRemote {

    @GET("appclienteservices/services/v3/plp")
    Call<PLPResponse> getProduct(@Query("search-string") String search, @Query("page-number") int page);
}
