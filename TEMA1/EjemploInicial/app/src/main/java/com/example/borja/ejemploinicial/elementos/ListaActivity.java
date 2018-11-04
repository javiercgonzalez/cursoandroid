package com.example.borja.ejemploinicial.elementos;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

import com.example.borja.ejemploinicial.R;

import java.util.ArrayList;

public class ListaActivity extends AppCompatActivity implements AdapterView.OnItemClickListener {

    ListView lista;
    Button boton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista);
        instancias();
        rellenarLista();
        acciones();
    }

    private void acciones() {
        lista.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

            }
        });
    }

    private void rellenarLista() {
        ArrayList listaOpciones= new ArrayList();
        for(int i=0;i<101;i++){
            listaOpciones.add("Opción "+String.valueOf(i));
        }
        ArrayAdapter adapter = new ArrayAdapter(getApplicationContext(),android.R.layout.simple_list_item_1,listaOpciones);
        lista.setAdapter(adapter);
    }

    private void instancias() {
        lista = findViewById(R.id.listaListView);
        boton = findViewById(R.id.botonLista);
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        Toast.makeText(getApplicationContext(),"Posición: "+String .valueOf(position),Toast.LENGTH_SHORT).show();
        parent.getAdapter().getItem(position);
    }
}
