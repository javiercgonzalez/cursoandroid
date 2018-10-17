package com.example.borja.ejemploinicial.elementos;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.SeekBar;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.ToggleButton;

import com.example.borja.ejemploinicial.R;

public class ElementosActivity extends AppCompatActivity implements CompoundButton.OnCheckedChangeListener,
        View.OnClickListener, RadioGroup.OnCheckedChangeListener {

    CheckBox checkBox1, checkBox2, checkBox3;
    Button boton;
    RadioButton radioInd1, radioGrupo1, radioGrupo2;
    RadioGroup grupoRadios;
    ToggleButton togButton;
    Switch aSwitch;
    SeekBar seekBar;
    TextView textoProgreso;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_elementos);
        instancias();
        acciones();
        seekBar.setProgress(100);
    }

    private void acciones() {
        /*checkBox.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),
                        "Check pulsado",Toast.LENGTH_SHORT).show();
            }
        });*/
        /*checkBox1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                Toast.makeText(getApplicationContext(),
                        String.valueOf(isChecked),Toast.LENGTH_SHORT).show();
            }
        });*/

        checkBox1.setOnCheckedChangeListener(this);
        checkBox2.setOnCheckedChangeListener(this);
        checkBox3.setOnCheckedChangeListener(this);
        boton.setOnClickListener(this);
        grupoRadios.setOnCheckedChangeListener(this);
        togButton.setOnCheckedChangeListener(this);
        aSwitch.setOnCheckedChangeListener(this);
        seekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                /*Toast.makeText(getApplicationContext(),
                        "El estado ha pasado a: " + String.valueOf(progress), Toast.LENGTH_SHORT).show();*/

                textoProgreso.setText(String.valueOf(progress));
                seekBar.getProgress();
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });


    }

    private void instancias() {
        checkBox1 = findViewById(R.id.checkbox1);
        checkBox2 = findViewById(R.id.checkbox2);
        checkBox3 = findViewById(R.id.checkbox3);
        boton = findViewById(R.id.botonComprobar);
        radioInd1 = findViewById(R.id.radioIndividual1);
        radioGrupo1 = findViewById(R.id.radioGrupo1);
        radioGrupo2 = findViewById(R.id.radioGrupo2);
        grupoRadios = findViewById(R.id.grupoRadios);
        togButton = findViewById(R.id.togButton);
        aSwitch = findViewById(R.id.switchButton);
        seekBar = findViewById(R.id.seekBar);
        textoProgreso = findViewById(R.id.textSeek);
    }

    @Override
    public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
        switch (buttonView.getId()) {
            case R.id.checkbox1:
                Toast.makeText(getApplicationContext(),
                        "El estado ha pasado a: " + String.valueOf(isChecked), Toast.LENGTH_SHORT).show();
                break;
            case R.id.checkbox2:
                break;
            case R.id.checkbox3:
                break;
            case R.id.togButton:
                Toast.makeText(getApplicationContext(),
                        "El estado ha pasado a: " + String.valueOf(isChecked), Toast.LENGTH_SHORT).show();
                break;
            case R.id.switchButton:
                Toast.makeText(getApplicationContext(),
                        "El estado ha pasado a: " + String.valueOf(isChecked), Toast.LENGTH_SHORT).show();

                break;
        }
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.botonComprobar:
                /*if (checkBox1.isChecked()) {
                    checkBox1.setChecked(false);
                } else if (!checkBox1.isChecked()) {
                    checkBox1.setChecked(true);
                }*/

                /*if (radioInd1.isChecked()) {
                    radioInd1.setChecked(false);
                } else if (!radioInd1.isChecked()) {
                    radioInd1.setChecked(true);
                    break;
                }*/
                if (togButton.isChecked()) {
                    togButton.setChecked(false);
                } else if (!togButton.isChecked()) {
                    togButton.setChecked(true);
                    break;
                }
        }
    }

    @Override
    public void onCheckedChanged(RadioGroup group, int checkedId) {
        switch (group.getId()) {
            case R.id.grupoRadios:
                switch (checkedId) {
                    case R.id.radioGrupo1:
                        Toast.makeText(getApplicationContext(),
                                "Seleccionado uno", Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.radioGrupo2:
                        Toast.makeText(getApplicationContext(),
                                "Seleccionado dos", Toast.LENGTH_SHORT).show();
                        break;
                }
                break;
        }
    }
}
