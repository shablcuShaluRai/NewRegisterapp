package com.shablcu.shalu.newregisterpro;

import android.content.DialogInterface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        try {
            View.OnClickListener handler = new View.OnClickListener(){
                public void onClick(View v) {

                    switch (v.getId()) {

                        case R.id.login:
                            Toast.makeText(getBaseContext(), "You Clicked login!", Toast.LENGTH_SHORT).show();
                            break;
                        case R.id.signup:
                            Toast.makeText(getBaseContext(), "You Clicked Signup", Toast.LENGTH_SHORT).show();
                            break;
                    }
                }
            };


            findViewById(R.id.login).setOnClickListener(handler);
            findViewById(R.id.signup).setOnClickListener(handler);

        }catch(Exception e){
            Log.e("Android Button Tutorial", e.toString());
        }
    }
}


