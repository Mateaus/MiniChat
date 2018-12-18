package com.example.mat.novuson.login;

import com.example.mat.novuson.login.events.LoginEvent;

public interface LoginPresenter {

    void onCreate();
    void onDestroy();
    void checkForAutheticatedUser();
    void onEventMainThread(LoginEvent event);
    void validateLogin(String email, String password);
    void registerNewUser(String email, String password);
}
