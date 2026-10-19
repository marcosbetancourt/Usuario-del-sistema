void main() {

    Usuario user1 = new Usuario();

    user1.setUsername("Danny Jacho");
    user1.setCorreo("danny@udla.edu.ec");
    user1.setNivel(2);

    user1.activar();

    System.out.println("Usuario: " + user1.getUsername());
    System.out.println("Correo: " + user1.getCorreo());
    System.out.println("Nivel actual: " + user1.getNivel());
    System.out.println("¿Está activo?: " + user1.isActivo());

    }