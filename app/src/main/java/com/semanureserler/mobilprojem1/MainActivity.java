package com.semanureserler.mobilprojem1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button anasayfayagit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        int a = 5;
        int b=10 ; // baris ekledi
        getActionBar();

        anasayfayagit =findViewById(R.id.button);
        anasayfayagit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent anasayfa= new Intent(MainActivity.this,MainActivity2.class);
                startActivity(anasayfa);
            }
        });
    }
}