package com.example.borja.ejemploinicial.elementos.adaptadores;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.borja.ejemploinicial.R;
import com.example.borja.ejemploinicial.utils.Persona;

import java.util.ArrayList;
import java.util.List;

public class AdaptadorSpinnerPerso extends BaseAdapter {

    List listaDatos;
    Context context;

    public AdaptadorSpinnerPerso(List listaDatos, Context context) {
        this.listaDatos = listaDatos;
        this.context = context;
    }

    @Override
    public int getCount() {
        return listaDatos.size();
    }

    @Override
    public Object getItem(int position) {
        return listaDatos.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    public void anadirDatos(Persona persona){
        listaDatos.add(persona);
        notifyDataSetChanged();
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        HolderAdicional holderAdicional = null;

        if (convertView == null){
            convertView = LayoutInflater.from(context).inflate(R.layout.item_spinner_layout, parent, false);
            holderAdicional = new HolderAdicional(convertView);
            convertView.setTag(holderAdicional);

        }
        else {
            holderAdicional = (HolderAdicional) convertView.getTag();
        }

        Persona p = (Persona) listaDatos.get(position);
        if (p.getSexo() == 0) {
            holderAdicional.getImagen().setImageResource(R.drawable.c1);
        } else if (p.getSexo() == 1) {
            holderAdicional.getImagen().setImageResource(R.drawable.c2);
        }
        holderAdicional.getNombre().setText(p.getNombre());

        holderAdicional.getImagen().setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(context,"Has pulsado imagen",Toast.LENGTH_SHORT).show();
            }
        });
        holderAdicional.getNombre().setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(context,"Has pulsado nombre",Toast.LENGTH_SHORT).show();
            }
        });

        return convertView;
    }

    class HolderAdicional{

        TextView nombre;
        ImageView imagen;

        public HolderAdicional(View view) {
            nombre = view.findViewById(R.id.nombreSpinner);
            imagen = view.findViewById(R.id.imagenSpinner);
        }

        public TextView getNombre() {
            return nombre;
        }
        public ImageView getImagen() {
            return imagen;
        }
    }
}
