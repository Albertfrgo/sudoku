package com.example.sudoku;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TableLayout;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private TableLayout tablaLayout;
    private Spinner spinnerMostra;

    private ArrayList<String> numsSpinner;
    private String[][] sudokuResolt;
    private String[][] numerosEmplenats;

    private tablaSudoku sudoku;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tablaLayout=(TableLayout) findViewById(R.id.tableLayout);

        sudokuResolt= new String[][]{
                {"5", "3", "4", "6", "7", "8", "9", "1", "2"},
                {"6", "7", "2", "1", "9", "5", "3", "4", "8"},
                {"1", "9", "8", "3", "4", "2", "5", "6", "7"},
                {"8", "5", "9", "7", "6", "1", "4", "2", "3"},
                {"4", "2", "6", "8", "5", "3", "7", "9", "1"},
                {"7", "1", "3", "9", "2", "4", "8", "5", "6"},
                {"9", "6", "1", "5", "3", "7", "2", "8", "4"},
                {"2", "8", "7", "4", "1", "9", "6", "3", "5"},
                {"3", "4", "5", "2", "8", "6", "1", "7", "9"}
        };

        numsSpinner=new ArrayList<>();
        for(int i=1;i<10;i++){
            numsSpinner.add(Integer.toString(i));
        }

        spinnerMostra=new Spinner(this);
        //spinnerMostra=findViewById(R.id.spinnerMostra);
        spinnerMostra.setBackground(null);
        spinnerMostra.setPadding(5,5,5,5);
        ArrayAdapter<String> adaptador = new ArrayAdapter<String>(this,
                android.R.layout.simple_spinner_item, numsSpinner);
        adaptador.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnerMostra.setAdapter(adaptador);

        sudoku=new tablaSudoku(tablaLayout, getApplicationContext());
        sudoku.crearTabla(spinnerMostra);
    }

}


