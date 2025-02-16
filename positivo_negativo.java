
import java.text.MessageFormat;
import java.util.Scanner; // Importamos la clase Scanner

/**
 * @ Escribir un programa que solicite un valor entero al usuario y determine si es positivo o negativo.
 * 
 * @autor Nelson Palacio
 */

public class positivo_negativo { // Nombre de la clase corregido
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Crear un objeto Scanner
        int n1 = 0;
        
        System.out.println("DIGITE UN NUMERO:");
        n1 = scanner.nextInt();
      
            if(n1>0 )
            {
                System.out.println("EL NUMERO ES POSITIVO:");
            }
            if(n1<0){
                System.out.println("EL NUMERO ES NEGATIVO");
            }
           if(n1==0){
                System.out.println("INGRESO EL NUMERO CERO [0]");
            }


    }
}
