package Lombok_DTO.TP3;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Producto producto1 = new Producto("001", "Libro A", 1200.0, "Autor A");
        Producto producto2 = new Producto("002", "Libro B", 950.0, "Autor B");

        ProductoDTO dto1 = new ProductoDTO();
        dto1.setCodigo(producto1.getCodigo());
        dto1.setNombre(producto1.getNombre());
        dto1.setPrecio(producto1.getPrecio());

        ProductoDTO dto2 = new ProductoDTO();
        dto2.setCodigo(producto2.getCodigo());
        dto2.setNombre(producto2.getNombre());
        dto2.setPrecio(producto2.getPrecio());

        List<ProductoDTO> listaDTOs = new ArrayList<>();
        listaDTOs.add(dto1);
        listaDTOs.add(dto2);

        System.out.println("Lista de productos DTO:");
        for (ProductoDTO dto : listaDTOs) {
            System.out.println(dto);
        }
    }
}
