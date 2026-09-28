public class ReemplazarSubcadenas {
    public static void main(String[] args) {
        
        //Reemplazar subcadenas

        var cadena ="Hola Mundo";
        System.out.println("Cadena Original =" + cadena);

        //Reemplazar "Mundo" por "a todos"

        var nuevaCadena = cadena.replace("Mundo", "a todos");
        System.out.println("nuevaCadena = " + nuevaCadena);

        //Reemplazar "Hola" por adios 

        var nuevaCadena1 = cadena.replace("Hola", "Adios");
        System.out.println("nuevaCadena1 =" + nuevaCadena1);
    }
    
}
