/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases3;

import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author nfernandez
 */
public class Principal 
{
    public static void main(String[] args)
    {
        Persona p1=new Persona();
        /*
        p1.apellido="Fernandez";
        p1.nombre="Nicolas";
        */
        p1.setId(1);
        p1.setApellido("Fernandez");
        p1.setNombre("Nicolas");
        p1.setEdad(41);
        
        System.out.println("la edad es"+p1.getEdad());
        
        
        
        
        
    }
    
}
