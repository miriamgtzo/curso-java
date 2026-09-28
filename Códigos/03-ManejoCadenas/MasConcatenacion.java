
public class MasConcatenacion {
    public static void main(String[] args) {
        
        //Mas formas de concatenacion cadenas en Java
        var cadena1 = "Hola";
        var cadena2 = "Mundo";
        var cadena3 = cadena1 + " " + cadena2;
        System.out.println("cadena3 usando + = " + cadena3);

        //Metodo concat

        cadena3 = cadena1.concat(" ").concat("Mundo");
        System.out.println("cadena3 usando concat = " + cadena3);

        //StringBuilder

        var construtorCadenas = new StringBuilder();
        construtorCadenas.append(cadena1);
        construtorCadenas.append("  ");
        construtorCadenas.append(cadena2);
        var resultado = construtorCadenas.toString();
        //construtorCadenas.append(cadena1).append(" ").append(cadena2).toString();
        System.out.println("resultado = " + resultado);

        //StringBuffer

        var stringBuffer = new StringBuffer();
        stringBuffer.append(cadena1).append(" ").append(cadena2);
        resultado = stringBuffer.toString();
        System.out.println("Resultado con StringBuffer = " + resultado);


        //join

        resultado = String.join(" ", cadena1 , cadena2);
        System.out.println("resultado join = " + resultado);



    }
    
}
