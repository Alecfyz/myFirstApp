package com.example.myfirstapplicationalx;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivitySecond extends AppCompatActivity {
    Button butt_back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        butt_back = findViewById(R.id.butt_back);
    }

    public void onClickButBack(View view) {
        Intent intent = new Intent(MainActivitySecond.this, MainActivity.class);
        startActivity(intent);
        Toast.makeText(this, "Меняем экран обратно", Toast.LENGTH_SHORT).show();
    }
}