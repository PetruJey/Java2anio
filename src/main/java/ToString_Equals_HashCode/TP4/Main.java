package ToString_Equals_HashCode.TP4;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Producto> productos = new ArrayList<>();

        Producto producto1 = new Producto(1, "Producto A", 10.0);
        Producto producto2 = new Producto(2, "Producto B", 15.0);
        Producto producto3 = new Producto(1, "Producto C", 12.0);

        agregarProducto(productos, producto1);
        agregarProducto(productos, producto2);
        agregarProducto(productos, producto3);

        for (Producto producto : productos) {
            System.out.println(producto);
        }

    }
    public static void agregarProducto(List<Producto> list, Producto producto) {
        if (!list.contains(producto)) {
            list.add(producto);
        } else {
            System.out.println("El producto con código " + producto.getCodigo() + " ya existe.");
        }
    }
}
