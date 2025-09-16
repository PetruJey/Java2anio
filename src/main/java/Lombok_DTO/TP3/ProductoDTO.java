package Lombok_DTO.TP3;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Data

public class ProductoDTO {
    private String codigo;
    private String nombre;
    private double precio;
}
