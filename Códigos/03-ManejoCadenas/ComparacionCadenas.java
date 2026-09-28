public class ComparacionCadenas {
    public static void main(String[] args) {

        //Compracion de cadenas (poolde cadenas)
        var cadena1 = "Java";
        var cadena2 = "Java";

        var cadena3 = new String ("Java");
    
        //Comparacion de cadenas (==) compraran la referencia

        System.out.print("Cadena1 es igual en referencia a cadena2:  ");
        System.out.println(cadena1 == cadena2);

        System.out.print("Cadena1 es igual en referencia a cadena3:  ");
        System.out.println( cadena1 == cadena3);

        //Coparar contenido (Equals)

        System.out.println("cadena1 es igual a contendio a cadena3");
        System.out.println(cadena1.equals(cadena3));
    
    }
    
}
