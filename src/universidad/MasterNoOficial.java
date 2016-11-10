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
public class MasterNoOficial extends Master{
    private String titulo;

    public MasterNoOficial(String titulo, String especialidad, int codigo, ArrayList<Alumno> alumnos) {
        super(especialidad, codigo, alumnos);
        this.titulo = titulo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public void mostrar(){
        super.mostrar();
        System.out.println("Titulo "+this.titulo);
    }
}
