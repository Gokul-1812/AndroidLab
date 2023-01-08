package com.example.quizz;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class third extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);
        String days[] = {"Monday", "Tuesday", "Wednesday"};
        myadapter arr = new myadapter(this, R.layout.customlist, new int[]{1,2,3}, days);
        ListView L = findViewById(R.id.mobile_list);
        L.setAdapter(arr);
//        new Toast(this).setView(LayoutInflater.from(this).inflate(R..gw)).show();

    }
    public class myadapter extends ArrayAdapter{
        int[] image;
        String[] str;

        public myadapter(@NonNull Context context, int resource, int image[], String[] str) {
            super(context, resource);
            this.image= image;
            this.str = str;
        }

        @Override
        public int getCount() {
            return str.length;
        }

        @NonNull
        @Override
        public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
            if(convertView==null){
                convertView=LayoutInflater.from(getContext()).inflate(R.layout.customlist, null);
            }
            TextView tv = convertView.findViewById(R.id.textView);
            ImageView im = convertView.findViewById(R.id.imageView);
            tv.setText(str[position]);
            if(position%2==0){
                im.setImageResource(R.drawable.ic_launcher_background);
            }
            else{
                im.setImageResource(R.drawable.ic_launcher_foreground);
            }
            return convertView;
        }
    }
}