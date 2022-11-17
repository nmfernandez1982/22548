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
public class Ej02 
{
    public static void main(String[] arg)
    {
  
     
     try
     {
         dividir(5,0);
     }
     catch(ArithmeticException e)
     {
            System.out.println("No es posible realizar la operacion");                   
     }
     
     
    }
    
 
    public static int dividir(int a , int b)
    {
        int resultado=0;
        try //evaluar si se puede hacer
        {
        resultado=(a/b);
       System.out.println("El resultado es :"+resultado);
        }
        catch(ArithmeticException e)
         {
             throw  new ArithmeticException();                    
        }
        
        return resultado;       
    }
    
    
    
}
