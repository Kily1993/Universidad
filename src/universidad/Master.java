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
public abstract class Master extends Estudio{
    private String especialidad;

    public Master(String especialidad, int codigo, ArrayList<Alumno> alumnos) {
        super(codigo, alumnos);
        this.especialidad = especialidad;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }
    public void mostrar(){
        super.mostrar();
        System.out.println("La especialidad es: "+this.especialidad);
    }
}
