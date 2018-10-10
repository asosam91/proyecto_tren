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
public class ElementoTren {
    private double longitud;
    private double peso;
    private String tipo;
    
    public ElementoTren(){
    
    }
    
    public ElementoTren(String tipo, double peso, double longitud){
        this.longitud = longitud;
        this.peso = peso;
        this.tipo = tipo;
    }
    
    public double getLongitud(){
        return this.longitud;
    }
    
    public double getPeso(){
        return this.peso;
    }
    
    public String getTipo(){
        return this.tipo;
    }

    public void setLongitud(double longitud) {
        this.longitud = longitud;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
    public String toString(){
        return "";
    }
}
