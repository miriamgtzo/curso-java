import java.net.Socket;
import java.util.Scanner;

public class LeerTipoDatos {
    public static void main(String[] args) {
        //Leer distintos tipos de datos


        //Leer un tipo int 

        var consola = new Scanner(System.in);
        System.out.println("Ingresa tu edad: ");
        var edad = consola.nextLine();
        System.out.println("Edad: = " + edad);

        //Leer un tipo double

        var consola2 = new Scanner(System.in);
        System.out.println("Ingresa tu altura: ");
        var altura = consola2.nextDouble();
        System.out.println("Altura: = " + altura);

        //Consumimos el caracter de salto de linea
        consola.nextLine();
        //Leer un tipo String
        System.out.println("Ingresa tu nombre:");
        var nombre = consola.nextLine();
        System.out.println("nombre = " + nombre);

        //Conversion de Datos

        System.out.println("Proporciona un valor entero");
        //var enteroString = consola.nextLine();
        //var entero = Integer.parseInt(enteroString);
        var entero = Integer.parseInt(consola.nextLine());
        System.out.println("entero: =" + entero);

        //Tipo flotante 

        System.out.println("Ingresa un valor flotante");
        var flotante = Float.parseFloat(consola.nextLine());
        System.out.println("Flotante  =" + flotante);

        //Double.parseDouble()
        //Boolean.pasrseBoolean()


    }
    
}
