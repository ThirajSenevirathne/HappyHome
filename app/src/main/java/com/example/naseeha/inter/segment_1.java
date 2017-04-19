package com.example.naseeha.inter;

//import android.content.Intent;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import com.example.naseeha.inter.R;
import com.score.senz.ISenzService;
import com.score.senzc.enums.SenzTypeEnum;
import com.score.senzc.pojos.Senz;
import com.score.senzc.pojos.User;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Objects;


public class segment_1 extends AppCompatActivity {


    String key_value;
    Button s1light_on,s1light_off,s1_fan_on,s1_fan_off,s1_smoke_active,s1_smoke_deactive,s1_motion_active,s1_motion_deactive,s1_autolight_active,s1_autolight_deactive;
    Button s1_humi_active,s1_humi_deactive,s1_humi_check,s1_temp_active,s1_temp_deactive,s1_temp_check;
    ImageButton s1_Imglight,s1_Imgfan,s1_Imgmotion,s1_Imgautolight,s1_Imghumidity,s1_Imgtemparature,s1_Imgsmoke;


    //---------------sect01------
    String TAG ="Main";
    private ISenzService senzService = null;

    private ServiceConnection senzServiceConnection = new ServiceConnection() {
        public void onServiceConnected(ComponentName className, IBinder service) {
            Log.e(TAG, "Connected with senz service");
            senzService = ISenzService.Stub.asInterface(service);
            if(senzService==null){
                Log.e(TAG, "Connected with senz service IT IS NULL");
            }
        }

        public void onServiceDisconnected(ComponentName className) {
            Log.e(TAG, "Disconnected from senz service");
            senzService = null;
        }
    };
    //---------------sect01------END---


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segment_1);

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
        s1_temp_active = (Button) findViewById(R.id.s1_temperature_active);
        s1_temp_deactive = (Button) findViewById(R.id.s1_temparature_deactive);
        s1_temp_check = (Button) findViewById(R.id.s1_temparature_check);
        s1_Imgtemparature = (ImageButton) findViewById(R.id.s1_temparature);

        //-----sect02
        Intent intent = new Intent();
        intent.setClassName("com.score.senz", "com.score.senz.services.RemoteSenzService");
        startService(intent);
        bindService(intent, senzServiceConnection, BIND_AUTO_CREATE);
        //--Sect 02 END

        // Register senzMessageReceiver to receive messages.
        registerReceiver(senzMessageReceiver, new IntentFilter("com.score.senz.DATA_SENZ"));

        //setting blue button for active click
        s1_temp_active.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //   Toast.makeText(getApplicationContext(), "Window Opened", Toast.LENGTH_SHORT).show();
                s1_Imgtemparature.setImageResource(R.drawable.temp_activate);

                //-----sect03

                User receiver = new User("id", "client_1");

                LinkedHashMap<String,String> senzAttributes=new LinkedHashMap<>();
                senzAttributes.put("version1_temp_on","100");
                //senzAttributes.put("b", "5555");


                String id = "_ID";
                String signature = "_SIGNATURE";
                SenzTypeEnum senzType = SenzTypeEnum.GET;
                Senz x=new Senz(id, signature, senzType, null, receiver, senzAttributes);
                try {
                    senzService.send(x);
                } catch (Exception e) {
                    e.printStackTrace();
                }

                //-----sect03---end
            }
        });

        s1_temp_deactive.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //   Toast.makeText(getApplicationContext(), "Window Opened", Toast.LENGTH_SHORT).show();
                s1_Imgtemparature.setImageResource(R.drawable.temp_deactivate);

                //-----sect03

                User receiver = new User("id", "client_1");

                LinkedHashMap<String,String> senzAttributes=new LinkedHashMap<>();
                senzAttributes.put("version1_temp_off","100");
                //senzAttributes.put("b", "5555");


                String id = "_ID";
                String signature = "_SIGNATURE";
                SenzTypeEnum senzType = SenzTypeEnum.GET;
                Senz x=new Senz(id, signature, senzType, null, receiver, senzAttributes);
                try {
                    senzService.send(x);
                } catch (Exception e) {
                    e.printStackTrace();
                }

                //-----sect03---end
            }
        });

        s1_temp_check.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //   Toast.makeText(getApplicationContext(), "Window Opened", Toast.LENGTH_SHORT).show();
                s1_Imgtemparature.setImageResource(R.drawable.temp_check);

                //-----sect03

                User receiver = new User("id", "client_1");

                LinkedHashMap<String,String> senzAttributes=new LinkedHashMap<>();
                senzAttributes.put("version1_temp_check","100");
                //senzAttributes.put("b", "5555");


                String id = "_ID";
                String signature = "_SIGNATURE";
                SenzTypeEnum senzType = SenzTypeEnum.GET;
                Senz x=new Senz(id, signature, senzType, null, receiver, senzAttributes);
                try {
                    senzService.send(x);
                } catch (Exception e) {
                    e.printStackTrace();
                }

                //-----sect03---end

            }

        });
    }


    public void humidity(){

        s1_humi_active = (Button) findViewById(R.id.s1_humidity_active);
        s1_humi_deactive = (Button) findViewById(R.id.s1_humidity_deactive);
        s1_humi_check = (Button) findViewById(R.id.s1_humidity_check);
        s1_Imghumidity = (ImageButton) findViewById(R.id.s1_humidity);

        //-----sect02
        Intent intent = new Intent();
        intent.setClassName("com.score.senz", "com.score.senz.services.RemoteSenzService");
        startService(intent);
        bindService(intent, senzServiceConnection, BIND_AUTO_CREATE);
        //--Sect 02 END

        // Register senzMessageReceiver to receive messages.
        registerReceiver(senzMessageReceiver, new IntentFilter("com.score.senz.DATA_SENZ"));

        //setting blue button for active click
        s1_humi_active.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //   Toast.makeText(getApplicationContext(), "Window Opened", Toast.LENGTH_SHORT).show();
                s1_Imghumidity.setImageResource(R.drawable.humi_active);

                //-----sect03

                User receiver = new User("id", "client_1");

                LinkedHashMap<String,String> senzAttributes=new LinkedHashMap<>();
                senzAttributes.put("version1_humid_active","100");
                //senzAttributes.put("b", "5555");


                String id = "_ID";
                String signature = "_SIGNATURE";
                SenzTypeEnum senzType = SenzTypeEnum.GET;
                Senz x=new Senz(id, signature, senzType, null, receiver, senzAttributes);
                try {
                    senzService.send(x);
                } catch (Exception e) {
                    e.printStackTrace();
                }

                //-----sect03---end
            }
        });

        s1_humi_deactive.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //   Toast.makeText(getApplicationContext(), "Window Opened", Toast.LENGTH_SHORT).show();
                s1_Imghumidity.setImageResource(R.drawable.humi_deactive);

                //-----sect03

                User receiver = new User("id", "client_1");

                LinkedHashMap<String,String> senzAttributes=new LinkedHashMap<>();
                senzAttributes.put("Living1_temp_check","100");
                //senzAttributes.put("b", "5555");


                String id = "_ID";
                String signature = "_SIGNATURE";
                SenzTypeEnum senzType = SenzTypeEnum.GET;
                Senz x=new Senz(id, signature, senzType, null, receiver, senzAttributes);
                try {
                    senzService.send(x);
                } catch (Exception e) {
                    e.printStackTrace();
                }

                //-----sect03---end
            }
        });

        s1_humi_check.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //   Toast.makeText(getApplicationContext(), "Window Opened", Toast.LENGTH_SHORT).show();
                s1_Imghumidity.setImageResource(R.drawable.humid_check);

                //-----sect03

                User receiver = new User("id", "client_1");

                LinkedHashMap<String,String> senzAttributes=new LinkedHashMap<>();
                senzAttributes.put("version1_humid_check","100");
                //senzAttributes.put("b", "5555");


                String id = "_ID";
                String signature = "_SIGNATURE";
                SenzTypeEnum senzType = SenzTypeEnum.GET;
                Senz x=new Senz(id, signature, senzType, null, receiver, senzAttributes);
                try {
                    senzService.send(x);
                } catch (Exception e) {
                    e.printStackTrace();
                }

                //-----sect03---end
            }
        });
    }


    public void autolight() {
        s1_autolight_active = (Button) findViewById(R.id.s1_autolight_active);
        s1_autolight_deactive = (Button) findViewById(R.id.s1_autolight_deactive);
        s1_Imgautolight = (ImageButton) findViewById(R.id.s1_autolight);

        //-----sect02
        Intent intent = new Intent();
        intent.setClassName("com.score.senz", "com.score.senz.services.RemoteSenzService");
        startService(intent);
        bindService(intent, senzServiceConnection, BIND_AUTO_CREATE);
        //--Sect 02 END

        // Register senzMessageReceiver to receive messages.
        registerReceiver(senzMessageReceiver, new IntentFilter("com.score.senz.DATA_SENZ"));

        s1_autolight_active.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //   Toast.makeText(getApplicationContext(), "Window Opened", Toast.LENGTH_SHORT).show();
                s1_Imgautolight.setImageResource(R.drawable.autolightcntrller_active);

                //-----sect03

                User receiver = new User("id", "client_1");

                LinkedHashMap<String,String> senzAttributes=new LinkedHashMap<>();
                senzAttributes.put("version1_autolight_on","100");
                //senzAttributes.put("b", "5555");


                String id = "_ID";
                String signature = "_SIGNATURE";
                SenzTypeEnum senzType = SenzTypeEnum.GET;
                Senz x=new Senz(id, signature, senzType, null, receiver, senzAttributes);
                try {
                    senzService.send(x);
                } catch (Exception e) {
                    e.printStackTrace();
                }

                //-----sect03---end
            }
        });

        s1_autolight_deactive.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //   Toast.makeText(getApplicationContext(), "Window Opened", Toast.LENGTH_SHORT).show();
                s1_Imgautolight.setImageResource(R.drawable.autolightcntrller_deactive);

                //-----sect03

                User receiver = new User("id", "client_1");

                LinkedHashMap<String,String> senzAttributes=new LinkedHashMap<>();
                senzAttributes.put("version1_autolight_off","100");
                //senzAttributes.put("b", "5555");


                String id = "_ID";
                String signature = "_SIGNATURE";
                SenzTypeEnum senzType = SenzTypeEnum.GET;
                Senz x=new Senz(id, signature, senzType, null, receiver, senzAttributes);
                try {
                    senzService.send(x);
                } catch (Exception e) {
                    e.printStackTrace();
                }

                //-----sect03---end
            }
        });
    }


    public void motion() {
        s1_motion_active = (Button) findViewById(R.id.s1_motion_active);
        s1_motion_deactive = (Button) findViewById(R.id.s1_motion_deactive);
        s1_Imgmotion = (ImageButton) findViewById(R.id.s1_motion);

        //-----sect02
        Intent intent = new Intent();
        intent.setClassName("com.score.senz", "com.score.senz.services.RemoteSenzService");
        startService(intent);
        bindService(intent, senzServiceConnection, BIND_AUTO_CREATE);
        //--Sect 02 END

        // Register senzMessageReceiver to receive messages.
        registerReceiver(senzMessageReceiver, new IntentFilter("com.score.senz.DATA_SENZ"));

        s1_motion_active.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //   Toast.makeText(getApplicationContext(), "Window Opened", Toast.LENGTH_SHORT).show();
                s1_Imgmotion.setImageResource(R.drawable.motion_actvate);

                //-----sect03

                User receiver = new User("id", "client_1");

                LinkedHashMap<String,String> senzAttributes=new LinkedHashMap<>();
                senzAttributes.put("version1_pir_on","100");
                //senzAttributes.put("b", "5555");


                String id = "_ID";
                String signature = "_SIGNATURE";
                SenzTypeEnum senzType = SenzTypeEnum.GET;
                Senz x=new Senz(id, signature, senzType, null, receiver, senzAttributes);
                try {
                    senzService.send(x);
                } catch (Exception e) {
                    e.printStackTrace();
                }

                //-----sect03---end
            }
        });

        //setting red button for deactive click
        s1_motion_deactive.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //   Toast.makeText(getApplicationContext(), "Window Opened", Toast.LENGTH_SHORT).show();
                s1_Imgmotion.setImageResource(R.drawable.motion_deactvate);

                //-----sect03

                User receiver = new User("id", "client_1");

                LinkedHashMap<String,String> senzAttributes=new LinkedHashMap<>();
                senzAttributes.put("version1_pir_off","100");
                //senzAttributes.put("b", "5555");


                String id = "_ID";
                String signature = "_SIGNATURE";
                SenzTypeEnum senzType = SenzTypeEnum.GET;
                Senz x=new Senz(id, signature, senzType, null, receiver, senzAttributes);
                try {
                    senzService.send(x);
                } catch (Exception e) {
                    e.printStackTrace();
                }

                //-----sect03---end
            }
        });
    }


    public void smoke() {
        s1_smoke_active = (Button) findViewById(R.id.s1_smoke_active);
        s1_smoke_deactive = (Button) findViewById(R.id.s1_smoke_deactive);
        s1_Imgsmoke = (ImageButton) findViewById(R.id.s1_smoke);

        //-----sect02
        Intent intent = new Intent();
        intent.setClassName("com.score.senz", "com.score.senz.services.RemoteSenzService");
        startService(intent);
        bindService(intent, senzServiceConnection, BIND_AUTO_CREATE);
        //--Sect 02 END

        // Register senzMessageReceiver to receive messages.
        registerReceiver(senzMessageReceiver, new IntentFilter("com.score.senz.DATA_SENZ"));

        //setting blue button for active click
        s1_smoke_active.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //   Toast.makeText(getApplicationContext(), "Window Opened", Toast.LENGTH_SHORT).show();
                s1_Imgsmoke.setImageResource(R.drawable.smoke_active);

                //-----sect03

                User receiver = new User("id", "client_1");

                LinkedHashMap<String,String> senzAttributes=new LinkedHashMap<>();
                //senzAttributes.put("version1_smoke_on","100");
                senzAttributes.put("Living1_temp_check","100");
                //senzAttributes.put("b", "5555");


                String id = "_ID";
                String signature = "_SIGNATURE";
                SenzTypeEnum senzType = SenzTypeEnum.GET;
                Senz x=new Senz(id, signature, senzType, null, receiver, senzAttributes);
                try {
                    senzService.send(x);
                } catch (Exception e) {
                    e.printStackTrace();
                }

                //-----sect03---end
            }
        });

        //setting red button for deactive click
        s1_smoke_deactive.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //   Toast.makeText(getApplicationContext(), "Window Opened", Toast.LENGTH_SHORT).show();
                s1_Imgsmoke.setImageResource(R.drawable.smoke_deactive);

                //-----sect03

                User receiver = new User("id", "client_1");

                LinkedHashMap<String,String> senzAttributes=new LinkedHashMap<>();
                //senzAttributes.put("version1_smoke_off","100");
                senzAttributes.put("Living1_temp_check","100");
                //senzAttributes.put("b", "5555");


                String id = "_ID";
                String signature = "_SIGNATURE";
                SenzTypeEnum senzType = SenzTypeEnum.GET;
                Senz x=new Senz(id, signature, senzType, null, receiver, senzAttributes);
                try {
                    senzService.send(x);
                } catch (Exception e) {
                    e.printStackTrace();
                }

                //-----sect03---end
            }
        });
    }

    public void fan() {
        s1_fan_on = (Button) findViewById(R.id.s1_fan_on);
        s1_fan_off = (Button) findViewById(R.id.fan_off);
        s1_Imgfan = (ImageButton) findViewById(R.id.s1_fan);

        //-----sect02
        Intent intent = new Intent();
        intent.setClassName("com.score.senz", "com.score.senz.services.RemoteSenzService");
        startService(intent);
        bindService(intent, senzServiceConnection, BIND_AUTO_CREATE);
        //--Sect 02 END

        // Register senzMessageReceiver to receive messages.
        registerReceiver(senzMessageReceiver, new IntentFilter("com.score.senz.DATA_SENZ"));

        //setting blue button for on click
        s1_fan_on.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //   Toast.makeText(getApplicationContext(), "Window Opened", Toast.LENGTH_SHORT).show();
                s1_Imgfan.setImageResource(R.drawable.fan_on);

                //-----sect03

                User receiver = new User("id", "client_1");

                LinkedHashMap<String,String> senzAttributes=new LinkedHashMap<>();
                senzAttributes.put("version1_fan_on","100");
                //senzAttributes.put("b", "5555");


                String id = "_ID";
                String signature = "_SIGNATURE";
                SenzTypeEnum senzType = SenzTypeEnum.GET;
                Senz x=new Senz(id, signature, senzType, null, receiver, senzAttributes);
                try {
                    senzService.send(x);
                } catch (Exception e) {
                    e.printStackTrace();
                }

                //-----sect03---end
            }
        });

        //setting red button for off click
        s1_fan_off.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //   Toast.makeText(getApplicationContext(), "Window Opened", Toast.LENGTH_SHORT).show();
                s1_Imgfan.setImageResource(R.drawable.fan_off);

                //-----sect03

                User receiver = new User("id", "client_1");

                LinkedHashMap<String,String> senzAttributes=new LinkedHashMap<>();
                senzAttributes.put("version1_fan_off","100");
                //senzAttributes.put("b", "5555");


                String id = "_ID";
                String signature = "_SIGNATURE";
                SenzTypeEnum senzType = SenzTypeEnum.GET;
                Senz x=new Senz(id, signature, senzType, null, receiver, senzAttributes);
                try {
                    senzService.send(x);
                } catch (Exception e) {
                    e.printStackTrace();
                }

                //-----sect03---end
            }
        });
    }

    public void light(){
        s1light_on =(Button)findViewById(R.id.s1_light_on);
        s1light_off=(Button)findViewById(R.id.s1_light_off);
        s1_Imglight=(ImageButton)findViewById(R.id.s1_light);

        //-----sect02
        Intent intent = new Intent();
        intent.setClassName("com.score.senz", "com.score.senz.services.RemoteSenzService");
        startService(intent);
        bindService(intent, senzServiceConnection, BIND_AUTO_CREATE);
        //--Sect 02 END

        // Register senzMessageReceiver to receive messages.
        registerReceiver(senzMessageReceiver, new IntentFilter("com.score.senz.DATA_SENZ"));

            s1light_on.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    //   Toast.makeText(getApplicationContext(), "Window Opened", Toast.LENGTH_SHORT).show();
                    s1_Imglight.setImageResource(R.drawable.bulb_on);

                    //-----sect03

                    User receiver = new User("id", "client_1");

                    LinkedHashMap<String,String> senzAttributes=new LinkedHashMap<>();
                    senzAttributes.put("version1_light_on","100");
                    //senzAttributes.put("b", "5555");


                    String id = "_ID";
                    String signature = "_SIGNATURE";
                    SenzTypeEnum senzType = SenzTypeEnum.GET;
                    Senz x=new Senz(id, signature, senzType, null, receiver, senzAttributes);
                    try {
                        senzService.send(x);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }

                    //-----sect03---end
                }
            });

            s1light_off.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    //   Toast.makeText(getApplicationContext(), "Window Opened", Toast.LENGTH_SHORT).show();
                    s1_Imglight.setImageResource(R.drawable.bulb_off);

                    //-----sect03

                    User receiver = new User("id", "client_1");

                    LinkedHashMap<String,String> senzAttributes=new LinkedHashMap<>();
                    senzAttributes.put("version1_light_off","100");
                    //senzAttributes.put("b", "5555");


                    String id = "_ID";
                    String signature = "_SIGNATURE";
                    SenzTypeEnum senzType = SenzTypeEnum.GET;
                    Senz x=new Senz(id, signature, senzType, null, receiver, senzAttributes);
                    try {
                        senzService.send(x);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }

                    //-----sect03---end
                }
            });

    }

    // Receives data senz to here
    private BroadcastReceiver senzMessageReceiver = new BroadcastReceiver() {
        @Override
        public void onReceive(Context context, Intent intent) {

            //get a senz object.Now we can handle ui from here.................
            Senz senz = intent.getExtras().getParcelable("SENZ");
            Log.d(TAG, "Got message from Senz service *** ");
            //handleMessage(intent);

            LinkedHashMap hashMap=senz.getAttributes();

            Log.d(TAG, "message is  "+hashMap);

            /*Object[] objects = hashMap.keySet().toArray();
            String key_value = String.valueOf(objects[1]);
            Object sensr=hashMap.get(key_value);
            Log.d(TAG, "message is  "+hashMap.get(key_value)); */

            Object second=hashMap.keySet().toArray()[0];
            Object value=hashMap.get(second);
            key_value = String.valueOf(value);
            Log.d(TAG, "message is  "+key_value);

            displayAlert();


        }
    };

    private void displayAlert(){
        AlertDialog.Builder builder=new AlertDialog.Builder(this);
        builder.setMessage(key_value)
                .create();
        builder.show();
    }

    protected void onDestroy(){
        //super.onDestroy();
        unregisterReceiver(senzMessageReceiver);
    }

    protected void onPause(){
        //super.onPause();
        unregisterReceiver(senzMessageReceiver);
    }


}
