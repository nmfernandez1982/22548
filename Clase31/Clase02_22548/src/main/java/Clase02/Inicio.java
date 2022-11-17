/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clase02;

import java.util.ArrayList;
import java.util.List;


/**
 *
 * @author nfernandez
 */
public class Inicio 
{
    public static void main(String[] args)
    {      
       for(int aux=0;aux<100;aux++)
       {
           System.out.println("El valor de aux es: "+aux);
       }    
       String[] frutas={"frutillas","Bananas","Duraznos","Peras"};
       boolean[] datos={true,false,true,true,true};
       double[] numeros={1220.31,234.12};
       char[] letras={'A','A','A'};
       
       //miObjeto[] Prueba={};
       
        //System.out.println(datos[12]);
        
        System.out.println("Tamaño del Array: "+frutas.length);
       
       frutas[2]="Uvas";
       
       for(int x=0;x<frutas.length;x++)
       {
           System.out.println(frutas[x]);
       }
       
       
       int[] numerosEnteros={1000,2,345,1,0,4567,3,8,9999,4};
       
       //listas
       List<String> provincias=new ArrayList<String>();
       
       provincias.add("Tucuman");
       provincias.add("Mendoza");
       provincias.add("Misiones");
       
       
       for(String prov:provincias)
       {
           System.out.println("Elementos: "+prov);
           
       }
       
       provincias.add("Entre Rios");       
       provincias.remove(2);
       
        for(String prov:provincias)
       {
           System.out.println("Elementos: "+prov);
           
       }
        
        
        provincias.clear();
    
       
       
       
       
       
       
       
    }    
}
