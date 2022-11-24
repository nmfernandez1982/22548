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
public class Oveja extends Animal
{
    public String pelo;
    
    
    
    @Override
    public void sonido()
    {
        System.out.println("Meee");
    }
    
    @Override
    public void imprimir()
    {
        System.out.println("Este es un objeto de la clase Oveja");
    }
    
    
}
