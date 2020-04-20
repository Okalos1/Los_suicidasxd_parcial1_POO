package com.AELR.x00136419;


import javax.swing.*;
import java.util.Scanner;


public class Main {
    static Scanner In = new Scanner(System.in);

    public static void main(String[] args) {

        String nombre, num, puesto;
        int extension, mesesContrato;
        double salario;
        String EmpresaN ;
        byte op;

        Empresa Empresa = new Empresa("Empresa");

        EmpresaN = JOptionPane.showInputDialog(null, Bienvenida());

         do{
            op = (byte) Integer.parseInt(JOptionPane.showInputDialog(null,Menu()));

            switch (op){
                case 1: //agregar empleado
                        byte opt;
                    opt = (byte) Integer.parseInt(JOptionPane.showInputDialog(null,TipoEmpleado()));

                        switch (opt){
                            case 1: //Plaza fija
                                nombre=JOptionPane.showInputDialog(null, "Nombre:");
                                puesto=JOptionPane.showInputDialog(null, "Puesto:");
                                salario= Double.parseDouble(JOptionPane.showInputDialog(null, "Salario:"));
                                extension= Integer.parseInt(JOptionPane.showInputDialog(null,"Meses de contrato:"));
                                Empresa.addEmpleado(new PlazaFija(nombre,puesto,salario,extension));
                                break;

                            case 2: //servicio prof
                                nombre = JOptionPane.showInputDialog(null, "Nombre: ");
                                puesto = JOptionPane.showInputDialog(null, "Puesto: ");
                                salario = Double.parseDouble(JOptionPane.showInputDialog(null,"Salario: "));
                                mesesContrato = Integer.parseInt(JOptionPane.showInputDialog(null, "Meses de contraro: "));
                                Empresa.addEmpleado(new ServicioProfesional(nombre,puesto,salario,mesesContrato));
                                break;

                            default:
                                JOptionPane.showMessageDialog(null,"Opcion erronea, intente nuevamente");
                        }
                break;

                case 2: //Despedir empleado

                    nombre=JOptionPane.showInputDialog(null,"Nombre de empleado a despedir: ");

                    Empresa.quitEmpleado(nombre);

                    break;

                case 3: //mostrar planilla
                    JOptionPane.showMessageDialog(null, "Empleados actuales de la empresa: ");


                    for (Empleado x: Empresa.getPlanilla()
                    ) {
                        String mostrar ="Nombre: "+x.getNombre()+
                                "\nPuesto: "+x.getPuesto()+
                                "\nSalario: "+x.getSalario();
                        if(x instanceof ServicioProfesional)
                            mostrar += "\nMeses de contrato: "+((ServicioProfesional)x).getMeses_contrato();
                        else if (x instanceof PlazaFija)
                            mostrar += "\nExtension: "+ ((PlazaFija)x).getExtension();
                        /*for (Documento doc: documentoAux
                        ) {
                            mostrar += "\nNombre del Documento: "+ doc.getNombre();
                            mostrar += "\nNumero de identificacion: "+ doc.getNúmero();

                        }*/
                        JOptionPane.showMessageDialog(null,mostrar);
                        }

                        break;

                case 4:
                    byte opt1;
                    opt1= Byte.parseByte(JOptionPane.showInputDialog(null, TipoEmpleado()));

                    switch (opt1){

                        case 1:

                    }





            }



            }while (op != 0);







        return ;
    }

    public static String TipoEmpleado(){
        return "Digite el tipo de empleado: \n" +
                "1. Empleado de plaza fija\n"+
                "2. Empleado de Servicio Profecional\n"+
                "\n Seleccion: ";
    }

    public static String Bienvenida(){
        return "      BIENVENIDO AL SISTEMA DE EMPLEADOS Y SALARIO      " + "\n Digite el nombre de su empresa: ";
    }

    public static String Menu(){
        return "Digite la opcion que desea realizar:\n"+
                "1. Agregar Empleado  \n" +
                "2. Despedir Empleado  \n" +
                "3. Ver lista de empleados  \n" +
                "4. Calcular sueldo  \n" +
                "5. Mostrar totales  \n"+
                "0. Salir\n"+
                "\nOpcion a elegir: ";
    }



}
