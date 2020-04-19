package com.AELR.x00136419;

public class ServicioProfecional extends Empleado {

    private int Meses_contrato;



    public ServicioProfecional(String Nombre, String Puesto, double Salario, int Meses_contrato){
    super(nombre, puesto, salario);

    this.Meses_contrato = Meses_contrato;


    }

    public int getMeses_contrato() {
        return Meses_contrato;
    }

    public void setMeses_contrato(int meses_contrato) {
        this.Meses_contrato = meses_contrato;
    }
}
