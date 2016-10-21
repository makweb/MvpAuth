package com.softdesign.mvpauth.mvp.presenters;

/**
 * Created by Makweb on 17.10.2016.
 */

public interface IAuthPresenter {

    void clickOnLogin();
    void clickOnFb();
    void clickOnVk();
    void clickOnTwitter();
    void clickOnShowCatalog();

    boolean checkUserAuth();


}
