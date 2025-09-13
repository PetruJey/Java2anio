package ToString_Equals_HashCode.TP2_3;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Main {
    public static void main(String [] args){
        Estudiante e1 = new Estudiante(20, "Juan", "Ingeniería en Sistemas");
        Estudiante e2 = new Estudiante(22, "Maria", "Diseño Gráfico");
        Estudiante e3 = new Estudiante(21, "Pedro", "Medicina");
        HashSet<Estudiante> estudianteshs = new HashSet<>();
        estudianteshs.add(e1);
        estudianteshs.add(e2);
        estudianteshs.add(e3);

        for (Estudiante est:estudianteshs){
            System.out.println(est);
        }
        List<Estudiante> estudiantesAL = new ArrayList<>();
        estudiantesAL.add(e1);
        estudiantesAL.add(e2);
        estudiantesAL.add(e3);

        Curso prog1 = new Curso("Programación", estudiantesAL);

        System.out.println(prog1);
    }
}
