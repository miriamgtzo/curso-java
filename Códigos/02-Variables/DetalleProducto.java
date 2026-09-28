public class DetalleProducto {
    public static void main(String[] args) {

        //Detalle del producto

        System.out.println("**Tienda en linea (Detalle Producto)");
        String nombreProducto = "Gansito";
        double precioProducto = 26;
        int cantidadDisponible = 15;
        boolean disponibleVenta = true; 


        //Imprimir el detalle del producto

        System.out.println("disponibleVenta =" + disponibleVenta);
        System.out.println("nombreProducto =" + nombreProducto);
        System.out.println("precioProducto = " + precioProducto);
        System.out.println("cantidadDisponible =" + cantidadDisponible);

        //Modificar los valores 

        nombreProducto = "Gansito";
        precioProducto = 26.50;
        cantidadDisponible = 0;
        disponibleVenta = false; 

        System.out.println();
        System.out.println("disponibleVenta =" + disponibleVenta);
        System.out.println("nombreProducto =" + nombreProducto);
        System.out.println("precioProducto = " + precioProducto);
        System.out.println("cantidadDisponible =" + cantidadDisponible);

        
    }
    
}
