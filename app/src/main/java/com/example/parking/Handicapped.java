package com.example.parking;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Handicapped extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_handicapped);
        final Button J1=(Button)findViewById( R.id.J1);
        J1.setOnClickListener(new View.OnClickListener() {
            int xyz=0;
            public void onClick(View v) {
                if (xyz==0) {
                    J1.setBackgroundColor(Color.RED);
                    xyz=1;
                }else {
                    J1.setBackgroundColor(Color.GREEN);
                    xyz = 0;
                }
            }
        });
        final Button J2=(Button)findViewById( R.id.J2);
        J2.setOnClickListener(new View.OnClickListener() {
            int xyz=0;
            public void onClick(View v) {
                if (xyz==0) {
                    J2.setBackgroundColor(Color.RED);
                    xyz=1;
                }else {
                    J2.setBackgroundColor(Color.GREEN);
                    xyz = 0;
                }
            }
        });
        final Button I2=(Button)findViewById( R.id.I2);
        I2.setOnClickListener(new View.OnClickListener() {
            int xyz=0;
            public void onClick(View v) {
                if (xyz==0) {
                    I2.setBackgroundColor(Color.RED);
                    xyz=1;
                }else {
                    I2.setBackgroundColor(Color.GREEN);
                    xyz = 0;
                }
            }
        });
        final Button I1=(Button)findViewById( R.id.I1);
        I1.setOnClickListener(new View.OnClickListener() {
            int xyz=0;
            public void onClick(View v) {

                if (xyz==0) {
                    I1.setBackgroundColor(Color.RED);
                    xyz=1;
                }else {
                    I1.setBackgroundColor(Color.GREEN);
                    xyz = 0;
                }
            }
        });
    }
}
