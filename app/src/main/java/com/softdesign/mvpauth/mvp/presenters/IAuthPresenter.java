package com.softdesign.mvpauth.mvp.presenters;

import android.support.annotation.Nullable;

import com.softdesign.mvpauth.mvp.views.IAuthView;

/**
 * Created by Makweb on 17.10.2016.
 */

public interface IAuthPresenter {

    void takeView(IAuthView authView);
    void dropView();
    void initView();

    @Nullable
    IAuthView getView();

    void clickOnLogin();
    void clickOnFb();
    void clickOnVk();
    void clickOnTwitter();
    void clickOnShowCatalog();

    boolean checkUserAuth();


}
