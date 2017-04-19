package com.example.naseeha.inter;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Button;

import com.example.naseeha.inter.R;

public class MainActivity extends AppCompatActivity {

    ImageButton living;
    Button s1,s2,s3,s4,s5,s6,s7,s8;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        living=(ImageButton)findViewById(R.id.btnliving);


        s1=(Button)findViewById(R.id.segment1);
        s2=(Button)findViewById(R.id.segment2);
        s3=(Button)findViewById(R.id.segment3);
        s4=(Button)findViewById(R.id.segment4);
        s5=(Button)findViewById(R.id.segment5);
        s6=(Button)findViewById(R.id.segment6);
        s7=(Button)findViewById(R.id.segment7);
        s8=(Button)findViewById(R.id.segment8);

        s1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this,segment_1.class));
            }
        });


        s2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this,segment2.class));
            }
        });


        s3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this,segment3.class));
            }
        });


        s4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this,segment4.class));
            }
        });


        s5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this,segment5.class));
            }
        });


        s6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this,segment6.class));
            }
        });

        s7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this,segment7.class));
            }
        });

        s8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this,segment8.class));
            }
        });
    }
}
