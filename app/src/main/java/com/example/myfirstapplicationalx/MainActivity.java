package com.example.myfirstapplicationalx;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button butt_ch_view;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        butt_ch_view = findViewById(R.id.butt_ch_view);
    }

    public void onClickButChView(View view) {
        Intent intent = new Intent(MainActivity.this, MainActivitySecond.class);
        startActivity(intent);
        Toast.makeText(this, "Меняем экран", Toast.LENGTH_SHORT).show();
    }

}