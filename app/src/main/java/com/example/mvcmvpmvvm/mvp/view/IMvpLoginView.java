package com.example.mvcmvpmvvm.mvp.view;

/**
 * @author jere
 */
public interface IMvpLoginView {
    String getUserName();

    String getPassword();

    void onLoginResult(Boolean isLoginSuccess);
}
