package com.example.borja.ejemploinicial.elementos;

import android.content.res.TypedArray;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

import com.example.borja.ejemploinicial.R;
import com.example.borja.ejemploinicial.elementos.adaptadores.AdaptadorSpinnerPerso;
import com.example.borja.ejemploinicial.utils.Persona;

import java.util.ArrayList;

public class ElementosAvanzadosActivity extends AppCompatActivity {

    Spinner spinner, spinnerAnidado;
    EditText nombre, apellido, telefono;
    Button botonAgregar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_elementos_avanzados);

        nombre = findViewById(R.id.editNombre);
        apellido = findViewById(R.id.editApellido);
        telefono = findViewById(R.id.editTelefono);
        spinner = findViewById(R.id.elementoSpinner);
        botonAgregar = findViewById(R.id.botonAgregarSp);
        spinnerAnidado = findViewById(R.id.elementoSpinnerAnidados);
        final ArrayList<Persona> personas = new ArrayList();
        personas.add(new Persona("Nombre 1", "Apellido 1", 123,0));
        personas.add(new Persona("Nombre 2", "Apellido 2", 54334,1));
        personas.add(new Persona("Nombre 3", "Apellido 3", 1637,1));
        //ArrayAdapter adaptador = new ArrayAdapter(getApplicationContext(), android.R.layout.simple_spinner_item, personas);
        //spinner.setAdapter(adaptador);
        //adaptador.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        final AdaptadorSpinnerPerso adaptadorSpinnerPerso = new AdaptadorSpinnerPerso(personas,getApplicationContext());
        spinner.setAdapter(adaptadorSpinnerPerso);

        /*ArrayAdapter adaptador = ArrayAdapter.createFromResource(this, R.array.ligas, android.R.layout.simple_spinner_item);
        adaptador.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adaptador);*/


        /*
        // datos a mostrar
        ArrayList listaDatos = new ArrayList();
        for (int i = 1; i < 11; i++) {
            listaDatos.add("Opción " + String.valueOf(i));
        }

        // Crear un modelo de datos
        // this,layout,datos
        ArrayAdapter adaptador = new ArrayAdapter(this, android.R.layout.simple_spinner_item, listaDatos);

        // asociar el spinner con el modelo de datos
        spinner.setAdapter(adaptador);
        //Toast.makeText(getApplicationContext(),spinner.getSelectedItem().toString(),
        //        Toast.LENGTH_SHORT).show();

        /*spinner.getSelectedItem();
        spinner.getAdapter().getItem(2);
        adaptador.getItem(2);
        adaptador.add(null);
        adaptador.notifyDataSetChanged();*/


        /*spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                Persona p = (Persona) parent.getAdapter().getItem(position);
                Toast.makeText(getApplicationContext(),String.valueOf(p.getTelefono()),Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });*/


        botonAgregar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Persona p = new Persona("qweqwe","xcvxcvxcv",123,1);
                //personas.add(p);
                adaptadorSpinnerPerso.anadirDatos(p);

            }
        });


    }
}
