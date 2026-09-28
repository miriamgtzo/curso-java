public class TiposDatos {
    public static void main(String[] args) {
        //Tipos de datos en java
        //Enteros (su valor por default es 0)
        byte unByte = 127;
        short unShort = 32000;
        int unInt = 2147483647;
        long unLong = 9223372036854775807L;  //L o l para indicar tipo long
        
        // Punto flotante (su valor por default es 0.0)
        float unFloat = 3.14F; //Se debe poner F o f para indicar que es flotante 
        double unDouble = 3.141592653589793D; //D o d para indicar tipo double (opcional) 

        // Carácter(Valor por default '\u0000')
        char unChar = 'A'; //Caracter del juego unucide (valor unico)

 
        // Booleano (Valor por default )
        boolean unBoolean = true;


        //Tipo Object (Referencia)
        String nombre = null;
        System.out.println("nombre = " + nombre); //Ausencia de una referecia de un objeto

        nombre = "Fer";
        System.out.println("nombre = " + nombre);
        
        // Imprimir valores soutv + tab 

        System.out.println("byte: " + unByte);
        System.out.println("short: " + unShort);
        System.out.println("int: " + unInt);
        System.out.println("long: " + unLong);
        System.out.println("float: " + unFloat);
        System.out.println("double: " + unDouble);
        System.out.println("char: " + unChar);
        System.out.println("boolean: " + unBoolean);

    }
}
