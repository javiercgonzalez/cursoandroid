package com.system.develop.exameniniciopmdm;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    TextView texto;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        texto = findViewById(R.id.textResultado);

        if (getIntent()!=null){
            int resultado = getIntent().getIntExtra(MainActivity.TAG_RESULTADO,0);
            texto.setText(resultado);
        }
    }
}
