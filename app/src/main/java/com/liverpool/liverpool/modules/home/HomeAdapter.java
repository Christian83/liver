package com.liverpool.liverpool.modules.home;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import com.liverpool.liverpool.R;
import com.liverpool.liverpool.common.PLPHolder;
import com.liverpool.liverpool.modules.repository.viewmodel.Product;

import java.util.List;

public class HomeAdapter extends RecyclerView.Adapter<PLPHolder> {

    private List<Product> products;

    public HomeAdapter(List<Product> searchProducts) {
        this.products = searchProducts;
    }

    @NonNull
    @Override
    public PLPHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new PLPHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.holder_producto_plp, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull PLPHolder holder, int position) {
        holder.setValues(products.get(position));
    }

    @Override
    public int getItemCount() {
        return products.size();
    }
}
