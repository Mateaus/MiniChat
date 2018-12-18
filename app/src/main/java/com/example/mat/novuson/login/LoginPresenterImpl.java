package com.example.mat.novuson.login;

import com.example.mat.novuson.login.events.LoginEvent;
import com.example.mat.novuson.login.ui.LoginView;

import org.greenrobot.eventbus.*;

public class LoginPresenterImpl implements LoginPresenter{

    EventBus eventBus;
    LoginView loginView;
    LoginInteractor loginInteractor;

    public LoginPresenterImpl(LoginView loginView) {

    }

    @Override
    public void onCreate() {

    }

    @Override
    public void onDestroy() {

    }

    @Override
    public void checkForAutheticatedUser() {

    }

    @Override
    public void onEventMainThread(LoginEvent event) {

    }

    @Override
    public void validateLogin(String email, String password) {

    }

    @Override
    public void registerNewUser(String email, String password) {

    }
}
