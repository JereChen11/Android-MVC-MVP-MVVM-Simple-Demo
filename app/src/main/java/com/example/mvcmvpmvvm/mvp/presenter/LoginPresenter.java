package com.example.mvcmvpmvvm.mvp.presenter;

import com.example.mvcmvpmvvm.mvp.model.User;
import com.example.mvcmvpmvvm.mvp.model.UserBiz;
import com.example.mvcmvpmvvm.mvp.view.IMvpLoginView;

/**
 * @author jere
 */
public class LoginPresenter{
    private UserBiz userBiz;
    private IMvpLoginView iMvpLoginView;

    public LoginPresenter(IMvpLoginView iMvpLoginView) {
        this.iMvpLoginView = iMvpLoginView;
        this.userBiz = new UserBiz();
    }

    public void login() {
        String userName = iMvpLoginView.getUserName();
        String password = iMvpLoginView.getPassword();
        boolean isLoginSuccessful = userBiz.login(userName, password);
        iMvpLoginView.onLoginResult(isLoginSuccessful);
    }


}
