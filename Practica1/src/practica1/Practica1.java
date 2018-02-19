/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica1;
import practica1.potenciaCuadrado;


/**
 *
 * @author tosh
 */
public class Practica1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //potenciaCuadrado pc = new potenciaCuadrado();
        //double resultado = pc.potenciaCuadrado(5);
        
        //System.out.println("El resultado es: " + Double.toString(resultado));
        
        
        double radicando = 8;
        System.out.println("La raiz cuadrada de " + radicando + " es: " + Practica1.raizCubica(radicando));
        
        
    }
    
    public static int factorial(int n){
        if(n == 0)
            return 1;
        else
            return (n*factorial(n-1));
    }
    
    /***
     * Funcion que calcula la raiz cubica del numero envidado por parametro
     * @param radicando Valor a calcular la raiz cuadrada
     * @return raiz cuadra del numero enviado por parametro
     */
    public static double raizCubica(double radicando){
        return Math.pow(radicando, (double)1/3);
    }
    
}
