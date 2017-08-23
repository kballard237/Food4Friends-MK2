package com.example.user.food4friends_mk2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }

    public void onLoginClick(View view) {
        EditText etUsername = (EditText) findViewById(R.id.etUsernameLogin);
        Intent intent = new Intent(this, ProfileActivity.class);
        intent.putExtra("Username", etUsername.getText().toString());
        startActivity(intent);
    }
}
