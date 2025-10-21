package GenericAndReflection.TP3;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main (String [] args){
        Caja<String> cajaString = new Caja<>();
        Caja<Integer> cajaInteger = new Caja<>();
        cajaString.setContenido("Hola, Mundo!");
        cajaInteger.setContenido(1234);
        System.out.println("Caja Strings:");
        System.out.println(cajaString.getContenido());
        System.out.println("Caja Integers:");
        System.out.println(cajaInteger.getContenido());
        System.out.println("Lista sin Genéricos:");
        List listaSinGenericos = new ArrayList<>();
        listaSinGenericos.add("Hola, Mundo!");
        listaSinGenericos.add(1234);
        for (Object elemento : listaSinGenericos){
            System.out.println("Elemento: " + elemento + "\nTipo: " + elemento.getClass().getSimpleName());
        }
    }
}
