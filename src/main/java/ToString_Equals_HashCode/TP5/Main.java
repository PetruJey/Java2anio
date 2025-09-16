package ToString_Equals_HashCode.TP5;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        HashSet<Producto> productos = new HashSet<>();
        Producto producto1 = new Producto(1, "Producto A", 10.0);
        Producto producto2 = new Producto(2, "Producto B", 15.0);
        Producto producto3 = new Producto(1, "Producto C", 1.0);
        Producto producto4 = new Producto(3, "Producto D", 12.0);
        Producto producto5 = new Producto(2, "Producto E", 5.0);

        agregarProducto(productos, producto1);
        agregarProducto(productos, producto2);
        agregarProducto(productos, producto3);
        agregarProducto(productos, producto4);
        agregarProducto(productos, producto5);

        for (Producto producto : productos) {
            System.out.println(producto);
        }
    }

    private static void agregarProducto(HashSet<Producto> hash ,Producto producto) {
        if (!hash.contains(producto)) {
            hash.add(producto);
        } else {
            System.out.println("El producto con código " + producto.getCodigo() + " ya existe.");
        }
    }
}
