package com.example.borja.ejemploinicial.layouts;

import android.content.pm.ActivityInfo;
import android.content.res.Configuration;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.borja.ejemploinicial.R;

public class TableActivity extends AppCompatActivity {

    TextView textViewPort;
    ImageView imagenLand;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_table);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        textViewPort = findViewById(R.id.textoPort);

        if (getResources().getConfiguration().orientation == Configuration.ORIENTATION_LANDSCAPE){
            imagenLand = findViewById(R.id.imagenLand);
            imagenLand.getTag();
        }

        textViewPort.setText("Modificacion");



    }

}
