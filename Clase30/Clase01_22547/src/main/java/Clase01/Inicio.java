/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clase01;
import java.util.Scanner;

/**
 *
 * @author nfernandez
 */
public class Inicio 
{
    public static void main(String [] args)
    {
        //variables        
        int variableEntera=10;
        String variableString="Nicolas";        
        boolean variableBoolean=true;
        double variableDouble=1000.4;
        
        
         //Imprimir por pantalla
         System.out.println("Hola Mundo.....");         
         System.out.println(variableEntera);         
         System.out.println("Valor de la variable entera es:"+variableEntera);
         System.out.println("Valor de la variable variableString es:"+variableString); 
        
        //ingresar por pantalla
        
        Scanner ingreso=new Scanner(System.in);
        System.out.println("Ingrese un valor: ");
        variableEntera=ingreso.nextInt();        
        
        System.out.println("EL dato ingresado es: "+variableEntera);
        
        //condicionales
        
        if(variableEntera==120)
        {
            System.out.println("La variable es 120 en if");
        }
        else
        {
            System.out.println("La variable es otra.....en if");
        }
        
        
        switch(variableEntera)
        {
            case 120:
                    System.out.println("La variable es 120 en switch");
                     break;
            case 121:
                    System.out.println("La variable es 121 en switch");
                    break;
            default:
                    System.out.println("La variable otra en switch");
                    break;
        }
        
        
        
        //iteraciones
        
        int opcion=0;
        do{
             System.out.println("La opcion vale en DO:"+opcion);
            opcion++;
        }while(opcion!=5);
        
        
        
        opcion=0;
        while(opcion!=5)
        {
            System.out.println("La opcion vale WHILE:"+opcion);
            opcion++;
        }
        
        
        
        
    }
}
