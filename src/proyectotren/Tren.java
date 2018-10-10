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
        this.elementos = new String[numElementos];
    }

    // Métodos
    public void agregarLocomotora(Locomotora locomotora)
    {
        if(this.elemento.length() < numElementos)
        {
            this.elemento[tamActual] = locomotora;
            this.capacidadCarga += locomotora.capacidadCarga;
            ajustaDimensiones(locomotora);
        }
    }

    public void agregarVagones(Vagon vagon) 
    {
        if(this.elemento.length() < numElementos)
        {
            if(this.capacidadCarga > this.peso) {
                agregarLocomotora(new Locomotora());
            }

            this.elemento[tamActual] = vagon;
            ajustaDimensiones(vagon);
        }
    }

    private void ajustaDimensiones(ElementoTren elemento) 
    {
            this.longitud+=elemento.getLongitud();
            this.peso+=elemento.getPeso();
            this.tamActual++;
    }

    public String toString() 
    {
        String c="";
        return c;
    }
}
