package com.example.ansel.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.*;

public class MainActivity extends AppCompatActivity {

    TextView greeting;
    Button click;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        greeting = (TextView)findViewById(R.id.tvGreeting);
        click = (Button)findViewById(R.id.btnClick);

        greeting.setVisibility(View.GONE);

        click.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                greeting.setVisibility(View.VISIBLE);
            }
        });
    }
}
