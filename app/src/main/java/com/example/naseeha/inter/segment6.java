package com.example.naseeha.inter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import com.example.naseeha.inter.R;

public class segment6 extends AppCompatActivity {


    //smoke motion autolight humidity temparature

    Button s6light_on,s6light_off,s6_fan_on,s6_fan_off,s6_smoke_active,s6_smoke_deactive,s6_motion_active,s6_motion_deactive,s6_autolight_active,s6_autolight_deactive;
    Button s6_humi_active,s6_humi_deactive,s6_humi_check,s6_temp_active,s6_temp_deactive,s6_temp_check;
    ImageButton s6_Imglight,s6_Imgfan,s6_Imgmotion,s6_Imgautolight,s6_Imghumidity,s6_Imgtemparature,s6_Imgsmoke;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segment6);

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
        s6_temp_active = (Button) findViewById(R.id.s6_temperature_active);
        s6_temp_deactive = (Button) findViewById(R.id.s6_temparature_deactive);
        s6_temp_check = (Button) findViewById(R.id.s6_temparature_check);
        s6_Imgtemparature = (ImageButton) findViewById(R.id.s6_temparature);



        //setting blue button for active click
        s6_temp_active.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //   Toast.makeText(getApplicationContext(), "Window Opened", Toast.LENGTH_SHORT).show();
                s6_Imgtemparature.setImageResource(R.drawable.temp_activate);
            }
        });

        //setting  red button for deactive click
        s6_temp_deactive.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //   Toast.makeText(getApplicationContext(), "Window Opened", Toast.LENGTH_SHORT).show();
                s6_Imgtemparature.setImageResource(R.drawable.temp_deactivate);
            }
        });

        //setting green button for check click
        s6_temp_check.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //   Toast.makeText(getApplicationContext(), "Window Opened", Toast.LENGTH_SHORT).show();
                s6_Imgtemparature.setImageResource(R.drawable.temp_check);
            }
        });
    }


    public void humidity(){

        s6_humi_active = (Button) findViewById(R.id.s6_humidity_active);
        s6_humi_deactive = (Button) findViewById(R.id.s6_humidity_deactive);
        s6_humi_check = (Button) findViewById(R.id.s6_humidity_check);
        s6_Imghumidity = (ImageButton) findViewById(R.id.s6_humidity);

        //setting blue button for active click
        s6_humi_active.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //   Toast.makeText(getApplicationContext(), "Window Opened", Toast.LENGTH_SHORT).show();
                s6_Imghumidity.setImageResource(R.drawable.humi_active);
            }
        });

        s6_humi_deactive.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //   Toast.makeText(getApplicationContext(), "Window Opened", Toast.LENGTH_SHORT).show();
                s6_Imghumidity.setImageResource(R.drawable.humi_deactive);
            }
        });

        //setting red button for deactive click
        s6_humi_check.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //   Toast.makeText(getApplicationContext(), "Window Opened", Toast.LENGTH_SHORT).show();
                s6_Imghumidity.setImageResource(R.drawable.humid_check);
            }
        });
    }


    //for autolight button
    public void autolight() {
        s6_autolight_active = (Button) findViewById(R.id.s6_autolight_active);
        s6_autolight_deactive = (Button) findViewById(R.id.s6_autolight_deactive);
        s6_Imgautolight = (ImageButton) findViewById(R.id.s6_autolight);

        //setting blue button for active click
        s6_autolight_active.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //   Toast.makeText(getApplicationContext(), "Window Opened", Toast.LENGTH_SHORT).show();
                s6_Imgautolight.setImageResource(R.drawable.autolightcntrller_active);
            }
        });

        //setting red button for deactive click
        s6_autolight_deactive.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //   Toast.makeText(getApplicationContext(), "Window Opened", Toast.LENGTH_SHORT).show();
                s6_Imgautolight.setImageResource(R.drawable.autolightcntrller_deactive);
            }
        });
    }


    //for motion button
    public void motion() {
        s6_motion_active = (Button) findViewById(R.id.s6_motion_active);
        s6_motion_deactive = (Button) findViewById(R.id.s6_motion_deactive);
        s6_Imgmotion = (ImageButton) findViewById(R.id.s6_motion);

        //setting blue button for active click
        s6_motion_active.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //   Toast.makeText(getApplicationContext(), "Window Opened", Toast.LENGTH_SHORT).show();
                s6_Imgmotion.setImageResource(R.drawable.motion_actvate);
            }
        });

        //setting red button for deactive click
        s6_motion_deactive.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //   Toast.makeText(getApplicationContext(), "Window Opened", Toast.LENGTH_SHORT).show();
                s6_Imgmotion.setImageResource(R.drawable.motion_deactvate);
            }
        });
    }


    //for smoke button
    public void smoke() {
        s6_smoke_active = (Button) findViewById(R.id.s6_smoke_active);
        s6_smoke_deactive = (Button) findViewById(R.id.s6_smoke_deactive);
        s6_Imgsmoke = (ImageButton) findViewById(R.id.s6_smoke);

        //setting blue button for active click
        s6_smoke_active.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //   Toast.makeText(getApplicationContext(), "Window Opened", Toast.LENGTH_SHORT).show();
                s6_Imgsmoke.setImageResource(R.drawable.smoke_active);
            }
        });

        //setting red button for deactive click
        s6_smoke_deactive.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //   Toast.makeText(getApplicationContext(), "Window Opened", Toast.LENGTH_SHORT).show();
                s6_Imgsmoke.setImageResource(R.drawable.smoke_deactive);
            }
        });
    }

    //for fan button
    public void fan() {
        s6_fan_on = (Button) findViewById(R.id.s6_fan_on);
        s6_fan_off = (Button) findViewById(R.id.fan_off);
        s6_Imgfan = (ImageButton) findViewById(R.id.s6_fan);

        //setting blue button for on click
        s6_fan_on.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //   Toast.makeText(getApplicationContext(), "Window Opened", Toast.LENGTH_SHORT).show();
                s6_Imgfan.setImageResource(R.drawable.fan_on);
            }
        });

        //setting red button for off click
        s6_fan_off.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //   Toast.makeText(getApplicationContext(), "Window Opened", Toast.LENGTH_SHORT).show();
                s6_Imgfan.setImageResource(R.drawable.fan_off);
            }
        });
    }

    public void light(){
        s6light_on =(Button)findViewById(R.id.s6_light_on);
        s6light_off=(Button)findViewById(R.id.s6_light_off);
        s6_Imglight=(ImageButton)findViewById(R.id.s6_light);


        s6light_on.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //   Toast.makeText(getApplicationContext(), "Window Opened", Toast.LENGTH_SHORT).show();
                s6_Imglight.setImageResource(R.drawable.bulb_on);
            }
        });

        s6light_off.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //   Toast.makeText(getApplicationContext(), "Window Opened", Toast.LENGTH_SHORT).show();
                s6_Imglight.setImageResource(R.drawable.bulb_off);
            }
        });

    }




}
