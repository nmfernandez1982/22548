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
public abstract class Animal 
{
    public String especie;
    String color;
    public int edad;
    public String HabitaEn;   
        
    
    public void sonido()
    {
        System.out.println("Sonido Del Animal");
    }
    
    public abstract void imprimir();
    
    
    
}
