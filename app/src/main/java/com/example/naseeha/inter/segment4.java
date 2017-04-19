package com.example.naseeha.inter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import com.example.naseeha.inter.R;

public class segment4 extends AppCompatActivity {


    //smoke motion autolight humidity temparature

    Button s4light_on,s4light_off,s4_fan_on,s4_fan_off,s4_smoke_active,s4_smoke_deactive,s4_motion_active,s4_motion_deactive,s4_autolight_active,s4_autolight_deactive;
    Button s4_humi_active,s4_humi_deactive,s4_humi_check,s4_temp_active,s4_temp_deactive,s4_temp_check;
    ImageButton s4_Imglight,s4_Imgfan,s4_Imgmotion,s4_Imgautolight,s4_Imghumidity,s4_Imgtemparature,s4_Imgsmoke;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segment4);

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
        s4_temp_active = (Button) findViewById(R.id.s4_temperature_active);
        s4_temp_deactive = (Button) findViewById(R.id.s4_temparature_deactive);
        s4_temp_check = (Button) findViewById(R.id.s4_temparature_check);
        s4_Imgtemparature = (ImageButton) findViewById(R.id.s4_temparature);



        //setting blue button for active click
        s4_temp_active.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //   Toast.makeText(getApplicationContext(), "Window Opened", Toast.LENGTH_SHORT).show();
                s4_Imgtemparature.setImageResource(R.drawable.temp_activate);
            }
        });

        //setting  red button for deactive click
        s4_temp_deactive.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //   Toast.makeText(getApplicationContext(), "Window Opened", Toast.LENGTH_SHORT).show();
                s4_Imgtemparature.setImageResource(R.drawable.temp_deactivate);
            }
        });

        //setting green button for check click
        s4_temp_check.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //   Toast.makeText(getApplicationContext(), "Window Opened", Toast.LENGTH_SHORT).show();
                s4_Imgtemparature.setImageResource(R.drawable.temp_check);
            }
        });
    }


    public void humidity(){

        s4_humi_active = (Button) findViewById(R.id.s4_humidity_active);
        s4_humi_deactive = (Button) findViewById(R.id.s4_humidity_deactive);
        s4_humi_check = (Button) findViewById(R.id.s4_humidity_check);
        s4_Imghumidity = (ImageButton) findViewById(R.id.s4_humidity);

        //setting blue button for active click
        s4_humi_active.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //   Toast.makeText(getApplicationContext(), "Window Opened", Toast.LENGTH_SHORT).show();
                s4_Imghumidity.setImageResource(R.drawable.humi_active);
            }
        });

        s4_humi_deactive.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //   Toast.makeText(getApplicationContext(), "Window Opened", Toast.LENGTH_SHORT).show();
                s4_Imghumidity.setImageResource(R.drawable.humi_deactive);
            }
        });

        //setting red button for deactive click
        s4_humi_check.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //   Toast.makeText(getApplicationContext(), "Window Opened", Toast.LENGTH_SHORT).show();
                s4_Imghumidity.setImageResource(R.drawable.humid_check);
            }
        });
    }


    //for autolight button
    public void autolight() {
        s4_autolight_active = (Button) findViewById(R.id.s4_autolight_active);
        s4_autolight_deactive = (Button) findViewById(R.id.s4_autolight_deactive);
        s4_Imgautolight = (ImageButton) findViewById(R.id.s4_autolight);

        //setting blue button for active click
        s4_autolight_active.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //   Toast.makeText(getApplicationContext(), "Window Opened", Toast.LENGTH_SHORT).show();
                s4_Imgautolight.setImageResource(R.drawable.autolightcntrller_active);
            }
        });

        //setting red button for deactive click
        s4_autolight_deactive.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //   Toast.makeText(getApplicationContext(), "Window Opened", Toast.LENGTH_SHORT).show();
                s4_Imgautolight.setImageResource(R.drawable.autolightcntrller_deactive);
            }
        });
    }


    //for motion button
    public void motion() {
        s4_motion_active = (Button) findViewById(R.id.s4_motion_active);
        s4_motion_deactive = (Button) findViewById(R.id.s4_motion_deactive);
        s4_Imgmotion = (ImageButton) findViewById(R.id.s4_motion);

        //setting blue button for active click
        s4_motion_active.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //   Toast.makeText(getApplicationContext(), "Window Opened", Toast.LENGTH_SHORT).show();
                s4_Imgmotion.setImageResource(R.drawable.motion_actvate);
            }
        });

        //setting red button for deactive click
        s4_motion_deactive.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //   Toast.makeText(getApplicationContext(), "Window Opened", Toast.LENGTH_SHORT).show();
                s4_Imgmotion.setImageResource(R.drawable.motion_deactvate);
            }
        });
    }


    //for smoke button
    public void smoke() {
        s4_smoke_active = (Button) findViewById(R.id.s4_smoke_active);
        s4_smoke_deactive = (Button) findViewById(R.id.s4_smoke_deactive);
        s4_Imgsmoke = (ImageButton) findViewById(R.id.s4_smoke);

        //setting blue button for active click
        s4_smoke_active.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //   Toast.makeText(getApplicationContext(), "Window Opened", Toast.LENGTH_SHORT).show();
                s4_Imgsmoke.setImageResource(R.drawable.smoke_active);
            }
        });

        //setting red button for deactive click
        s4_smoke_deactive.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //   Toast.makeText(getApplicationContext(), "Window Opened", Toast.LENGTH_SHORT).show();
                s4_Imgsmoke.setImageResource(R.drawable.smoke_deactive);
            }
        });
    }

    //for fan button
    public void fan() {
        s4_fan_on = (Button) findViewById(R.id.s4_fan_on);
        s4_fan_off = (Button) findViewById(R.id.fan_off);
        s4_Imgfan = (ImageButton) findViewById(R.id.s4_fan);

        //setting blue button for on click
        s4_fan_on.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //   Toast.makeText(getApplicationContext(), "Window Opened", Toast.LENGTH_SHORT).show();
                s4_Imgfan.setImageResource(R.drawable.fan_on);
            }
        });

        //setting red button for off click
        s4_fan_off.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //   Toast.makeText(getApplicationContext(), "Window Opened", Toast.LENGTH_SHORT).show();
                s4_Imgfan.setImageResource(R.drawable.fan_off);
            }
        });
    }

    public void light(){
        s4light_on =(Button)findViewById(R.id.s4_light_on);
        s4light_off=(Button)findViewById(R.id.s4_light_off);
        s4_Imglight=(ImageButton)findViewById(R.id.s4_light);


        s4light_on.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //   Toast.makeText(getApplicationContext(), "Window Opened", Toast.LENGTH_SHORT).show();
                s4_Imglight.setImageResource(R.drawable.bulb_on);
            }
        });

        s4light_off.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //   Toast.makeText(getApplicationContext(), "Window Opened", Toast.LENGTH_SHORT).show();
                s4_Imglight.setImageResource(R.drawable.bulb_off);
            }
        });

    }




}
