package com.softdesign.mvpauth.mvp.models;

/**
 * Created by Makweb on 17.10.2016.
 */

public class AuthModel {

    public AuthModel() {
    }

    public boolean isAuthUser() {
        // TODO: 17.10.2016 search token in sharedpreferences
        return false;
    }

    public void loginUser(String email, String password) {
        // TODO: 17.10.2016 send data to server for auth
    }
}
