/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectotren;

/**
 *
 * @author Samuel
 */
public class Tren {
    private double capacidadCarga;
    private ElementoTren[] elementos;
    private double longitud;
    private int numElementos = 100;
    private double peso;
    private int tamActual;

    public double getCapacidadCarga() 
    {
        return capacidadCarga;
    }

    public void getInfo() 
    {

    }

    public double getLongitud() 
    {
        return longitud;
    }

    public int getNumElementos() 
    {
        return numElementos;
    }

    public double getPeso() 
    {
        return peso;
    }

    public double getTamActual() 
    {
        return 0.0;
    }

    /**
    * Constructor
    */
    public Tren() 
    {

    }

    public void agregarLocomotora(Locomotora locomotora)
    {

    }

    public void agregarVagones(Vagon vagon) 
    {

    }

    private void ajustaDimensiones(ElementoTren elemento) 
    {

    }

    public String toString() 
    {
        String c="";
        return c;
    }


}
