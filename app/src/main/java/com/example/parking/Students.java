package com.example.parking;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Students extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_students);

    final Button b1=(Button)findViewById( R.id.B1);
        b1.setOnClickListener(new View.OnClickListener() {
        int xyz=0;
        public void onClick(View v) {
            if (xyz==0) {
                b1.setBackgroundColor(Color.RED);
                xyz=1;
            }else {
                b1.setBackgroundColor(Color.GREEN);
                xyz = 0;
            }
        }
    });
    final Button b2=(Button)findViewById( R.id.B2);
        b2.setOnClickListener(new View.OnClickListener() {
        int xyz=0;
        public void onClick(View v) {
            if (xyz==0) {
                b2.setBackgroundColor(Color.RED);
                xyz=1;
            }else {
                b2.setBackgroundColor(Color.GREEN);
                xyz = 0;
            }
        }
    });
    final Button a2=(Button)findViewById( R.id.A2);
        a2.setOnClickListener(new View.OnClickListener() {
        int xyz=0;
        public void onClick(View v) {
            if (xyz==0) {
                a2.setBackgroundColor(Color.GREEN);
                xyz=1;
            }else {
                a2.setBackgroundColor(Color.RED);
                xyz = 0;
            }
        }
    });
    final Button a1=(Button)findViewById( R.id.A1);
        a1.setOnClickListener(new View.OnClickListener() {
        int xyz=0;
        public void onClick(View v) {

            if (xyz==0) {
                a1.setBackgroundColor(Color.RED);
                xyz=1;
            }else {
                a1.setBackgroundColor(Color.GREEN);
                xyz = 0;
            }
        }
    });
    final Button c1=(Button)findViewById( R.id.C1);
        c1.setOnClickListener(new View.OnClickListener() {
        int xyz=0;
        public void onClick(View v) {
            if (xyz==0) {
                c1.setBackgroundColor(Color.RED);
                xyz=1;
            }else {
                c1.setBackgroundColor(Color.GREEN);
                xyz = 0;
            }
        }
    });
    final Button c2=(Button)findViewById( R.id.C2);
        c2.setOnClickListener(new View.OnClickListener() {
        int xyz=0;
        public void onClick(View v) {
            if (xyz==0) {
                c2.setBackgroundColor(Color.RED);
                xyz=1;
            }else {
                c2.setBackgroundColor(Color.GREEN);
                xyz = 0;
            }
        }
    });
    final Button d2=(Button)findViewById( R.id.D2);
        d2.setOnClickListener(new View.OnClickListener() {
        int xyz=0;
        public void onClick(View v) {
            if (xyz==0) {
                d2.setBackgroundColor(Color.RED);
                xyz=1;
            }else {
                d2.setBackgroundColor(Color.GREEN);
                xyz = 0;
            }
        }
    });
    final Button d1=(Button)findViewById( R.id.D1);
        d1.setOnClickListener(new View.OnClickListener() {
        int xyz=0;
        public void onClick(View v) {
            if (xyz==0) {
                d1.setBackgroundColor(Color.GREEN);
                xyz=1;
            }else {
                d1.setBackgroundColor(Color.RED);
                xyz = 0;
            }
        }
    });
}}
