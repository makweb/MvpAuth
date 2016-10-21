package com.softdesign.mvpauth.mvp.views;

import android.support.annotation.Nullable;

import com.softdesign.mvpauth.mvp.presenters.IAuthPresenter;
import com.softdesign.mvpauth.ui.custom_views.AuthPanel;

/**
 * Created by Makweb on 17.10.2016.
 */

public interface IAuthView extends IView{

    IAuthPresenter getPresenter();

    void showLoginBtn();
    void hideLoginBtn();

    @Nullable
    AuthPanel getAuthPanel();
}
