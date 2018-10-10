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
        return this.capacidadCarga;
    }

    /**
    *  Obtiene información general del tren
    */
    public String getInfo() 
    {
        String info = "Número de elementos:\t" + this.numElementos +
            "Peso:\t\t\t" + this.peso + 
            "Longitud:\t\t" + this.longitud +
            "Capacidad de carga:\t" + this.capacidadCarga;
        return info;
    }

    // Getters
    public double getLongitud() 
    {
        return this.longitud;
    }

    public int getNumElementos() 
    {
        return this.numElementos;
    }

    public double getPeso() 
    {
        return this.peso;
    }

    public int getTamActual() 
    {
        return this.tamActual;
    }

    /**
    * Constructor
    */
    public Tren() 
    {

    }

    // Métodos
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
