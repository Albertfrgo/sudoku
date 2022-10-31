package com.example.sudoku;

import android.content.Context;
import android.widget.Spinner;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;

public class tablaSudoku {
    private TableLayout tablaLayout;
    private Context context;
    private Spinner spinnerModel;
    private String[][] numerosEmplenats;

    TableRow filaAfegir;

    public tablaSudoku(TableLayout tablaLayout, Context context){
        this.tablaLayout=tablaLayout;
        this.context=context;
    }

    public void setSpinner(Spinner spinner, int numero){
        spinner.setSelection(numero -1);
    }

    public void actualitzarTabla(String[][] numerosEmplenats){
    }

    public void crearTabla(Spinner spinnerModel){
        for(int i=0;i<9;i++){
            filaAfegir=new TableRow(context);
            for (int y=0;y<9;y++){
                TextView prova_X=new TextView(context);
                prova_X.setText("X");
                filaAfegir.addView(prova_X, newTableRowParams());
            }
            tablaLayout.addView(filaAfegir);
        }
    }

    private TableRow.LayoutParams newTableRowParams() {
        TableRow.LayoutParams parametros = new TableRow.LayoutParams();
        parametros.setMargins(10, 10, 10, 10);
        parametros.weight = 1;
        return parametros;
    }

}
