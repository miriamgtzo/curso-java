public class BusquedaSubcadena {
    public static void main(String[] args) {
        
        //Buscar subcadenas
        //indexOf - Devuleve el indice de la primera aparicion de la subcadena

        var cadena1 = "Hola Mundo";
        System.out.println("cadena1 = " + cadena1);

        var indice1 = cadena1.indexOf("Hola");
        System.out.println("indice1 = "+ indice1);

        var indice2 = cadena1.indexOf("Mundo");
        System.out.println("indice2 = " + indice2);

        var indice3 = cadena1.indexOf("equis");
        System.out.println("indice3 = "+ indice3);




    }
    
}
