/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

/**
 *
 * @author nfernandez
 */
public class Principal 
{
    public static void main (String[] args)
    {
        /*
        Clases Abstractas --> no se pueden crear nuevos objetos
        
        
        Animal cabra=new Animal();
        cabra.especie="Cabra";
        cabra.color="Blanco y Marron";
        cabra.edad=7;
        cabra.HabitaEn="Norte Argentino";
        cabra.sonido();
        */
        
       Oveja oveja1=new Oveja();
       
       oveja1.edad=7;
       oveja1.pelo="Largo";
       oveja1.sonido();
       oveja1.imprimir();     
       
       
       
        
    }
    
}
