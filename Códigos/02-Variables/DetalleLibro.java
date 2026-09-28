public class DetalleLibro {
    public static void main(String[] args) {
        //Detalle de un libro 
        String tituloLibro = "El señor de los anillos";
        int anioPublicacion = 1945;
        boolean liborDisponible = true;
        double precio = 500.50;

        System.out.println(tituloLibro);
        System.out.println(anioPublicacion);
        System.out.println(liborDisponible);
        System.out.println(precio);

        //Modificar el titulo del libro
        tituloLibro = "El Señor de los Anillos";
        System.out.println(tituloLibro);
    }
    
}
