/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.empleado;

/**
 *
 * @author marlon
 */
public class Empleado {
String nombre;
int horasTrabajadas;
double costoHora;
int yearIngreso;

public String mostrarInfo(){
    String retorno ="El empleado se llama: " + this.nombre + " su numero de horas trabajadas es: "
            + this.horasTrabajadas + " y costo por horas de su trabajo es: " + this.costoHora+"$"
            +" y el año que ingreso a trabajar es: "+this.yearIngreso;
    
    return retorno;
}
public double calculoIngresos(){
    double retorno = 0;
    int añosTrabajados = 0;
    double porcentajeAños = 0;
    añosTrabajados = 2022-this.yearIngreso;
    porcentajeAños = añosTrabajados=(int) 0.02;
    retorno = (this.costoHora*this.horasTrabajadas)+((this.costoHora*this.horasTrabajadas)*porcentajeAños);
    
    return retorno;    
}
public double bonoHorasExtras(){
   double retorno = 0;
   int horaExtras = 0;
   if(this.horasTrabajadas>160){
       horaExtras = (this.horasTrabajadas-160);
       retorno = ((horaExtras*2)*this.costoHora);
   }
    return retorno;
}
public double calcularImpuesto(int limit1, int limit2, int limit3){
    var retorno =0d;
    var basico = this.costoHora * this.horasTrabajadas;
    if(basico > limit1 && basico < limit2){
        retorno = basico * 0.05;
    }
    else {
        if (basico > limit2 && basico < limit3){
            retorno = basico * 0.12;
            }
        else {
            if (basico > limit3){
                retorno = basico * 0.25;
                }
        }
    }
    return retorno;
}
public double calcularTotal(int limit1, int limit2, int limit3){
    var retorno = this.bonoHorasExtras() + this.calculoIngresos() - this.calcularImpuesto(limit1,limit2,limit3);
    return retorno;
    }
}
    
    

