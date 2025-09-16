package Lombok_DTO.TP4;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Data

public class Producto {
    private String codigo;
    private String nombre;
    private String proveedor;
    private double precio;
}
