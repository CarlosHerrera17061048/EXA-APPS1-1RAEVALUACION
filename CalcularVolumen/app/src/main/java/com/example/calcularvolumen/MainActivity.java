package com.example.calcularvolumen;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getSupportActionBar().hide();

        SeekBar SKAngulo;
        Button btnCalc;



        SKAngulo = (SeekBar) findViewById(R.id.SKAngulo);
        btnCalc = findViewById(R.id.btnCalc);


        final int[] angulo = {SKAngulo.getProgress()};




SKAngulo.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
    @Override
    public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
        TextView tvAngulo = (TextView)findViewById(R.id.tvAngulo);
        tvAngulo.setText(String.valueOf(progress));
         angulo[0] = progress;


    }

    @Override
    public void onStartTrackingTouch(SeekBar seekBar) {

    }

    @Override
    public void onStopTrackingTouch(SeekBar seekBar) {

    }
});

        btnCalc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                EditText edtRadio = findViewById(R.id.edtRadio);
                int radio = Integer.parseInt(edtRadio.getText().toString());
                int p = angulo[0];
                double volumen;
                int x = radio*3*p;
                volumen = (2/3)*x;
                Toast.makeText(getApplicationContext(),"El Volumen es " +x, Toast.LENGTH_LONG).show();

            }
        });
    }

}