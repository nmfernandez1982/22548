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
public class Camion extends Vehiculo
{
    private int carga;
    
  
    
    
    @Override
    public void imprimir()
    {
        System.out.println("La carga maxima es:"+carga);
    }

    public int getCarga() {
        return carga;
    }

    public void setCarga(int carga) {
        this.carga = carga;
    }
    
    
    
    
}
