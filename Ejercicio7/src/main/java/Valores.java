/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author melian
 */
public class Valores {
    double A,B;
    
    public Valores(double a, double b){
        A = a;
        B = b;
    }
    
    public String calcularMayor(){
        if(A>B){
            return ("A es mayor que B");
        }else if(B>A){
            return ("A es menor que B");
        }else{
            return ("A es igual a B");
        }
    }
    
}
