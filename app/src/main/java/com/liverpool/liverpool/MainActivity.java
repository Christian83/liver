package com.liverpool.liverpool;

import android.support.design.widget.TextInputEditText;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;

import com.liverpool.liverpool.modules.home.HomeAdapter;
import com.liverpool.liverpool.modules.home.HomePresenter;
import com.liverpool.liverpool.modules.home.HomeView;
import com.liverpool.liverpool.modules.repository.viewmodel.Product;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import butterknife.Unbinder;

public class MainActivity extends AppCompatActivity implements HomeView {

    @BindView(R.id.search_editText) TextInputEditText mSearch;
    @BindView(R.id.search_button) Button actionSearch;
    @BindView(R.id.recycle_products_search) RecyclerView recyclerSearch;
    private Unbinder unbinder;
    private HomeAdapter adapter;
    private HomePresenter presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        unbinder = ButterKnife.bind(this);
        presenter = new HomePresenter(this);
        recyclerSearch.setVisibility(View.GONE);
    }

    @OnClick(R.id.search_button)
    public void searchProducts(){
        String wordToSearch = mSearch.getText().toString();
        presenter.getProductsBySearch(wordToSearch);


    }

    @Override
    public void setProducts(List<Product> products) {
        adapter = new HomeAdapter(products);
        final LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        layoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        recyclerSearch.setLayoutManager(layoutManager);
        recyclerSearch.setAdapter(adapter);
        recyclerSearch.setVisibility(View.VISIBLE);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        unbinder.unbind();
    }
}
