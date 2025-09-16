package Lombok_DTO.TP2;

public class Main {
    public static void main(String[] args) {
        Usuario usuario1 = Usuario.builder()
                .id(0)
                .nombre("Jeremias")
                .email("example@gmail.com")
                .build();
        Usuario usuario2 = Usuario.builder()
                .id(1)
                .nombre("Emiliano")
                .email("example2@gmail.com")
                .build();

        System.out.println(usuario1);
        System.out.println(usuario2);
    }
}
