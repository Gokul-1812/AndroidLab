package com.example.quizz;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button = findViewById(R.id.sign);
        final TextView text1 = findViewById(R.id.fo);
        final EditText ed = findViewById(R.id.to);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String value = ed.getText().toString().trim();
                Intent intent = new Intent(MainActivity.this, Second.class);
                intent.putExtra("v",value);
                startActivity(intent);
                Toast toast = Toast.makeText(MainActivity.this, "Hello", Toast.LENGTH_SHORT);
                toast.show();
            }
        });
    }

}

