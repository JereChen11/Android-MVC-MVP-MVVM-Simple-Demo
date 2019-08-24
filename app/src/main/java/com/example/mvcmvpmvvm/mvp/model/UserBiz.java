package com.example.mvcmvpmvvm.mvp.model;

/**
 * @author jere
 */
public class UserBiz implements IUserBiz {

    @Override
    public boolean login(String userName, String password) {

        if (userName.equals("jere") && password.equals("123")) {
            User user = new User();
            user.setUserName(userName);
            user.setPassword(password);
            return true;
        }
        return false;
    }
}
