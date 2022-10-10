package com.example.profiletest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Main_Singup extends AppCompatActivity {
    Button bt_sigup;
    EditText edt_email,edt_tdn,edt_pass,edt_cfpass;
    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_sigup);
        bt_sigup= (Button) findViewById(R.id.bt_sigup);
        edt_email= (EditText) findViewById(R.id.edt_email);
        edt_tdn= (EditText) findViewById(R.id.edt_tdn);
        edt_pass= (EditText) findViewById(R.id.edt_pass);
        edt_cfpass= (EditText) findViewById(R.id.edt_cfPass);
        bt_sigup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (edt_tdn.getText().toString().equals("") && edt_email.getText().toString().equals("")
                        && edt_pass.getText().toString().equals("") && edt_cfpass.getText().toString().equals("")) {
                    Toast.makeText(Main_Singup.this, "Vui lòng nhập đầy đủ thông tin !!!", Toast.LENGTH_SHORT).show();
                } else {
                    Intent i = new Intent(Main_Singup.this, MainActivity.class);
                    startActivity(i);
                }



            }
        });





    }
}