/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.johnandrade.reto5.vista;

import com.johnandrade.reto5.modelo.vo.Requerimiento_2;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author johna
 */
public class Consulta2TM extends AbstractTableModel{
    
    private   ArrayList<Requerimiento_2> registrosBS2;
    
    
    public Consulta2TM(){
        this(new ArrayList<>());
    }

    public Consulta2TM(ArrayList<Requerimiento_2> registrosBS2){
        this.registrosBS2 = registrosBS2;
    }

    @Override
    public String getColumnName(int column) {
        switch(column){
            case 0:
                return "Id material";
            case 1:
                return "Nombre Material";
            case 2:
                return "Cantidad";
            case 3:
                return "Precio unidad";
            case 4:
                return "Precio Total";    
        }
        return super.getColumnName(column);
    }

    @Override
    public int getRowCount() {
        return registrosBS2.size();
    }

    @Override
    public int getColumnCount() {
        return 5;
    }

    @Override
    public Object getValueAt(int row, int column) {
        Requerimiento_2 requerimiento2 = registrosBS2.get(row);
        switch(column){
            case 0:
                return requerimiento2.getIdMaterial();
            case 1:
                return requerimiento2.getNombreMaterial();
            case 2:
                return requerimiento2.getCantidad();
            case 3:
                return requerimiento2.getPrecioUnidad();
            case 4:
                return requerimiento2.getPrecioTotal();
        }
        return null;
    }
    
}
