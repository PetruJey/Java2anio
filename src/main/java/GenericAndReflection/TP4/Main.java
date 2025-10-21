package GenericAndReflection.TP4;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static <T> void imprimirLista(List<T> lista){
        for (T elemento : lista){
            System.out.println("- " + elemento);
        }
    }
    public static void main (String [] args){
        List<Integer> listaNums = new ArrayList<>();
        listaNums.add(5);
        listaNums.add(10);
        listaNums.add(15);
        System.out.println("Lista Integers:");
        imprimirLista(listaNums);

        List<String> listaStr = new ArrayList<>();
        listaStr.add("Hola");
        listaStr.add("Mundo");
        listaStr.add("!!!");
        System.out.println("Lista Strings:");
        imprimirLista(listaStr);
    }
}
