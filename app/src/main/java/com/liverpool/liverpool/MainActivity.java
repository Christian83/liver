package com.liverpool.liverpool;

import android.app.Activity;
import android.support.design.widget.TextInputEditText;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.KeyEvent;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.TextView;

import com.liverpool.liverpool.modules.home.HomeAdapter;
import com.liverpool.liverpool.modules.home.HomePresenter;
import com.liverpool.liverpool.modules.home.HomeView;
import com.liverpool.liverpool.modules.repository.viewmodel.Product;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import butterknife.OnTextChanged;
import butterknife.Unbinder;

public class MainActivity extends AppCompatActivity implements HomeView {

    @BindView(R.id.search_editText)
    TextInputEditText mSearch;
    @BindView(R.id.search_button)
    Button actionSearch;
    @BindView(R.id.recycle_products_search)
    RecyclerView recyclerSearch;
    @BindView(R.id.empty_results)
    TextView emptyScreen;
    private int pages = 1;
    private String word = "";
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
        mSearch.setOnEditorActionListener(new TextView.OnEditorActionListener() {
            @Override
            public boolean onEditorAction(TextView v, int actionId, KeyEvent event) {
                boolean handled = false;
                if (actionId == EditorInfo.IME_ACTION_DONE) {
                    getWordAndSearch();
                    handled = true;
                }
                return handled;
            }
        });
    }

    @OnTextChanged(R.id.search_editText)
    public void searchTextChange(CharSequence value, int start, int before, int count) {
        if (value.length() == 0) {
            adapter.clearList();
            adapter.notifyDataSetChanged();
        }
    }

    @OnClick(R.id.search_button)
    public void searchProducts() {
        getWordAndSearch();
    }

    private void getWordAndSearch(){
        word = mSearch.getText().toString();
        presenter.getProductsBySearch(word, 1);
        View view = getCurrentFocus();
        if (view != null) {
            InputMethodManager imm = (InputMethodManager) this.getSystemService(Activity.INPUT_METHOD_SERVICE);
            if (imm != null)
                imm.hideSoftInputFromWindow(view.getWindowToken(), 0);
        }
    }

    @Override
    public void setProducts(List<Product> products) {
        if (adapter == null) {
            setAdapter(products);
        } else {
            adapter.addItems(products);
            adapter.notifyDataSetChanged();
        }
        if (products.size() > 0) {
            recyclerSearch.setVisibility(View.VISIBLE);
        } else {
            emptyScreen.setVisibility(View.VISIBLE);
        }
    }

    public void setAdapter(List<Product> products) {
        adapter = new HomeAdapter(products);
        final LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        layoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        recyclerSearch.setLayoutManager(layoutManager);
        recyclerSearch.setAdapter(adapter);
        recyclerSearch.addOnScrollListener(new RecyclerView.OnScrollListener() {
            @Override
            public void onScrollStateChanged(RecyclerView recyclerView, int newState) {
                super.onScrollStateChanged(recyclerView, newState);
            }

            @Override
            public void onScrolled(RecyclerView recyclerView, int dx, int dy) {
                super.onScrolled(recyclerView, dx, dy);
                int sizeNow = layoutManager.getChildCount();
                int count = layoutManager.getItemCount();
                int position = layoutManager.findFirstCompletelyVisibleItemPosition();
                if (sizeNow + position >= count) {
                    pages += pages + 1;
                    presenter.getProductsBySearch(word, pages);
                }
            }
        });
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        unbinder.unbind();
    }
}
