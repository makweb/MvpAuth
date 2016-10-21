package com.softdesign.mvpauth.mvp.views;

/**
 * Created by Makweb on 21.10.2016.
 */
public interface IView {
    void showMessage(String message);
    void showError(Throwable e);

    void showLoad();
    void hideLoad();
}
