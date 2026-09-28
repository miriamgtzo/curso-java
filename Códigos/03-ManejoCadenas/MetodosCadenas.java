public class MetodosCadenas {
    public static void main(String[] args) {
        
        //Metodos de cadenas
        var cadena1 = "Hola Mundo";

        //Obtener el largo de una cadena
        var longitud = cadena1.length();
        System.out.println("longuitud = " + longitud);

        //Reemplazar caracteres  
        var nuevaCadena = cadena1.replace('o','a');
        System.out.println("nuevaCadena = " + nuevaCadena);
        
        //Convertir a mayusculas
        var mayusculas = cadena1.toUpperCase(); 
        System.out.println("Mayusculas = " + mayusculas);

        //Convertir en minusculas
        var minusculas = cadena1.toLowerCase();
        System.out.println("Minusculas = " + minusculas);

        //Elimiar espacios al inicio y al final
        var cadena2 = "     Miriam Gutierrez       ";
        System.out.println("cadena con espacios = " + cadena2);
        System.out.println("Cadena sin espacios = " + cadena2.trim());
    }
    
}
