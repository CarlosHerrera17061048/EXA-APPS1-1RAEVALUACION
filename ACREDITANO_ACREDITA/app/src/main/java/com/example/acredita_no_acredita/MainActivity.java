package com.example.acredita_no_acredita;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.SeekBar;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

        SeekBar CalAp;
        TextView tvCalAp;

        SeekBar CalRp;
        TextView tvCalRp;

        TextView resultado;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getSupportActionBar().hide();

//primer seekBar
        CalAp = (SeekBar) findViewById (R.id.CalAp);
        tvCalAp = (TextView) findViewById (R.id.tvCalAp);
        final int[] califa1 = {CalAp.getProgress()};

       CalAp.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
           @Override
           public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {

               TextView tvCalAp = (TextView)findViewById(R.id.tvCalAp);
               tvCalAp.setText(String.valueOf(progress));
               califa1[0] = progress;
           }

           @Override
           public void onStartTrackingTouch(SeekBar seekBar) {

           }

           @Override
           public void onStopTrackingTouch(SeekBar seekBar) {

           }
       });

       //Segundo SeekBar
        CalRp = (SeekBar) findViewById (R.id.CalRp);
        tvCalRp = (TextView) findViewById (R.id.tvCalRp);
        final int[] califa2 = {CalAp.getProgress()};

        CalRp.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {

            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {

                TextView tvAngulo = (TextView)findViewById(R.id.tvCalRp);
                tvCalRp.setText(String.valueOf(progress));
                califa2[0] = progress;


            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });



        // resultado
















    }}