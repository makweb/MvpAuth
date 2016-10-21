package com.softdesign.mvpauth.mvp.presenters;

import com.softdesign.mvpauth.mvp.models.ProductModel;
import com.softdesign.mvpauth.mvp.views.IProductView;

/**
 * Created by Makweb on 21.10.2016.
 */

public class ProductPresenter extends AbstractPresenter<IProductView>{
    private static ProductPresenter ourInstance = new ProductPresenter();
    private ProductModel mProductModel;

    private ProductPresenter() {
        mProductModel = new ProductModel();
    }

    public static ProductPresenter getInstance() {
        return ourInstance;
    }

    @Override
    public void initView() {

    }
}
