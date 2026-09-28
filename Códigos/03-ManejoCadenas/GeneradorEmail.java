public class GeneradorEmail {
        public static void main(String[] args) {
            System.out.println("***Generador de Emails***");

            //Nombre del usuario 
            var nombreUsuario = "Ubaldo Acosta Soto";
            System.out.println("nombreUsuario = " + nombreUsuario);

            //Procesar o normalizar el nombre de usuario 
            //limpiar los espacios en blanco al inicio y al final 
            var nombreNormalizado = nombreUsuario.strip();

            //Reemplazar los espacios en blanco por punto
            nombreNormalizado = nombreNormalizado.replace(" ", ".");

            //Convertimos en minusculas
            nombreNormalizado = nombreNormalizado.toLowerCase();
            System.out.println("nombreNormalizado = " + nombreNormalizado);


            //Nombre de la empresa
            var nombreEmpresa = "Global Metoring";
            System.out.println(" \n NombreEmpresa = " + nombreEmpresa);

            //Extencion de la extencion 

            var extensionDominio = ".com.mx";
            System.out.println("Extensión del Dominio: =" + extensionDominio);

            //Quitamos los datos de la empresa en blanco y convertimos a minusculas

            var nombreEmpresaNormalizado = nombreEmpresa.strip().replace (" " , ".").toLowerCase();
            var dominioEmailNormalizado = "@" + nombreEmpresaNormalizado + extensionDominio;
            System.out.println("dominioEmailNormalizado = " + dominioEmailNormalizado);
            
            
            //Creamos el email final

            var emailNormalizado = nombreNormalizado + dominioEmailNormalizado;
            System.out.println("emailNormalizado = " + emailNormalizado);



        
    }
    
}
