package ToString_Equals_HashCode.TP2_3;

public class Estudiante extends Persona{
    String carrera;

    public Estudiante(int edad, String nombre, String carrera) {
        super(edad, nombre);
        this.carrera = carrera;
    }

    @Override
    public String toString() {
        return "Estudiante{" +
                "carrera='" + carrera + '\'' +
                ", nombre='" + nombre + '\'' +
                ", edad=" + edad +
                '}';
    }
}
