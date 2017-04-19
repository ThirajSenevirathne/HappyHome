package com.example.naseeha.inter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import com.example.naseeha.inter.R;

public class segment3 extends AppCompatActivity {


    //smoke motion autolight humidity temparature

    Button s3light_on,s3light_off,s3_fan_on,s3_fan_off,s3_smoke_active,s3_smoke_deactive,s3_motion_active,s3_motion_deactive,s3_autolight_active,s3_autolight_deactive;
    Button s3_humi_active,s3_humi_deactive,s3_humi_check,s3_temp_active,s3_temp_deactive,s3_temp_check;
    ImageButton s3_Imglight,s3_Imgfan,s3_Imgmotion,s3_Imgautolight,s3_Imghumidity,s3_Imgtemparature,s3_Imgsmoke;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segment3);

        fan();
        light();
        smoke();
        motion();
        autolight();
        humidity();
        temparature();
    }


    //for temparature button
    public void temparature() {
        s3_temp_active = (Button) findViewById(R.id.s3_temperature_active);
        s3_temp_deactive = (Button) findViewById(R.id.s3_temparature_deactive);
        s3_temp_check = (Button) findViewById(R.id.s3_temparature_check);
        s3_Imgtemparature = (ImageButton) findViewById(R.id.s3_temparature);



        //setting blue button for active click
        s3_temp_active.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //   Toast.makeText(getApplicationContext(), "Window Opened", Toast.LENGTH_SHORT).show();
                s3_Imgtemparature.setImageResource(R.drawable.temp_activate);
            }
        });

        //setting  red button for deactive click
        s3_temp_deactive.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //   Toast.makeText(getApplicationContext(), "Window Opened", Toast.LENGTH_SHORT).show();
                s3_Imgtemparature.setImageResource(R.drawable.temp_deactivate);
            }
        });

        //setting green button for check click
        s3_temp_check.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //   Toast.makeText(getApplicationContext(), "Window Opened", Toast.LENGTH_SHORT).show();
                s3_Imgtemparature.setImageResource(R.drawable.temp_check);
            }
        });
    }


    public void humidity(){

        s3_humi_active = (Button) findViewById(R.id.s3_humidity_active);
        s3_humi_deactive = (Button) findViewById(R.id.s3_humidity_deactive);
        s3_humi_check = (Button) findViewById(R.id.s3_humidity_check);
        s3_Imghumidity = (ImageButton) findViewById(R.id.s3_humidity);

        //setting blue button for active click
        s3_humi_active.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //   Toast.makeText(getApplicationContext(), "Window Opened", Toast.LENGTH_SHORT).show();
                s3_Imghumidity.setImageResource(R.drawable.humi_active);
            }
        });

        s3_humi_deactive.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //   Toast.makeText(getApplicationContext(), "Window Opened", Toast.LENGTH_SHORT).show();
                s3_Imghumidity.setImageResource(R.drawable.humi_deactive);
            }
        });

        //setting red button for deactive click
        s3_humi_check.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //   Toast.makeText(getApplicationContext(), "Window Opened", Toast.LENGTH_SHORT).show();
                s3_Imghumidity.setImageResource(R.drawable.humid_check);
            }
        });
    }


    //for autolight button
    public void autolight() {
        s3_autolight_active = (Button) findViewById(R.id.s3_autolight_active);
        s3_autolight_deactive = (Button) findViewById(R.id.s3_autolight_deactive);
        s3_Imgautolight = (ImageButton) findViewById(R.id.s3_autolight);

        //setting blue button for active click
        s3_autolight_active.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //   Toast.makeText(getApplicationContext(), "Window Opened", Toast.LENGTH_SHORT).show();
                s3_Imgautolight.setImageResource(R.drawable.autolightcntrller_active);
            }
        });

        //setting red button for deactive click
        s3_autolight_deactive.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //   Toast.makeText(getApplicationContext(), "Window Opened", Toast.LENGTH_SHORT).show();
                s3_Imgautolight.setImageResource(R.drawable.autolightcntrller_deactive);
            }
        });
    }


    //for motion button
    public void motion() {
        s3_motion_active = (Button) findViewById(R.id.s3_motion_active);
        s3_motion_deactive = (Button) findViewById(R.id.s3_motion_deactive);
        s3_Imgmotion = (ImageButton) findViewById(R.id.s3_motion);

        //setting blue button for active click
        s3_motion_active.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //   Toast.makeText(getApplicationContext(), "Window Opened", Toast.LENGTH_SHORT).show();
                s3_Imgmotion.setImageResource(R.drawable.motion_actvate);
            }
        });

        //setting red button for deactive click
        s3_motion_deactive.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //   Toast.makeText(getApplicationContext(), "Window Opened", Toast.LENGTH_SHORT).show();
                s3_Imgmotion.setImageResource(R.drawable.motion_deactvate);
            }
        });
    }


    //for smoke button
    public void smoke() {
        s3_smoke_active = (Button) findViewById(R.id.s3_smoke_active);
        s3_smoke_deactive = (Button) findViewById(R.id.s3_smoke_deactive);
        s3_Imgsmoke = (ImageButton) findViewById(R.id.s3_smoke);

        //setting blue button for active click
        s3_smoke_active.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //   Toast.makeText(getApplicationContext(), "Window Opened", Toast.LENGTH_SHORT).show();
                s3_Imgsmoke.setImageResource(R.drawable.smoke_active);
            }
        });

        //setting red button for deactive click
        s3_smoke_deactive.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //   Toast.makeText(getApplicationContext(), "Window Opened", Toast.LENGTH_SHORT).show();
                s3_Imgsmoke.setImageResource(R.drawable.smoke_deactive);
            }
        });
    }

    //for fan button
    public void fan() {
        s3_fan_on = (Button) findViewById(R.id.s3_fan_on);
        s3_fan_off = (Button) findViewById(R.id.fan_off);
        s3_Imgfan = (ImageButton) findViewById(R.id.s3_fan);

        //setting blue button for on click
        s3_fan_on.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //   Toast.makeText(getApplicationContext(), "Window Opened", Toast.LENGTH_SHORT).show();
                s3_Imgfan.setImageResource(R.drawable.fan_on);
            }
        });

        //setting red button for off click
        s3_fan_off.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //   Toast.makeText(getApplicationContext(), "Window Opened", Toast.LENGTH_SHORT).show();
                s3_Imgfan.setImageResource(R.drawable.fan_off);
            }
        });
    }

    public void light(){
        s3light_on =(Button)findViewById(R.id.s3_light_on);
        s3light_off=(Button)findViewById(R.id.s3_light_off);
        s3_Imglight=(ImageButton)findViewById(R.id.s3_light);


        s3light_on.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //   Toast.makeText(getApplicationContext(), "Window Opened", Toast.LENGTH_SHORT).show();
                s3_Imglight.setImageResource(R.drawable.bulb_on);
            }
        });

        s3light_off.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //   Toast.makeText(getApplicationContext(), "Window Opened", Toast.LENGTH_SHORT).show();
                s3_Imglight.setImageResource(R.drawable.bulb_off);
            }
        });

    }




}
