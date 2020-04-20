package com.AELR.x00136419;

import javax.swing.*;

public  class CalculadoraImpuestos {


    private static double RentaTotal, SeguroTotal, AfpTotal;



    private CalculadoraImpuestos() {

    }


    public static double calcularPago(Empleado payment) {

        double SeguroSocial, restaAfpIsss, rent , pago ,afp , salary;

        if (payment instanceof PlazaFija){
            salary= payment.getSalario(); afp= 0.0625*salary; SeguroSocial=0.03*salary; restaAfpIsss= salary-SeguroSocial-afp;

            if(restaAfpIsss >=0.01 && restaAfpIsss <= 472.00){
                pago=restaAfpIsss;

                JOptionPane.showMessageDialog(null,"Tu salario bruto es: $"+salary+
                        " aplicando descuentos correspondientes:\n" + " AFP: $"+ afp +"\n ISSS(Seguro Social): $"+ SeguroSocial +"\n Renta: $0.00 "+
                        "\n Entonces, tu salario neto es de: $"+pago+". ");

                AfpTotal +=afp; SeguroTotal +=SeguroSocial;
                return pago;
            }
            else if(restaAfpIsss >=472.01 && restaAfpIsss <= 895.24){
                rent=0.1*(salary-472)+17.67; pago= restaAfpIsss-rent;

                JOptionPane.showMessageDialog(null,"Tu salario bruto es: $"+salary+
                        " aplicando descuentos correspondientes:\n" + " AFP: $"+ afp +"\n ISSS(Seguro Social): $"+ SeguroSocial +"\n Renta: $"+ rent +
                        "\n Entonces, tu salario neto es de: $"+pago+". ");

                AfpTotal +=afp; SeguroTotal +=SeguroSocial; RentaTotal +=rent;
                return pago;
            }
            else if(restaAfpIsss >=895.25 && restaAfpIsss <= 2038.10){
                rent=0.2*(salary-895.24)+60; pago= restaAfpIsss-rent;

                JOptionPane.showMessageDialog(null,"Tu salario bruto es: $"+salary+
                        " aplicando descuentos correspondientes:\n" + " AFP: $"+ afp +"\n ISSS(Seguro Social): $"+ SeguroSocial +"\n Renta: $"+ rent +
                        "\n Entonces, tu salario neto es de: $"+pago+". ");

                AfpTotal +=afp; SeguroTotal +=SeguroSocial; RentaTotal +=rent;
                return pago;
            }
            else {
                rent = 0.3 * (salary - 2038.10) + 288.57; pago = restaAfpIsss - rent;

                JOptionPane.showMessageDialog(null,"Tu salario bruto es: $"+salary+
                        " aplicando descuentos correspondientes:\n" + " AFP: $"+ afp +"\n ISSS(Seguro Social): $"+ SeguroSocial +"\n Renta: $"+ rent +
                        "\n Entonces, tu salario neto es de: $"+pago+". ");

                AfpTotal +=afp; SeguroTotal +=SeguroSocial; RentaTotal +=rent;
                return pago;
            }

        }
        else{
            salary= payment.getSalario(); rent=0.1*salary; pago= salary-rent;

            JOptionPane.showMessageDialog(null,"Tu salario bruto es: $"+salary+
                    " aplicando descuentos correspondientes:\n" +
                    " Renta: $"+ rent +
                    "\n Entonces, tu pago es de: $"+pago+". ");

            RentaTotal +=rent;
            return  pago;
        }


         }
    public  static String mostrarTotales(){
        String total= "El total de descuento por Renta es de: $"+ RentaTotal +" dolares. \n"+
                "El total de descuento por AFP es de: $"+ AfpTotal +" dolares. \n"+
                "El total de descuento por ISSS(Seguro Social) es de: $"+ SeguroTotal +" dolares.";
        return  total;

    }



}
