package com.example.cropad;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class registration_page extends AppCompatActivity {

    public Button regisd;

    public void login(){
        Intent regis =  new Intent(this, MainActivity.class);
        startActivity(regis);

    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration_page);

        regisd = (Button) findViewById(R.id.register);
        regisd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                login();
            }
        });
    }
}
