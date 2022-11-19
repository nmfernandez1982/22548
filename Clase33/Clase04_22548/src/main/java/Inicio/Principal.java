/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Inicio;
package PRUEBA;

/**
 *
 * @author nfernandez
 */
public class Principal 
{
    public static void main(String[] args)
    {
        int aux=12;
        
        Persona p1=new Persona();
        Persona p2=new Persona();
        
        Persona javier=new Persona();
        Persona marta=new Persona();
        
        
        p1.apellido="Fernandez";
        p1.nombre="Nicolas";
        p1.dni=29121224;
        p1.mail="nicolas.fernandez4@bue.edu.ar";
        p1.edad=41;
        
        p2.dni=35122765;
        
        
        
        
        javier.nombre="Javier";
        
        marta.apellido="Alvarez";
        
        
        System.out.println(javier.imprimir());
        
        System.out.println(marta.imprimir());
        
        System.out.println(p1.imprimir());
        
        System.out.println(p2.imprimir());
        
        p1.verificarEdad();
        
        Empleado emp1=new Empleado();
      
        
        emp1.legago=1;
        emp1.nombre="Nicolas";
        emp1.edad=41;
        
        
        
        Empleado2 emp2=new Empleado2();
       
        
        
        
    }
    
}
