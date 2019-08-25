package com.example.mvcmvpmvvm;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.example.mvcmvpmvvm.mvc.controller.MvcLoginActivity;
import com.example.mvcmvpmvvm.mvp.view.MvpLoginActivity;
import com.example.mvcmvpmvvm.mvvm.view.MvvmLoginActivity;

/**
 * @author jere
 */
public class MainActivity extends AppCompatActivity implements View.OnClickListener {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button mvcBtn = findViewById(R.id.mvc_btn);
        Button mvpBtn = findViewById(R.id.mvp_btn);
        Button mvvmBtn = findViewById(R.id.mvvm_btn);
        mvcBtn.setOnClickListener(this);
        mvpBtn.setOnClickListener(this);
        mvvmBtn.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {

        switch (view.getId()) {
            case R.id.mvc_btn:
                Intent mvcIntent = new Intent(this, MvcLoginActivity.class);
                startActivity(mvcIntent);
                break;
            case R.id.mvp_btn:
                Intent mvpIntent = new Intent(this, MvpLoginActivity.class);
                startActivity(mvpIntent);
                break;
            case R.id.mvvm_btn:
                Intent mvvmIntent = new Intent(this, MvvmLoginActivity.class);
                startActivity(mvvmIntent);
                break;
            default:
                break;
        }
    }
}
