package com.example.sudoku;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayList<String> paraules=new ArrayList<>();
        for(int i=0;i<10;i++){
            paraules.add(Integer.toString(i));
        }

        Spinner spinnerMostra=new Spinner(this);
        spinnerMostra=findViewById(R.id.spinnerMostra);
        ArrayAdapter<String> adaptador = new ArrayAdapter<String>(this,
                android.R.layout.simple_spinner_item, paraules);
        adaptador.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnerMostra.setAdapter(adaptador);
    }

}


