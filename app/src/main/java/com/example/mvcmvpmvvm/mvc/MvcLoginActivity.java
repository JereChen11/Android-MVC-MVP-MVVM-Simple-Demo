package com.example.mvcmvpmvvm.mvc;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.mvcmvpmvvm.R;

/**
 * @author jere
 */
public class MvcLoginActivity extends AppCompatActivity {
    private EditText userNameEt;
    private EditText passwordEt;
    private Button loginBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mvc_login);


        userNameEt = findViewById(R.id.user_name_et);
        passwordEt = findViewById(R.id.password_et);
        loginBtn = findViewById(R.id.login_btn);

        loginBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (userNameEt.getText().toString().equals("jere")
                        && passwordEt.getText().toString().equals("123")) {
                    Toast.makeText(MvcLoginActivity.this,
                            "Login Successful",
                            Toast.LENGTH_SHORT)
                            .show();
                } else {
                    Toast.makeText(MvcLoginActivity.this,
                            "Login Failed",
                            Toast.LENGTH_SHORT)
                            .show();
                }
            }
        });

    }
}
