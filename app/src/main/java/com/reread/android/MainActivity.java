package com.reread.android;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.content.Intent;
import android.widget.Button;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;


public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        /*setContentView(R.layout.auth_layout);
        final Button button = findViewById(R.id.email_sign_in_button);
        button.setOnClickListener(new EmailPasswordActivity());*/

        Intent intent = new Intent(this, EmailPasswordActivity.class);
        startActivity(intent);
    }
}
