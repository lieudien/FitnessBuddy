package com.comp7081.project.fitnessbuddy.Activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.comp7081.project.fitnessbuddy.R;

public class AutheticationActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_authetication);
    }

    public void onClick (View v) {
        int btnId = v.getId();
        if (btnId == R.id.btnRegister) {
            Intent i = new Intent(this, RegisterActivity.class);
            startActivity(i);
        } else if (btnId == R.id.btnLogin) {
            Intent i = new Intent(this, LoginActivity.class);
            startActivity(i);
        }
    }
}
