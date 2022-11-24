/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases2;

/**
 *
 * @author nfernandez
 */
public class Principal 
{
    public static void main(String[] args)
    {
        
        Persona p1=new Persona();
        p1.apellido="Fernandez";
        p1.id=23;
        p1.edad=41;
        
        
        Persona p2=new Persona(1,"Fernandez");
        Persona p3=new Persona(1,"Fernandez",41);
        
        
        
        
        
    }
    
}
