package com.example.naseeha.inter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import com.example.naseeha.inter.R;

public class segment7 extends AppCompatActivity {


    //smoke motion autolight humidity temparature

    Button s7light_on,s7light_off,s7_fan_on,s7_fan_off,s7_smoke_active,s7_smoke_deactive,s7_motion_active,s7_motion_deactive,s7_autolight_active,s7_autolight_deactive;
    Button s7_humi_active,s7_humi_deactive,s7_humi_check,s7_temp_active,s7_temp_deactive,s7_temp_check;
    ImageButton s7_Imglight,s7_Imgfan,s7_Imgmotion,s7_Imgautolight,s7_Imghumidity,s7_Imgtemparature,s7_Imgsmoke;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segment7);

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
        s7_temp_active = (Button) findViewById(R.id.s7_temperature_active);
        s7_temp_deactive = (Button) findViewById(R.id.s7_temparature_deactive);
        s7_temp_check = (Button) findViewById(R.id.s7_temparature_check);
        s7_Imgtemparature = (ImageButton) findViewById(R.id.s7_temparature);



        //setting blue button for active click
        s7_temp_active.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //   Toast.makeText(getApplicationContext(), "Window Opened", Toast.LENGTH_SHORT).show();
                s7_Imgtemparature.setImageResource(R.drawable.temp_activate);
            }
        });

        //setting  red button for deactive click
        s7_temp_deactive.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //   Toast.makeText(getApplicationContext(), "Window Opened", Toast.LENGTH_SHORT).show();
                s7_Imgtemparature.setImageResource(R.drawable.temp_deactivate);
            }
        });

        //setting green button for check click
        s7_temp_check.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //   Toast.makeText(getApplicationContext(), "Window Opened", Toast.LENGTH_SHORT).show();
                s7_Imgtemparature.setImageResource(R.drawable.temp_check);
            }
        });
    }


    public void humidity(){

        s7_humi_active = (Button) findViewById(R.id.s7_humidity_active);
        s7_humi_deactive = (Button) findViewById(R.id.s7_humidity_deactive);
        s7_humi_check = (Button) findViewById(R.id.s7_humidity_check);
        s7_Imghumidity = (ImageButton) findViewById(R.id.s7_humidity);

        //setting blue button for active click
        s7_humi_active.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //   Toast.makeText(getApplicationContext(), "Window Opened", Toast.LENGTH_SHORT).show();
                s7_Imghumidity.setImageResource(R.drawable.humi_active);
            }
        });

        s7_humi_deactive.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //   Toast.makeText(getApplicationContext(), "Window Opened", Toast.LENGTH_SHORT).show();
                s7_Imghumidity.setImageResource(R.drawable.humi_deactive);
            }
        });

        //setting red button for deactive click
        s7_humi_check.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //   Toast.makeText(getApplicationContext(), "Window Opened", Toast.LENGTH_SHORT).show();
                s7_Imghumidity.setImageResource(R.drawable.humid_check);
            }
        });
    }


    //for autolight button
    public void autolight() {
        s7_autolight_active = (Button) findViewById(R.id.s7_autolight_active);
        s7_autolight_deactive = (Button) findViewById(R.id.s7_autolight_deactive);
        s7_Imgautolight = (ImageButton) findViewById(R.id.s7_autolight);

        //setting blue button for active click
        s7_autolight_active.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //   Toast.makeText(getApplicationContext(), "Window Opened", Toast.LENGTH_SHORT).show();
                s7_Imgautolight.setImageResource(R.drawable.autolightcntrller_active);
            }
        });

        //setting red button for deactive click
        s7_autolight_deactive.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //   Toast.makeText(getApplicationContext(), "Window Opened", Toast.LENGTH_SHORT).show();
                s7_Imgautolight.setImageResource(R.drawable.autolightcntrller_deactive);
            }
        });
    }


    //for motion button
    public void motion() {
        s7_motion_active = (Button) findViewById(R.id.s7_motion_active);
        s7_motion_deactive = (Button) findViewById(R.id.s7_motion_deactive);
        s7_Imgmotion = (ImageButton) findViewById(R.id.s7_motion);

        //setting blue button for active click
        s7_motion_active.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //   Toast.makeText(getApplicationContext(), "Window Opened", Toast.LENGTH_SHORT).show();
                s7_Imgmotion.setImageResource(R.drawable.motion_actvate);
            }
        });

        //setting red button for deactive click
        s7_motion_deactive.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //   Toast.makeText(getApplicationContext(), "Window Opened", Toast.LENGTH_SHORT).show();
                s7_Imgmotion.setImageResource(R.drawable.motion_deactvate);
            }
        });
    }


    //for smoke button
    public void smoke() {
        s7_smoke_active = (Button) findViewById(R.id.s7_smoke_active);
        s7_smoke_deactive = (Button) findViewById(R.id.s7_smoke_deactive);
        s7_Imgsmoke = (ImageButton) findViewById(R.id.s7_smoke);

        //setting blue button for active click
        s7_smoke_active.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //   Toast.makeText(getApplicationContext(), "Window Opened", Toast.LENGTH_SHORT).show();
                s7_Imgsmoke.setImageResource(R.drawable.smoke_active);
            }
        });

        //setting red button for deactive click
        s7_smoke_deactive.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //   Toast.makeText(getApplicationContext(), "Window Opened", Toast.LENGTH_SHORT).show();
                s7_Imgsmoke.setImageResource(R.drawable.smoke_deactive);
            }
        });
    }

    //for fan button
    public void fan() {
        s7_fan_on = (Button) findViewById(R.id.s7_fan_on);
        s7_fan_off = (Button) findViewById(R.id.fan_off);
        s7_Imgfan = (ImageButton) findViewById(R.id.s7_fan);

        //setting blue button for on click
        s7_fan_on.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //   Toast.makeText(getApplicationContext(), "Window Opened", Toast.LENGTH_SHORT).show();
                s7_Imgfan.setImageResource(R.drawable.fan_on);
            }
        });

        //setting red button for off click
        s7_fan_off.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //   Toast.makeText(getApplicationContext(), "Window Opened", Toast.LENGTH_SHORT).show();
                s7_Imgfan.setImageResource(R.drawable.fan_off);
            }
        });
    }

    public void light(){
        s7light_on =(Button)findViewById(R.id.s7_light_on);
        s7light_off=(Button)findViewById(R.id.s7_light_off);
        s7_Imglight=(ImageButton)findViewById(R.id.s7_light);


        s7light_on.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //   Toast.makeText(getApplicationContext(), "Window Opened", Toast.LENGTH_SHORT).show();
                s7_Imglight.setImageResource(R.drawable.bulb_on);
            }
        });

        s7light_off.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //   Toast.makeText(getApplicationContext(), "Window Opened", Toast.LENGTH_SHORT).show();
                s7_Imglight.setImageResource(R.drawable.bulb_off);
            }
        });

    }




}
