package com.liverpool.liverpool.common;

import android.graphics.Paint;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.liverpool.liverpool.R;
import com.liverpool.liverpool.modules.repository.viewmodel.Product;
import com.squareup.picasso.Picasso;

import java.text.NumberFormat;

import butterknife.BindView;
import butterknife.ButterKnife;

public class PLPHolder extends RecyclerView.ViewHolder {

    @BindView(R.id.productName)
    TextView productName;
    @BindView(R.id.productImage)
    ImageView productImage;
    @BindView(R.id.priceBefore)
    TextView priceBefore;
    @BindView(R.id.price)
    TextView price;

    public PLPHolder(View itemView) {
        super(itemView);
        ButterKnife.bind(this, itemView);
    }

    public void setValues(Product product) {
        NumberFormat formatter = NumberFormat.getCurrencyInstance();
        if (product.getSmImage() != null)
            Picasso.get().load(product.getSmImage()).fit().into(productImage);
        if (product.getProductDisplayName() != null)
            productName.setText(product.getProductDisplayName());
        if (product.getListPrice() != null && product.getListPrice() > 0) {
            priceBefore.setText(formatter.format(product.getListPrice().doubleValue()));
            priceBefore.setPaintFlags(Paint.STRIKE_THRU_TEXT_FLAG);
        }

        if (product.getPromoPrice() != null && product.getPromoPrice() > 0)
            price.setText(formatter.format(product.getPromoPrice().doubleValue()));
        else {
            priceBefore.setVisibility(View.GONE);
            if (product.getListPrice() != null && product.getListPrice() > 0)
                price.setText(formatter.format(product.getListPrice().doubleValue()));
        }
    }
}
