package com.example.mvcmvpmvvm.mvp.view;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.mvcmvpmvvm.R;
import com.example.mvcmvpmvvm.mvp.presenter.LoginPresenter;

/**
 * @author jere
 */
public class MvpLoginActivity extends AppCompatActivity implements IMvpLoginView{
    private EditText userNameEt;
    private EditText passwordEt;
    private LoginPresenter loginPresenter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mvp_login);

        userNameEt = findViewById(R.id.user_name_et);
        passwordEt = findViewById(R.id.password_et);
        Button loginBtn = findViewById(R.id.login_btn);

        loginPresenter = new LoginPresenter(this);
        loginBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                loginPresenter.login();
            }
        });
    }

    @Override
    public String getUserName() {
        return userNameEt.getText().toString();
    }

    @Override
    public String getPassword() {
        return passwordEt.getText().toString();
    }

    @Override
    public void onLoginResult(Boolean isLoginSuccess) {
        if (isLoginSuccess) {
            Toast.makeText(MvpLoginActivity.this,
                    getUserName() + " Login Successful",
                    Toast.LENGTH_SHORT)
                    .show();
        } else {
            Toast.makeText(MvpLoginActivity.this,
                    "Login Failed",
                    Toast.LENGTH_SHORT).show();
        }
    }
}
