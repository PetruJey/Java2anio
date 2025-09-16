package Colecciones.TP3;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        HashSet<Producto> productos = new HashSet<>();
        Producto producto1 = new Producto(0, "Vino");
        Producto producto2 = new Producto(1, "Cerveza");
        Producto producto3 = new Producto(2, "Whisky");
        Producto producto4 = new Producto(0, "Vodka");
        Producto producto5 = new Producto(1, "Coñac");

        productos.add(producto1);
        productos.add(producto2);
        productos.add(producto3);
        productos.add(producto4);
        productos.add(producto5);

        for (Producto producto : productos) {
            System.out.println(producto);
        }
    }
}
