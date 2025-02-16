import java.text.MessageFormat;
import java.util.Scanner; // Importamos la clase Scanner

/**
 * @ descripcion clase principal del programa
 * 
 * @autor Nelson Palacio
 */

public class calculadora { // Nombre de la clase corregido
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Crear un objeto Scanner
        int numero1 = 100;
        int numero2 = 200;

        int opc = 0;
        int time = 3000;

        while (opc != 5) {
            System.out.println("1) SUMA");
            System.out.println("2) RESTA");
            System.out.println("3) MULTIPLICACION");
            System.out.println("4) DIVISION");
            System.out.println("5) SALIR");
            System.out.println("DIGITE LA OPCION:");
            opc = scanner.nextInt();
            switch (opc) {
                case 1:
                    System.out.println("VAMOS A SUMAR");
                    System.out.println("DIGITE PRIMER NUMERO:");
                    numero1 = scanner.nextInt();
                    System.out.println("DIGITE EL SEGUNDO NUMERO:");
                    numero2 = scanner.nextInt();
                    int suma = numero1 + numero2;
                    System.out.println("la suma es:" + suma);
                    try {
                        Thread.sleep(time); // Espera antes de continuar
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                    break;
                case 2:
                    System.out.println("VAMOS A RESTAR");
                    System.out.println("DIGITE PRIMER NUMERO:");
                    numero1 = scanner.nextInt();
                    System.out.println("DIGITE EL SEGUNDO NUMERO:");
                    numero2 = scanner.nextInt();
                    int resta = numero1 - numero2;
                    System.out.println("la resta es:" + resta);
                    try {
                        Thread.sleep(time); // Espera antes de continuar
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                    break;
                case 3:
                    System.out.println("VAMOS A MULTIPLICAR");
                    System.out.println("DIGITE PRIMER NUMERO:");
                    numero1 = scanner.nextInt();
                    System.out.println("DIGITE EL SEGUNDO NUMERO:");
                    numero2 = scanner.nextInt();
                    int multi = numero1 * numero2;
                    System.out.println("la multiplicacion es:" + multi);
                    try {
                        Thread.sleep(time); // Espera antes de continuar
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                    break;
                case 4:
                    System.out.println("VAMOS A DIVIDIR");
                    System.out.println("DIGITE PRIMER NUMERO:");
                    numero1 = scanner.nextInt();
                    System.out.println("DIGITE EL SEGUNDO NUMERO:");
                    numero2 = scanner.nextInt();
                    float divi = 0;
                    if (numero1==0) {
                        System.out.println("NO SE PUEDE DIVIDIR POR CERO...:");
                        
                    } else {
                        divi = numero1 / numero2;
                    }
                    System.out.println(MessageFormat.format("la division es:{0}", divi));
                    try {
                        Thread.sleep(time); // Espera antes de continuar
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                    break;
                case 5:
                    System.out.println("FIN DEL PROGRAMA...");
                    try {
                        Thread.sleep(time); // Espera antes de continuar
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                default:
                    break;
            }

        }

    }
}
