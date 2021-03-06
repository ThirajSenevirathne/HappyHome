package com.example.naseeha.inter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import com.example.naseeha.inter.R;

public class segment8 extends AppCompatActivity {


    //smoke motion autolight humidity temparature

    Button s8light_on,s8light_off,s8_fan_on,s8_fan_off,s8_smoke_active,s8_smoke_deactive,s8_motion_active,s8_motion_deactive,s8_autolight_active,s8_autolight_deactive;
    Button s8_humi_active,s8_humi_deactive,s8_humi_check,s8_temp_active,s8_temp_deactive,s8_temp_check;
    ImageButton s8_Imglight,s8_Imgfan,s8_Imgmotion,s8_Imgautolight,s8_Imghumidity,s8_Imgtemparature,s8_Imgsmoke;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segment8);

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
        s8_temp_active = (Button) findViewById(R.id.s8_temperature_active);
        s8_temp_deactive = (Button) findViewById(R.id.s8_temparature_deactive);
        s8_temp_check = (Button) findViewById(R.id.s8_temparature_check);
        s8_Imgtemparature = (ImageButton) findViewById(R.id.s8_temparature);



        //setting blue button for active click
        s8_temp_active.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //   Toast.makeText(getApplicationContext(), "Window Opened", Toast.LENGTH_SHORT).show();
                s8_Imgtemparature.setImageResource(R.drawable.temp_activate);
            }
        });

        //setting  red button for deactive click
        s8_temp_deactive.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //   Toast.makeText(getApplicationContext(), "Window Opened", Toast.LENGTH_SHORT).show();
                s8_Imgtemparature.setImageResource(R.drawable.temp_deactivate);
            }
        });

        //setting green button for check click
        s8_temp_check.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //   Toast.makeText(getApplicationContext(), "Window Opened", Toast.LENGTH_SHORT).show();
                s8_Imgtemparature.setImageResource(R.drawable.temp_check);
            }
        });
    }


    public void humidity(){

        s8_humi_active = (Button) findViewById(R.id.s8_humidity_active);
        s8_humi_deactive = (Button) findViewById(R.id.s8_humidity_deactive);
        s8_humi_check = (Button) findViewById(R.id.s8_humidity_check);
        s8_Imghumidity = (ImageButton) findViewById(R.id.s8_humidity);

        //setting blue button for active click
        s8_humi_active.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //   Toast.makeText(getApplicationContext(), "Window Opened", Toast.LENGTH_SHORT).show();
                s8_Imghumidity.setImageResource(R.drawable.humi_active);
            }
        });

        s8_humi_deactive.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //   Toast.makeText(getApplicationContext(), "Window Opened", Toast.LENGTH_SHORT).show();
                s8_Imghumidity.setImageResource(R.drawable.humi_deactive);
            }
        });

        //setting red button for deactive click
        s8_humi_check.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //   Toast.makeText(getApplicationContext(), "Window Opened", Toast.LENGTH_SHORT).show();
                s8_Imghumidity.setImageResource(R.drawable.humid_check);
            }
        });
    }


    //for autolight button
    public void autolight() {
        s8_autolight_active = (Button) findViewById(R.id.s8_autolight_active);
        s8_autolight_deactive = (Button) findViewById(R.id.s8_autolight_deactive);
        s8_Imgautolight = (ImageButton) findViewById(R.id.s8_autolight);

        //setting blue button for active click
        s8_autolight_active.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //   Toast.makeText(getApplicationContext(), "Window Opened", Toast.LENGTH_SHORT).show();
                s8_Imgautolight.setImageResource(R.drawable.autolightcntrller_active);
            }
        });

        //setting red button for deactive click
        s8_autolight_deactive.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //   Toast.makeText(getApplicationContext(), "Window Opened", Toast.LENGTH_SHORT).show();
                s8_Imgautolight.setImageResource(R.drawable.autolightcntrller_deactive);
            }
        });
    }


    //for motion button
    public void motion() {
        s8_motion_active = (Button) findViewById(R.id.s8_motion_active);
        s8_motion_deactive = (Button) findViewById(R.id.s8_motion_deactive);
        s8_Imgmotion = (ImageButton) findViewById(R.id.s8_motion);

        //setting blue button for active click
        s8_motion_active.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //   Toast.makeText(getApplicationContext(), "Window Opened", Toast.LENGTH_SHORT).show();
                s8_Imgmotion.setImageResource(R.drawable.motion_actvate);
            }
        });

        //setting red button for deactive click
        s8_motion_deactive.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //   Toast.makeText(getApplicationContext(), "Window Opened", Toast.LENGTH_SHORT).show();
                s8_Imgmotion.setImageResource(R.drawable.motion_deactvate);
            }
        });
    }


    //for smoke button
    public void smoke() {
        s8_smoke_active = (Button) findViewById(R.id.s8_smoke_active);
        s8_smoke_deactive = (Button) findViewById(R.id.s8_smoke_deactive);
        s8_Imgsmoke = (ImageButton) findViewById(R.id.s8_smoke);

        //setting blue button for active click
        s8_smoke_active.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //   Toast.makeText(getApplicationContext(), "Window Opened", Toast.LENGTH_SHORT).show();
                s8_Imgsmoke.setImageResource(R.drawable.smoke_active);
            }
        });

        //setting red button for deactive click
        s8_smoke_deactive.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //   Toast.makeText(getApplicationContext(), "Window Opened", Toast.LENGTH_SHORT).show();
                s8_Imgsmoke.setImageResource(R.drawable.smoke_deactive);
            }
        });
    }

    //for fan button
    public void fan() {
        s8_fan_on = (Button) findViewById(R.id.s8_fan_on);
        s8_fan_off = (Button) findViewById(R.id.fan_off);
        s8_Imgfan = (ImageButton) findViewById(R.id.s8_fan);

        //setting blue button for on click
        s8_fan_on.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //   Toast.makeText(getApplicationContext(), "Window Opened", Toast.LENGTH_SHORT).show();
                s8_Imgfan.setImageResource(R.drawable.fan_on);
            }
        });

        //setting red button for off click
        s8_fan_off.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //   Toast.makeText(getApplicationContext(), "Window Opened", Toast.LENGTH_SHORT).show();
                s8_Imgfan.setImageResource(R.drawable.fan_off);
            }
        });
    }

    public void light(){
        s8light_on =(Button)findViewById(R.id.s8_light_on);
        s8light_off=(Button)findViewById(R.id.s8_light_off);
        s8_Imglight=(ImageButton)findViewById(R.id.s8_light);


        s8light_on.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //   Toast.makeText(getApplicationContext(), "Window Opened", Toast.LENGTH_SHORT).show();
                s8_Imglight.setImageResource(R.drawable.bulb_on);
            }
        });

        s8light_off.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //   Toast.makeText(getApplicationContext(), "Window Opened", Toast.LENGTH_SHORT).show();
                s8_Imglight.setImageResource(R.drawable.bulb_off);
            }
        });

    }




}
