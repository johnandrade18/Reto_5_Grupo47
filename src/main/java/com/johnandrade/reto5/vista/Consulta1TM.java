/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.johnandrade.reto5.vista;

import com.johnandrade.reto5.modelo.vo.Requerimiento_1;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author johna
 */
public class Consulta1TM extends AbstractTableModel{
    
    private   ArrayList<Requerimiento_1> registrosBS;
    
    
    public Consulta1TM(){
        this(new ArrayList<>());
    }

    public Consulta1TM(ArrayList<Requerimiento_1> registrosBS){
        this.registrosBS = registrosBS;
    }
    

    @Override
    public String getColumnName(int column) {
        switch(column){
            case 0:
                return "Lider";
            case 1:
                return "Cargo";
            case 2:
                return "Proyectos";
        }
        return super.getColumnName(column);
    }

    @Override
    public int getRowCount() {
        return registrosBS.size();
    }

    @Override
    public int getColumnCount() {
        return 3;
    }

    @Override
    public Object getValueAt(int row, int column) {
        Requerimiento_1 requerimiento1 = registrosBS.get(row);
        switch(column){
            case 0:
                return requerimiento1.getLider();
            case 1:
                return requerimiento1.getCargo();
            case 2:
                return requerimiento1.getProyectos();
        }
        return null;
    }
    
}
