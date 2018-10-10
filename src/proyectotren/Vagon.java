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
public class Vagon extends ElementoTren{
    private double carga;
    
    public Vagon(double carga){
        super("Vagon", 25400 + carga, 18.28);
        this.carga = carga;
    }
}