package com.johnandrade.reto5.controlador;

import com.johnandrade.reto5.modelo.vo.Requerimiento_1;
import com.johnandrade.reto5.modelo.dao.Requerimiento_1Dao;

import com.johnandrade.reto5.modelo.vo.Requerimiento_2;
import com.johnandrade.reto5.modelo.dao.Requerimiento_2Dao;

import com.johnandrade.reto5.modelo.vo.Requerimiento_3;
import com.johnandrade.reto5.modelo.dao.Requerimiento_3Dao;


import java.sql.SQLException;
import java.util.ArrayList;

public class ControladorRequerimientos {
    private final Requerimiento_1Dao requerimiento_1Dao;
    private final Requerimiento_2Dao requerimiento_2Dao;
    private final Requerimiento_3Dao requerimiento_3Dao;
    
    public ControladorRequerimientos() {
        this.requerimiento_1Dao = new Requerimiento_1Dao();
        this.requerimiento_2Dao = new Requerimiento_2Dao();
        this.requerimiento_3Dao = new Requerimiento_3Dao();
    }

    public ArrayList<Requerimiento_1> consultarRequerimiento1() throws SQLException {
        return requerimiento_1Dao.requerimiento1();
    }

    public ArrayList<Requerimiento_2> consultarRequerimiento2() throws SQLException {
        return requerimiento_2Dao.requerimiento2();
    }

    public ArrayList<Requerimiento_3> consultarRequerimiento3() throws SQLException {
        return requerimiento_3Dao.requerimiento3();
    }
}
