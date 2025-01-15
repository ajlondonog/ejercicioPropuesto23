/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejerciciopropuesto23;

/**
 *
 * @author ajlon
 */
public class SolECuadratica {
    
    public static double calcularSol1(double a, double b, double c){
        double x1;
        x1 = (-b + Math.sqrt(Math.pow(b,2) - 4*a*c))/(2*a);
        return x1;
    }
    
    public static double calcularSol2(double a, double b, double c){
        double x2;
        x2 = (-b - Math.sqrt(Math.pow(b,2) - 4*a*c))/(2*a);
        return x2;
    }
}
