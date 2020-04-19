package com.AELR.x00136419;

public class PlazaFija extends Empleado {

    private int Extension;

    public PlazaFija(String nombre, String puesto, double salario, int Extension){
        super(nombre, puesto, salario);

        this.Extension = Extension;
    }


    public int getExtension() {
        return Extension;
    }

    public void setExtension(int extension) {
        Extension = extension;
    }
}
