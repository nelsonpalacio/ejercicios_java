import java.text.MessageFormat;
import java.util.Scanner; // Importamos la clase Scanner

/**
 * @ 1.1 Escribir un programa que solicite un valor entero al usuario y determine si es par o impar.
 * 
 * @autor Nelson Palacio
 */

public class n_entero { // Nombre de la clase corregido
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Crear un objeto Scanner
        int n1 = 0;
        System.out.println("DIGITE UN NUMERO:");
        n1= scanner.nextInt();
        if(n1%2==0)
        {
            System.out.println("El numero:"+n1+ " es par");
        }else{
            System.out.println("El numero:"+n1+ " es impar");
        }
        

               
        }

    }

