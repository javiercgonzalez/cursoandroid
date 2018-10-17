package com.example.borja.ejemploinicial.layouts;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.borja.ejemploinicial.R;

public class MainActivity extends AppCompatActivity {

    Button b1;
    EditText editText;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        instancias();
        acciones();
        Log.v("estados", "Pasado a estado onCreate()");
    }

    private void acciones() {
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String numero = editText.getText().toString();
                //Log.v("milog", numero);
                if (numero.length()==0)
                {
                    Toast.makeText(getApplicationContext(),
                            getResources().getString(R.string.mensaje)
                            ,Toast.LENGTH_SHORT).show();
                }
                else Toast.makeText(getApplicationContext(),
                        numero,Toast.LENGTH_SHORT).show();
            }
        });
    }

    private void instancias() {
        //b1 = findViewById(R.id.boton);
        //editText = findViewById(R.id.edit);
        //textView = findViewById(R.id.texto);
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.v("estados", "Pasado a estado onStart()");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.v("estados", "Pasado a estado onRestart()");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.v("estados", "Pasado a estado onStop()");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.v("estados", "Pasado a estado onDestroy()");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.v("estados", "Pasado a estado onPause()");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.v("estados", "Pasado a estado onResume()");
    }
}
