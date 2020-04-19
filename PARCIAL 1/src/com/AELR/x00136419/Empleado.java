package com.AELR.x00136419;

import java.util.ArrayList;

public abstract class Empleado {
    protected String nombre, puesto;
    protected ArrayList<Documento> Documentos = new ArrayList<>();
    protected double salario;

    public Empleado (String nombre, String puesto, double salario){
        this.nombre = nombre;
        this.puesto = puesto;
        this.salario = salario;

    }

    public ArrayList<Documento> getDocumentos() {
        return Documentos;
    }

    public String getPuesto() {
        return puesto;
    }

    public String getNombre() {
        return nombre;
    }



    public void setSalario(double salario) {
        this.salario = salario;
    }

    public void addDocumento (Documento){


    }

    public void removeDocumento(String Doc){




    }

}


