package Lombok_DTO.TP4;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Producto p1 = new Producto("A001", "Laptop", "TechPro", 1500.00);
        Producto p2 = new Producto("A002", "Mouse", "PeriTech", 25.50);
        Producto p3 = new Producto("A003", "Teclado", "PeriTech", 45.75);

        ProductoRecord r1 = new ProductoRecord(p1.getCodigo(), p1.getNombre(), p1.getPrecio());
        ProductoRecord r2 = new ProductoRecord(p2.getCodigo(), p2.getNombre(), p2.getPrecio());
        ProductoRecord r3 = new ProductoRecord(p3.getCodigo(), p3.getNombre(), p3.getPrecio());

        List<ProductoRecord> lista = new ArrayList<>();
        lista.add(r1);
        lista.add(r2);
        lista.add(r3);

        System.out.println("Lista de ProductoRecord:");
        for (ProductoRecord pr : lista) {
            System.out.println(pr);
        }
    }
}
