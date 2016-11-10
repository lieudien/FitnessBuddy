package com.comp7081.project.fitnessbuddy.Activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.comp7081.project.fitnessbuddy.Classes.User;
import com.comp7081.project.fitnessbuddy.R;

public class RegisterActivity extends AppCompatActivity {

    EditText etFullname, etUsername, etPassword, etRetypePassword;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        etFullname = (EditText) findViewById(R.id.etFullname);
        etUsername = (EditText) findViewById(R.id.etUsername);
        etPassword = (EditText) findViewById(R.id.etPassword);
        etRetypePassword = (EditText) findViewById(R.id.etRetypePassword);
    }

    public void onBtnRegisterClick (View v) {
        String fName = etFullname.getText().toString();
        String uName = etUsername.getText().toString();
        String pwd = etPassword.getText().toString();

        if (fName.isEmpty() || uName.isEmpty() || pwd.isEmpty()) {
            Toast.makeText(this, "Fullname, username, and password can not be blank", Toast.LENGTH_SHORT).show();
        } else {
            User newUser = new User(fName, uName, pwd);
            newUser.save();
            finish();
        }
    }


    public void onBtnCancelClick (View v) {
        finish();
    }
}
