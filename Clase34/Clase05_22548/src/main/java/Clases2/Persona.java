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
public class Persona 
{
    public int id;
    public String nombre;
    public String apellido;
    public int edad;
    public String mail;
   
   
    public Persona()
    {
        super();
    }
    
    
    public Persona(int id,String apel)
    {
        this.id=id;
    }
    
    public Persona(int codigo,String apel,int cantAnios)
    {
     id=codigo;
     apellido=apel;
     edad=cantAnios;        
    }
    
     public Persona(int id,String nombre,String apellido,int edad,String mail)
    {
        this.id=id;
        this.nombre=nombre;
        this.apellido=apellido;
        this.edad=edad;
        this.mail=mail;        
    }
    
    
    
}
