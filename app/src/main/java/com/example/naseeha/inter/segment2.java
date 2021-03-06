package com.example.naseeha.inter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class segment2 extends AppCompatActivity {

 
    //smoke motion autolight humidity temparature

    Button s2light_on,s2light_off,s2_fan_on,s2_fan_off,s2_smoke_active,s2_smoke_deactive,s2_motion_active,s2_motion_deactive,s2_autolight_active,s2_autolight_deactive;
    Button s2_humi_active,s2_humi_deactive,s2_humi_check,s2_temp_active,s2_temp_deactive,s2_temp_check;
    ImageButton s2_Imglight,s2_Imgfan,s2_Imgmotion,s2_Imgautolight,s2_Imghumidity,s2_Imgtemparature,s2_Imgsmoke;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segment2);

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
        s2_temp_active = (Button) findViewById(R.id.s2_temperature_active);
        s2_temp_deactive = (Button) findViewById(R.id.s2_temparature_deactive);
        s2_temp_check = (Button) findViewById(R.id.s2_temparature_check);
        s2_Imgtemparature = (ImageButton) findViewById(R.id.s2_temparature);



        //setting blue button for active click
        s2_temp_active.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //   Toast.makeText(getApplicationContext(), "Window Opened", Toast.LENGTH_SHORT).show();
                s2_Imgtemparature.setImageResource(R.drawable.temp_activate);
            }
        });

        //setting  red button for deactive click
        s2_temp_deactive.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //   Toast.makeText(getApplicationContext(), "Window Opened", Toast.LENGTH_SHORT).show();
                s2_Imgtemparature.setImageResource(R.drawable.temp_deactivate);
            }
        });

        //setting green button for check click
        s2_temp_check.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //   Toast.makeText(getApplicationContext(), "Window Opened", Toast.LENGTH_SHORT).show();
                s2_Imgtemparature.setImageResource(R.drawable.temp_check);
            }
        });
    }


    public void humidity(){

        s2_humi_active = (Button) findViewById(R.id.s2_humidity_active);
        s2_humi_deactive = (Button) findViewById(R.id.s2_humidity_deactive);
        s2_humi_check = (Button) findViewById(R.id.s2_humidity_check);
        s2_Imghumidity = (ImageButton) findViewById(R.id.s2_humidity);

        //setting blue button for active click
        s2_humi_active.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //   Toast.makeText(getApplicationContext(), "Window Opened", Toast.LENGTH_SHORT).show();
                s2_Imghumidity.setImageResource(R.drawable.humi_active);
            }
        });

        s2_humi_deactive.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //   Toast.makeText(getApplicationContext(), "Window Opened", Toast.LENGTH_SHORT).show();
                s2_Imghumidity.setImageResource(R.drawable.humi_deactive);
            }
        });

        //setting red button for deactive click
        s2_humi_check.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //   Toast.makeText(getApplicationContext(), "Window Opened", Toast.LENGTH_SHORT).show();
                s2_Imghumidity.setImageResource(R.drawable.humid_check);
            }
        });
    }


    //for autolight button
    public void autolight() {
        s2_autolight_active = (Button) findViewById(R.id.s2_autolight_active);
        s2_autolight_deactive = (Button) findViewById(R.id.s2_autolight_deactive);
        s2_Imgautolight = (ImageButton) findViewById(R.id.s2_autolight);

        //setting blue button for active click
        s2_autolight_active.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //   Toast.makeText(getApplicationContext(), "Window Opened", Toast.LENGTH_SHORT).show();
                s2_Imgautolight.setImageResource(R.drawable.autolightcntrller_active);
            }
        });

        //setting red button for deactive click
        s2_autolight_deactive.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //   Toast.makeText(getApplicationContext(), "Window Opened", Toast.LENGTH_SHORT).show();
                s2_Imgautolight.setImageResource(R.drawable.autolightcntrller_deactive);
            }
        });
    }


    //for motion button
    public void motion() {
        s2_motion_active = (Button) findViewById(R.id.s2_motion_active);
        s2_motion_deactive = (Button) findViewById(R.id.s2_motion_deactive);
        s2_Imgmotion = (ImageButton) findViewById(R.id.s2_motion);

        //setting blue button for active click
        s2_motion_active.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //   Toast.makeText(getApplicationContext(), "Window Opened", Toast.LENGTH_SHORT).show();
                s2_Imgmotion.setImageResource(R.drawable.motion_actvate);
            }
        });

        //setting red button for deactive click
        s2_motion_deactive.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //   Toast.makeText(getApplicationContext(), "Window Opened", Toast.LENGTH_SHORT).show();
                s2_Imgmotion.setImageResource(R.drawable.motion_deactvate);
            }
        });
    }


    //for smoke button
    public void smoke() {
        s2_smoke_active = (Button) findViewById(R.id.s2_smoke_active);
        s2_smoke_deactive = (Button) findViewById(R.id.s2_smoke_deactive);
        s2_Imgsmoke = (ImageButton) findViewById(R.id.s2_smoke);

        //setting blue button for active click
        s2_smoke_active.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //   Toast.makeText(getApplicationContext(), "Window Opened", Toast.LENGTH_SHORT).show();
                s2_Imgsmoke.setImageResource(R.drawable.smoke_active);
            }
        });

        //setting red button for deactive click
        s2_smoke_deactive.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //   Toast.makeText(getApplicationContext(), "Window Opened", Toast.LENGTH_SHORT).show();
                s2_Imgsmoke.setImageResource(R.drawable.smoke_deactive);
            }
        });
    }

    //for fan button
    public void fan() {
        s2_fan_on = (Button) findViewById(R.id.s2_fan_on);
        s2_fan_off = (Button) findViewById(R.id.fan_off);
        s2_Imgfan = (ImageButton) findViewById(R.id.s2_fan);

        //setting blue button for on click
        s2_fan_on.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //   Toast.makeText(getApplicationContext(), "Window Opened", Toast.LENGTH_SHORT).show();
                s2_Imgfan.setImageResource(R.drawable.fan_on);
            }
        });

        //setting red button for off click
        s2_fan_off.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //   Toast.makeText(getApplicationContext(), "Window Opened", Toast.LENGTH_SHORT).show();
                s2_Imgfan.setImageResource(R.drawable.fan_off);
            }
        });
    }

    public void light(){
        s2light_on =(Button)findViewById(R.id.s2_light_on);
        s2light_off=(Button)findViewById(R.id.s2_light_off);
        s2_Imglight=(ImageButton)findViewById(R.id.s2_light);


        s2light_on.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //   Toast.makeText(getApplicationContext(), "Window Opened", Toast.LENGTH_SHORT).show();
                s2_Imglight.setImageResource(R.drawable.bulb_on);
            }
        });

        s2light_off.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //   Toast.makeText(getApplicationContext(), "Window Opened", Toast.LENGTH_SHORT).show();
                s2_Imglight.setImageResource(R.drawable.bulb_off);
            }
        });

    }




}
