package com.barstool.edytowaniezdj;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.SeekBar;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    ImageView imageView;
    SeekBar seekBar1;
    SeekBar seekBar2;
    SeekBar seekBar3;
    SeekBar seekBar4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imageView = findViewById(R.id.hecarim);
        seekBar1 = findViewById(R.id.seek1);
        seekBar2 = findViewById(R.id.seek2);
        seekBar3 = findViewById(R.id.seek3);
        seekBar4 = findViewById(R.id.seek4);


    }

    public void kolorklik(View view) {
        imageView.setColorFilter(Color.argb(seekBar4.getProgress(),seekBar1.getProgress(),seekBar2.getProgress(),seekBar3.getProgress()));

    }

    public void clikx(View view) {
        imageView.setRotationX(30);
    }

    public void cliky(View view) {
        imageView.setRotationY(30);
    }
}