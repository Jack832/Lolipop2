package com.example.test4.lollipop;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

/**
 * Created by bridgelabz4 on 21/1/16.
 */
public class Login extends Activity {
    Button B1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.loginn);
        B1=(Button)findViewById(R.id.btn1);
        B1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i5=new Intent(Login.this,MainActivity.class);
                startActivity(i5);

            }
        });
    }
}
