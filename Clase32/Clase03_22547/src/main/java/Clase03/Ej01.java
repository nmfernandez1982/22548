/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clase03;

/**
 *
 * @author nfernandez
 */
public class Ej01 
{
    public static void main (String [] args)
    {
        //Metodo Parse
        double c=12.5;
        
        //c="1500.45";        
        c=Double.parseDouble("1500.45");        
        System.out.println("El numero es: "+c);        
        int numeroEntero=Integer.parseInt("100");
        System.out.println("El numero es: "+numeroEntero);
        
        //funciones.  
        
        imprimir();
        
        int x;
        x=calculo();
        System.out.println("EL resultado de la funcion Calculo es: "+x);
        
        int y;
        y=resta(5, x);
        System.out.println("EL resultado de la funcion Calculo es: "+y);
        
        
        titulo1("Funcion con String");
      
        
    }
    
    public static void imprimir()
        {
            System.out.println("Titulo Principal de la APP");
            
        }
    
   public static int calculo()
   {
       int x=0;
       x=45+5;
       return x;
   }
   
   public static int resta(int x, int y)
   {
       int operacion=(x-y);        
       return operacion;
   }
   
   public static void titulo1(String titulo)
   {
       System.out.println(titulo);
   }
    
}
