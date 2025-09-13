package ToString_Equals_HashCode.TP2_3;

import java.util.List;
public class Curso {
    String nombre;
    List<Estudiante> listaDeEstudiantes;

    public Curso(String nombre, List<Estudiante> listaDeEstudiantes) {
        this.nombre = nombre;
        this.listaDeEstudiantes = listaDeEstudiantes;
    }


    @Override
    public String toString() {
        return "Curso{\n" +
                "nombre='" + nombre + '\n' +
                ", listaDeEstudiantes=" + listaDeEstudiantes +
                '}';
    }
}
