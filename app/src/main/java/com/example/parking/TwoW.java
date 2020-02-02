package com.example.parking;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class TwoW extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_two_w);
        final Button F1=(Button)findViewById( R.id.F1);
        F1.setOnClickListener(new View.OnClickListener() {
            int xyz=0;
            public void onClick(View v) {
                if (xyz==0) {
                    F1.setBackgroundColor(Color.RED);
                    xyz=1;
                }else {
                    F1.setBackgroundColor(Color.GREEN);
                    xyz = 0;
                }
            }
        });
        final Button F2=(Button)findViewById( R.id.F2);
        F2.setOnClickListener(new View.OnClickListener() {
            int xyz=0;
            public void onClick(View v) {
                if (xyz==0) {
                    F2.setBackgroundColor(Color.RED);
                    xyz=1;
                }else {
                    F2.setBackgroundColor(Color.GREEN);
                    xyz = 0;
                }
            }
        });
        final Button E2=(Button)findViewById( R.id.E2);
        E2.setOnClickListener(new View.OnClickListener() {
            int xyz=0;
            public void onClick(View v) {
                if (xyz==0) {
                    E2.setBackgroundColor(Color.RED);
                    xyz=1;
                }else {
                    E2.setBackgroundColor(Color.GREEN);
                    xyz = 0;
                }
            }
        });
        final Button E1=(Button)findViewById( R.id.E1);
        E1.setOnClickListener(new View.OnClickListener() {
            int xyz=0;
            public void onClick(View v) {

                if (xyz==0) {
                    E1.setBackgroundColor(Color.RED);
                    xyz=1;
                }else {
                    E1.setBackgroundColor(Color.GREEN);
                    xyz = 0;
                }
            }
        });
        final Button G1=(Button)findViewById( R.id.G1);
        G1.setOnClickListener(new View.OnClickListener() {
            int xyz=0;
            public void onClick(View v) {
                if (xyz==0) {
                    G1.setBackgroundColor(Color.RED);
                    xyz=1;
                }else {
                    G1.setBackgroundColor(Color.GREEN);
                    xyz = 0;
                }
            }
        });
        final Button G2=(Button)findViewById( R.id.G2);
        G2.setOnClickListener(new View.OnClickListener() {
            int xyz=0;
            public void onClick(View v) {
                if (xyz==0) {
                    G2.setBackgroundColor(Color.RED);
                    xyz=1;
                }else {
                    G2.setBackgroundColor(Color.GREEN);
                    xyz = 0;
                }
            }
        });
        final Button H2=(Button)findViewById( R.id.H2);
        H2.setOnClickListener(new View.OnClickListener() {
            int xyz=0;
            public void onClick(View v) {
                if (xyz==0) {
                    H2.setBackgroundColor(Color.RED);
                    xyz=1;
                }else {
                    H2.setBackgroundColor(Color.GREEN);
                    xyz = 0;
                }
            }
        });
        final Button H1=(Button)findViewById( R.id.H1);
        H1.setOnClickListener(new View.OnClickListener() {
            int xyz=0;
            public void onClick(View v) {
                if (xyz==0) {
                    H1.setBackgroundColor(Color.RED);
                    xyz=1;
                }else {
                    H1.setBackgroundColor(Color.GREEN);
                    xyz = 0;
                }
            }
        });
    }
}
