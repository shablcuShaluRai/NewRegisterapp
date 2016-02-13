package com.shablcu.shalu.newregisterpro;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Register extends AppCompatActivity {
    public static final String PREFS_NAME = "MyApp_Settings";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.register);
        Button button = (Button)findViewById(R.id.register);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText rUserNameButton = (EditText) findViewById(R.id.rusername);
                EditText rPasswordbutton = (EditText) findViewById(R.id.rpassword);
                String rUsername = rUserNameButton.getText().toString();
                String rPassword = rPasswordbutton.getText().toString();


                SharedPreferences settings = getSharedPreferences(PREFS_NAME, MODE_PRIVATE);

                // Writing data to SharedPreferences
                SharedPreferences.Editor editor = settings.edit();
                editor.putString("username", rUsername);
                editor.putString("password", rPassword);
                editor.commit();

                // writing data to shared prefrences done , now show them a toast.
                Toast.makeText(getBaseContext(), "Data Saved", Toast.LENGTH_SHORT).show();

                

            }
        });
    }





}
