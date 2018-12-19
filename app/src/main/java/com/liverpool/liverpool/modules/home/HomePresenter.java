package com.liverpool.liverpool.modules.home;

import android.util.Log;

import com.liverpool.liverpool.modules.repository.DataModule;
import com.liverpool.liverpool.modules.repository.plp.PLPRemote;
import com.liverpool.liverpool.modules.repository.viewmodel.PLPResponse;
import com.liverpool.liverpool.modules.repository.viewmodel.Product;

import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class HomePresenter {

    private PLPRemote plpRemote;
    private HomeView view;

    public HomePresenter(HomeView view) {
        this.view = view;
        plpRemote = DataModule.getClient().create(PLPRemote.class);
    }

    public void getProductsBySearch(String word, int page) {
        Call<PLPResponse> getProducts = plpRemote.getProduct(word, page);
        getProducts.enqueue(new Callback<PLPResponse>() {
            @Override
            public void onResponse(Call<PLPResponse> call, Response<PLPResponse> response) {
                if (response.body() != null && response.body().getPlpResults() != null && response.body().getPlpResults().getRecords() != null)
                    view.setProducts(response.body().getPlpResults().getRecords());
                else
                    view.setProducts(new ArrayList<Product>());
            }

            @Override
            public void onFailure(Call<PLPResponse> call, Throwable t) {

            }
        });

    }
}
