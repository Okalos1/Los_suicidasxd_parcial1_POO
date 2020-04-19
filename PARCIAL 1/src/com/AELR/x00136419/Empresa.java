package com.AELR.x00136419;

import java.util.ArrayList;

public class Empresa {
    private String nombre;
    private ArrayList<String> Planilla = new ArrayList<String>();

    public Empresa(String nombre){
     this.nombre = nombre;

    }

    public String getNombre() {
        return nombre;
    }

    public ArrayList<String> getPlanilla() {
        return Planilla;
    }

    public void addEmpleado(Empleado){

    }

    public void quitEmpleado(String Empl){

    }
}
