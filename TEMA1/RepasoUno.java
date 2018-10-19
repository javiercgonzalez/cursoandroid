package com.example.borja.ejemploinicial.repaso;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Switch;
import android.widget.ToggleButton;

import com.example.borja.ejemploinicial.R;

public class RepasoUno extends AppCompatActivity {

    Button boton;
    CheckBox checkBox;
    RadioButton radioButton, radioButtonGrupoUno, radioButtonGrupoDos;
    RadioGroup radioGroup;
    ImageView imagenRapaso;
    Switch aSwitchRepaso;
    ToggleButton togRepaso;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_repaso_uno);
    }

    @Override
    protected void onStart() {
        super.onStart();
        instancias();
    }

    private void instancias() {
        boton = findViewById(R.id.botonRepaso);
        checkBox = findViewById(R.id.checkRepaso);
        radioButton = findViewById(R.id.radioRepaso);
        radioButtonGrupoUno = findViewById(R.id.radioRepasoUno);
        radioButtonGrupoDos = findViewById(R.id.radioRepasoDos);
        radioGroup = findViewById(R.id.radioRepasoGrupo);
        imagenRapaso = findViewById(R.id.imagenRepaso);
        aSwitchRepaso = findViewById(R.id.switchRepaso);
        togRepaso = findViewById(R.id.togRepaso);
    }

    @Override
    protected void onResume() {
        super.onResume();
    }

    @Override
    protected void onPause() {
        super.onPause();
    }

    @Override
    protected void onStop() {
        super.onStop();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
    }
}
