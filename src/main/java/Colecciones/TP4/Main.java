package Colecciones.TP4;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        HashMap<String, Curso> cursos = new HashMap<>();
        Curso curso1 = new Curso("Programacion I", "Cortez");
        Curso curso2 = new Curso("HTML, CSS, Javascript", "Chiroli");
        Curso curso3 = new Curso("Java", "Espejo");
        cursos.put("C001", curso1);
        cursos.put("C002", curso2);
        cursos.put("C003", curso3);

        for (Map.Entry<String, Curso> curso: cursos.entrySet()){
            String codigoCurso = curso.getKey();
            Curso cursoCurso = curso.getValue();

            System.out.println("El codigo de curso es: " + codigoCurso + " y el curso es: " + cursoCurso);
        }

    }
}
