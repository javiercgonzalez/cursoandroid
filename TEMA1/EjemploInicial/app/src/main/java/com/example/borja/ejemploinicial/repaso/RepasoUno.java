package com.example.borja.ejemploinicial.repaso;

import android.content.res.TypedArray;
import android.renderscript.ScriptGroup;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.InputType;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.SeekBar;
import android.widget.Switch;
import android.widget.ToggleButton;

import com.example.borja.ejemploinicial.R;

public class RepasoUno extends AppCompatActivity implements View.OnClickListener, CompoundButton.OnCheckedChangeListener, RadioGroup.OnCheckedChangeListener, SeekBar.OnSeekBarChangeListener {

    Button boton;
    CheckBox checkBox;
    RadioButton radioButton, radioButtonGrupoUno, radioButtonGrupoDos;
    RadioGroup radioGroup;
    ImageView imagenRapaso;
    Switch aSwitchRepaso;
    ToggleButton togRepaso;
    SeekBar barra;

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

        imagenRapaso.setImageResource(R.drawable.c1);

        int[] aNumeros = getResources().getIntArray(R.array.ejmplos);
        TypedArray imagenes = getResources().getTextArray(R.array.ejemplo2);
    }

    @Override
    protected void onResume() {
        super.onResume();
        acciones();
    }

    private void acciones() {
        boton.setOnClickListener(this);
        checkBox.setOnClickListener(this);
        checkBox.setOnCheckedChangeListener(this);
        radioButton.setOnCheckedChangeListener(this);
        radioButton.setOnClickListener(this);
        togRepaso.setOnCheckedChangeListener(this);
        aSwitchRepaso.setOnCheckedChangeListener(this);
        radioGroup.setOnCheckedChangeListener(this);
        barra.setOnSeekBarChangeListener(this);
        barra.setMax(1000);

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

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.botonRepaso:
                break;
            case R.id.checkRepaso:
                if (checkBox.isChecked()) {

                }
                break;
            case R.id.radioRepaso:
                if (radioButton.isSelected()) {

                }
                break;

        }
    }

    @Override
    public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
        switch (buttonView.getId()) {
            case R.id.checkRepaso:
                //accion
                break;
            case R.id.radioRepaso:
                //accion
                break;
            case R.id.togRepaso:
                break;
            case R.id.switchRepaso:

                break;
        }
    }

    @Override
    public void onCheckedChanged(RadioGroup group, int checkedId) {
        switch (group.getId()){
            case R.id.grupoRadios:
                switch (checkedId) {
                    case R.id.radioRepasoUno:
                        //accion
                        break;

                    case R.id.radioRepasoDos:
                        break;
                }
                break;
            case R.id.radioGrupo2:
                switch (checkedId){
                    case R.id.radioRepasoUno2:
                        //accion
                        break;

                    case R.id.radioRepasoDos2:
                        break;
                }
                break;
        }
    }

    @Override
    public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
        switch (seekBar.getId()){
            case R.id.seekBar:
                barra.getProgress();
                break;
        }
    }

    @Override
    public void onStartTrackingTouch(SeekBar seekBar) {
        switch (seekBar.getId()){
            case R.id.seekBar:

                seekBar.getProgress();
                break;
        }
    }

    @Override
    public void onStopTrackingTouch(SeekBar seekBar) {
        switch (seekBar.getId()){
            case R.id.seekBar:

                break;
        }
    }
}
