/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Inicio;

/**
 *
 * @author nfernandez
 */
public class Persona 
{
    String nombre;
    String apellido;
    String mail;
    int edad;
    int dni;    
    
    
    public String imprimir()
    {           
        return ("Nombre :"+nombre+" Apellido:"+apellido+" Edad:"+edad);
    }
    
    public void verificarEdad()
    {
        if(edad<18)
        {
            System.out.println("No habilitado");
        }
        else
        {
            System.out.println("Habilitado");
        }
        
    }
    
}
