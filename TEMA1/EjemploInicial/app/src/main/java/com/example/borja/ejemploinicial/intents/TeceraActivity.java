package com.example.borja.ejemploinicial.intents;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.borja.ejemploinicial.R;
import com.example.borja.ejemploinicial.intents.utils.Persona;

public class TeceraActivity extends AppCompatActivity {

    TextView textNombre,textApellido,textTelefono;
    EditText editNota;
    Button boton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tecera);
        textNombre = findViewById(R.id.textoNombre);
        textApellido = findViewById(R.id.textoApellido);
        textTelefono = findViewById(R.id.textoTelefono);
        editNota = findViewById(R.id.editNota);
        boton = findViewById(R.id.botonVolver);
        recuperarDatos();
        boton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.putExtra(SegundaActivity.TAG_KEY_DEV,editNota.getText().toString());
                setResult(SegundaActivity.COD_DEV_UNO,intent);

                finish();
            }
        });
    }

    private void recuperarDatos() {
        //String dato = getIntent().getStringExtra(SegundaActivity.TAG_KEY);
        //texto.setText(dato);
        Persona p = (Persona) getIntent().getSerializableExtra(SegundaActivity.TAG_KEY);
        textTelefono.setText(String.valueOf(p.getTelefono()));
        textNombre.setText(p.getNombre());
        textApellido.setText(p.getApellido());
    }


}
