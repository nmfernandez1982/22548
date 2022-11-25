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
    
   public static void main(String[] args)
   {
       //Vehiculo v1=new Vehiculo();
       
       Camion c1=new Camion();
       //c1.carga=4500;    
       c1.setCarga(4200);
       c1.setAnio(1997);
       
       System.out.println("Capacidad Carga:"+c1.getCarga()+" Año:"+c1.getAnio());
       
       Camioneta ca1=new Camioneta();
       
       
    
   }
   
    
}
