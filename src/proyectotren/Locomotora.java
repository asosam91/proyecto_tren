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
public class Locomotora extends ElementoTren{
    private double capacidadCarga = 200000;
    
    public Locomotora(){
        super("Locomotora", 92600, 20.17);
    }
    
    public double getCapacidadCarga(){
        return this.capacidadCarga;
    }
}
