/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package universidad;

import java.util.ArrayList;

/**
 *
 * @author usuario
 */
public class Grado extends Estudio{
    private int duracion;

    public Grado(int duracion, int codigo, ArrayList<Alumno> alumnos) {
        super(codigo, alumnos);
        this.duracion = duracion;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }
    public void mostrar(){
        super.mostrar();
        System.out.println("Duracion: "+this.duracion);
    }
}
