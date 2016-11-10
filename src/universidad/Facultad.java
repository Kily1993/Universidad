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
public class Facultad {
    private String direccion;
    private String ciudad;
    private ArrayList<Estudio> estudios;

    public Facultad(String direccion, String ciudad, ArrayList<Estudio> estudios) {
        this.direccion = direccion;
        this.ciudad = ciudad;
        this.estudios = estudios;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public ArrayList<Estudio> getEstudios() {
        return estudios;
    }

    public void setEstudios(ArrayList<Estudio> estudios) {
        this.estudios = estudios;
    }
    
    
    public void mostrar(){
        System.out.println("La ciudad es "+this.ciudad);
        System.out.println("La direccion es "+this.direccion);
    }
    
    
    
}
