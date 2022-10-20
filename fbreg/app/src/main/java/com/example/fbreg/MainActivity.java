package com.example.fbreg;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends Activity implements View.OnClickListener {
    EditText user, pwd;
    Button butt;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        butt = findViewById(R.id.log);
        butt.setOnClickListener(this);

    }



    @Override
    public void onClick(View view) {


        user = (EditText) findViewById(R.id.ema);
        pwd = (EditText) findViewById(R.id.passa);

        String a = user.getText().toString();
        String b = pwd.getText().toString();

        if(a.equals("gokul@gmail.com")&&b.equals("123")) {
            Toast toast = Toast.makeText(getApplicationContext(), "Login Sucessfull", Toast.LENGTH_SHORT);
            toast.show();
        }
        else{
            Toast toast = Toast.makeText(getApplicationContext(), "Login Unsucessfull", Toast.LENGTH_SHORT);
            toast.show();
        }
        setContentView(R.layout.welcome);


    }
}
