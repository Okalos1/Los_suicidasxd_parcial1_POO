package com.AELR.x00136419;

import java.util.ArrayList;

public class Empresa {
    private String nombre;
    private ArrayList<Empleado> Planilla = new ArrayList();

    public Empresa(String nombre){
     this.nombre = nombre;

    }

    public String getNombre() {
        return nombre;
    }

    public ArrayList<Empleado> getPlanilla(){
        String mensaje = "";

        for (Empleado empleado : Planilla) {
            mensaje += empleado.toString() + "\n";

        }
        return Planilla;

    }

    public void addEmpleado (Empleado Empl){
            Planilla.add(Empl);

        }

    public void quitEmpleado (String Empl){
        Empleado aux = null;

        for (Empleado empleado : Planilla) {
            if (empleado.getNombre().equals(Empl))
                aux = empleado;

        }
        if (aux != null) {
            Planilla.remove(aux);
        }

    }}