package Colecciones.TP2;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Alumno> alumnos = new ArrayList<>();
        Alumno alumno1 = new Alumno(9, "Jeremias");
        Alumno alumno2 = new Alumno(10, "Facundo");
        Alumno alumno3 = new Alumno(5, "Pedro");
        Alumno alumno4 = new Alumno(7, "Agustin");

        alumnos.add(alumno1);
        alumnos.add(alumno2);
        alumnos.add(alumno3);
        alumnos.add(alumno4);

        for (Alumno alumno : alumnos) {
            System.out.println(alumno);
        }
    }
}
