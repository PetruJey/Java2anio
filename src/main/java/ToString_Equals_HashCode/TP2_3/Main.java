package ToString_Equals_HashCode.TP2_3;

import java.util.HashSet;

public class Main {
    public static void main(String [] args){
        Estudiante e1 = new Estudiante(20, "Juan", "Ingeniería en Sistemas");
        Estudiante e2 = new Estudiante(22, "Maria", "Diseño Gráfico");
        Estudiante e3 = new Estudiante(21, "Pedro", "Medicina");
        HashSet<Estudiante> estudiantes = new HashSet<>();
        estudiantes.add(e1);
        estudiantes.add(e2);
        estudiantes.add(e3);

        System.out.println(estudiantes);
    }
}
