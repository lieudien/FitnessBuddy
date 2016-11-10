package com.comp7081.project.fitnessbuddy.Activities;

import android.content.Intent;
import android.os.Message;
import android.support.v4.app.NotificationCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.comp7081.project.fitnessbuddy.Classes.User;
import com.comp7081.project.fitnessbuddy.R;

import java.util.List;

public class LoginActivity extends AppCompatActivity {

    EditText etUsername, etPassword;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        etUsername = (EditText) findViewById(R.id.etUsername);
        etPassword = (EditText) findViewById(R.id.etPassword);

    }

    public void onBtnLoginClick (View v) {
        String uName = etUsername.getText().toString();
        String pwd = etPassword.getText().toString();

        if (uName.isEmpty() || pwd.isEmpty()) {
            Toast.makeText(this, "Username and password can not be empty", Toast.LENGTH_SHORT).show();
        } else {
            List<User> users = User.find(User.class, "username = ?", uName);
            User user = users.get(0);
            if (user.checkPassword(pwd)) {
                Intent i = new Intent(this, MainActivity.class);
                finish();
                startActivity(i);
            } else {
                Toast.makeText(this, "You enter the wrong username or password. Please try again", Toast.LENGTH_SHORT).show();
            }
        }
    }

    public void onBtnCancelClick (View v) {
        finish();
    }
}
