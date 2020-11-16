package com.example.constraint;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void onMyButtonClick(View view)
    {
        // выводим сообщение
        Toast.makeText(this, "OK", Toast.LENGTH_SHORT).show();
    }
}