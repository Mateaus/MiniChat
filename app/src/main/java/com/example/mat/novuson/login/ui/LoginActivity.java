package com.example.mat.novuson.login.ui;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import com.example.mat.novuson.R;
import com.example.mat.novuson.login.LoginPresenter;
import com.example.mat.novuson.login.LoginPresenterImpl;

import butterknife.BindView;
import butterknife.ButterKnife;

public class LoginActivity extends AppCompatActivity implements LoginView {

    @BindView(R.id.emailEt)         EditText inputEmail;
    @BindView(R.id.passwordEt)      EditText inputPassword;
    @BindView(R.id.loginBtn)        Button loginBtn;
    @BindView(R.id.registerBtn)     Button registerBtn;
    @BindView(R.id.recoverpassBtn)  Button recoverpassBtn;

    private LoginPresenter loginPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        loginPresenter = new LoginPresenterImpl(this);
        loginPresenter.onCreate();
        loginPresenter.checkForAutheticatedUser();
    }

    @Override
    protected void onDestroy() {
        loginPresenter.onDestroy();
        super.onDestroy();
    }

    @Override
    public void enableInputs() {
        setInputs(true);
    }

    @Override
    public void disableInputs() {
        setInputs(false);
    }

    @Override
    public void showProgress() {

    }

    @Override
    public void hideProgress() {

    }

    @Override
    public void handleSignUp() {

    }

    @Override
    public void handleSignIn() {

    }

    @Override
    public void navigateToMainScreen() {

    }

    @Override
    public void loginError(String error) {

    }

    @Override
    public void newUserSuccess() {

    }

    @Override
    public void newUserError(String error) {

    }

    private void setInputs(boolean enabled){
        loginBtn.setEnabled(enabled);
        registerBtn.setEnabled(enabled);
        inputEmail.setEnabled(enabled);
        inputPassword.setEnabled(enabled);
    }
}
