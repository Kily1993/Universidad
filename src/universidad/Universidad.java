package universidad;

import java.util.ArrayList;

public class Universidad {

    static ArrayList<Facultad> facultades = new ArrayList<>();
    static ArrayList<Estudio> estudios;
    static ArrayList<Alumno> alumnos;

    public static void rellenarDatos() {

        for (int j = 0; j < 3; j++) {
            estudios = new ArrayList<>();
            facultades.add(new Facultad("Avda Extremadura nº" + j, "Badajoz " + j, estudios));

            for (int i = 0; i < 20; i++) {
                alumnos = new ArrayList<>();
                if (i < 10) {
                    estudios.add(new Grado(100, 123 + i, alumnos));
                } else if (i < 15) {
                    estudios.add(new MasterPostgrado("Programacion", "Informatica", 2345 + i, alumnos));
                } else {
                    estudios.add(new MasterNoOficial("Ingeniero " + i, "Informatica", 34556 + i, alumnos));
                }

                for (int k = 0; k < 15; k++) {
                    if (k < 5) {
                        alumnos.add(new Regular("Manolo " + k, ((int) (Math.random() * (30 - 18) + 18))));
                    } else if (k < 10) {
                        alumnos.add(new Becario("Departamento " + k, "Norberto " + k, ((int) (Math.random() * (30 - 18) + 18))));
                    } else {
                        alumnos.add(new Intercambio("Universidad " + k, "Karen " + k, ((int) (Math.random() * (25 - 17) + 17))));
                    }

                }

            }
        }
    }
    

    public static void main(String[] args) {
        rellenarDatos();
       facultades.get(2).mostrar();
       estudios.get(10).mostrar();
       alumnos.get(3).mostrar();
       
    }

}
