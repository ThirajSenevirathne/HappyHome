package com.example.naseeha.inter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import com.example.naseeha.inter.R;

public class segment5 extends AppCompatActivity {


    //smoke motion autolight humidity temparature

    Button s5light_on,s5light_off,s5_fan_on,s5_fan_off,s5_smoke_active,s5_smoke_deactive,s5_motion_active,s5_motion_deactive,s5_autolight_active,s5_autolight_deactive;
    Button s5_humi_active,s5_humi_deactive,s5_humi_check,s5_temp_active,s5_temp_deactive,s5_temp_check;
    ImageButton s5_Imglight,s5_Imgfan,s5_Imgmotion,s5_Imgautolight,s5_Imghumidity,s5_Imgtemparature,s5_Imgsmoke;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segment5);

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
        s5_temp_active = (Button) findViewById(R.id.s5_temperature_active);
        s5_temp_deactive = (Button) findViewById(R.id.s5_temparature_deactive);
        s5_temp_check = (Button) findViewById(R.id.s5_temparature_check);
        s5_Imgtemparature = (ImageButton) findViewById(R.id.s5_temparature);



        //setting blue button for active click
        s5_temp_active.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //   Toast.makeText(getApplicationContext(), "Window Opened", Toast.LENGTH_SHORT).show();
                s5_Imgtemparature.setImageResource(R.drawable.temp_activate);
            }
        });

        //setting  red button for deactive click
        s5_temp_deactive.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //   Toast.makeText(getApplicationContext(), "Window Opened", Toast.LENGTH_SHORT).show();
                s5_Imgtemparature.setImageResource(R.drawable.temp_deactivate);
            }
        });

        //setting green button for check click
        s5_temp_check.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //   Toast.makeText(getApplicationContext(), "Window Opened", Toast.LENGTH_SHORT).show();
                s5_Imgtemparature.setImageResource(R.drawable.temp_check);
            }
        });
    }


    public void humidity(){

        s5_humi_active = (Button) findViewById(R.id.s5_humidity_active);
        s5_humi_deactive = (Button) findViewById(R.id.s5_humidity_deactive);
        s5_humi_check = (Button) findViewById(R.id.s5_humidity_check);
        s5_Imghumidity = (ImageButton) findViewById(R.id.s5_humidity);

        //setting blue button for active click
        s5_humi_active.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //   Toast.makeText(getApplicationContext(), "Window Opened", Toast.LENGTH_SHORT).show();
                s5_Imghumidity.setImageResource(R.drawable.humi_active);
            }
        });

        s5_humi_deactive.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //   Toast.makeText(getApplicationContext(), "Window Opened", Toast.LENGTH_SHORT).show();
                s5_Imghumidity.setImageResource(R.drawable.humi_deactive);
            }
        });

        //setting red button for deactive click
        s5_humi_check.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //   Toast.makeText(getApplicationContext(), "Window Opened", Toast.LENGTH_SHORT).show();
                s5_Imghumidity.setImageResource(R.drawable.humid_check);
            }
        });
    }


    //for autolight button
    public void autolight() {
        s5_autolight_active = (Button) findViewById(R.id.s5_autolight_active);
        s5_autolight_deactive = (Button) findViewById(R.id.s5_autolight_deactive);
        s5_Imgautolight = (ImageButton) findViewById(R.id.s5_autolight);

        //setting blue button for active click
        s5_autolight_active.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //   Toast.makeText(getApplicationContext(), "Window Opened", Toast.LENGTH_SHORT).show();
                s5_Imgautolight.setImageResource(R.drawable.autolightcntrller_active);
            }
        });

        //setting red button for deactive click
        s5_autolight_deactive.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //   Toast.makeText(getApplicationContext(), "Window Opened", Toast.LENGTH_SHORT).show();
                s5_Imgautolight.setImageResource(R.drawable.autolightcntrller_deactive);
            }
        });
    }


    //for motion button
    public void motion() {
        s5_motion_active = (Button) findViewById(R.id.s5_motion_active);
        s5_motion_deactive = (Button) findViewById(R.id.s5_motion_deactive);
        s5_Imgmotion = (ImageButton) findViewById(R.id.s5_motion);

        //setting blue button for active click
        s5_motion_active.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //   Toast.makeText(getApplicationContext(), "Window Opened", Toast.LENGTH_SHORT).show();
                s5_Imgmotion.setImageResource(R.drawable.motion_actvate);
            }
        });

        //setting red button for deactive click
        s5_motion_deactive.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //   Toast.makeText(getApplicationContext(), "Window Opened", Toast.LENGTH_SHORT).show();
                s5_Imgmotion.setImageResource(R.drawable.motion_deactvate);
            }
        });
    }


    //for smoke button
    public void smoke() {
        s5_smoke_active = (Button) findViewById(R.id.s5_smoke_active);
        s5_smoke_deactive = (Button) findViewById(R.id.s5_smoke_deactive);
        s5_Imgsmoke = (ImageButton) findViewById(R.id.s5_smoke);

        //setting blue button for active click
        s5_smoke_active.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //   Toast.makeText(getApplicationContext(), "Window Opened", Toast.LENGTH_SHORT).show();
                s5_Imgsmoke.setImageResource(R.drawable.smoke_active);
            }
        });

        //setting red button for deactive click
        s5_smoke_deactive.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //   Toast.makeText(getApplicationContext(), "Window Opened", Toast.LENGTH_SHORT).show();
                s5_Imgsmoke.setImageResource(R.drawable.smoke_deactive);
            }
        });
    }

    //for fan button
    public void fan() {
        s5_fan_on = (Button) findViewById(R.id.s5_fan_on);
        s5_fan_off = (Button) findViewById(R.id.fan_off);
        s5_Imgfan = (ImageButton) findViewById(R.id.s5_fan);

        //setting blue button for on click
        s5_fan_on.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //   Toast.makeText(getApplicationContext(), "Window Opened", Toast.LENGTH_SHORT).show();
                s5_Imgfan.setImageResource(R.drawable.fan_on);
            }
        });

        //setting red button for off click
        s5_fan_off.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //   Toast.makeText(getApplicationContext(), "Window Opened", Toast.LENGTH_SHORT).show();
                s5_Imgfan.setImageResource(R.drawable.fan_off);
            }
        });
    }

    public void light(){
        s5light_on =(Button)findViewById(R.id.s5_light_on);
        s5light_off=(Button)findViewById(R.id.s5_light_off);
        s5_Imglight=(ImageButton)findViewById(R.id.s5_light);


        s5light_on.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //   Toast.makeText(getApplicationContext(), "Window Opened", Toast.LENGTH_SHORT).show();
                s5_Imglight.setImageResource(R.drawable.bulb_on);
            }
        });

        s5light_off.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //   Toast.makeText(getApplicationContext(), "Window Opened", Toast.LENGTH_SHORT).show();
                s5_Imglight.setImageResource(R.drawable.bulb_off);
            }
        });

    }




}
