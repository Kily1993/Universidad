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
public abstract class Estudio {
    private int codigo; 
    private ArrayList<Alumno> alumnos;

    public Estudio(int codigo, ArrayList<Alumno> alumnos) {
        this.codigo = codigo;
        this.alumnos = alumnos;
    }
    

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public ArrayList<Alumno> getAlumnos() {
        return alumnos;
    }

    public void setAlumnos(ArrayList<Alumno> alumnos) {
        this.alumnos = alumnos;
    }

    

   
    
       public void mostrar(){
        System.out.println("Codigo: "+this.codigo);
        
    }
    
}
