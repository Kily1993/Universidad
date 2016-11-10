/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package universidad;

/**
 *
 * @author usuario
 */
public class Intercambio extends Alumno{
    private String universidad_origen;

    public Intercambio(String universidad_origen, String nombre, int edad) {
        super(nombre, edad);
        this.universidad_origen = universidad_origen;
    }

    public String getUniversidad_origen() {
        return universidad_origen;
    }

    public void setUniversidad_origen(String universidad_origen) {
        this.universidad_origen = universidad_origen;
    }
    public void mostrar(){
        super.mostrar();
        System.out.println("Universidad de Origen "+this.universidad_origen);
    }
}
