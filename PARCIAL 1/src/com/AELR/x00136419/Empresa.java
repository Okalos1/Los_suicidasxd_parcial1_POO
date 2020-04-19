package com.AELR.x00136419;

import java.util.ArrayList;

public class Empresa {
    private String nombre;
    private ArrayList<String> planilla = new ArrayList<String>();

    public Empresa(String nombre){

    }

    public String getNombre() {
        return nombre;
    }

    public ArrayList<String> getPlanilla() {
        return planilla;
    }
}
