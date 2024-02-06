package B1;

import java.util.Scanner;
public class Trabajo1Calculadora
{

    public static void main(String[] args)
    {
        // Crear un objeto Scanner para leer la entrada del teclado
        Scanner scanner = new Scanner(System.in);

        // Función de la aplicación
        System.out.println("Esta aplicación realiza las 4 operaciones fundamentales de una calculadora");

        // Solicita al usuario ingresar un número de 1-4 segun la operación que desee realizar
        System.out.println("1- SUMA\n2- RESTA \n3- MULTIPLICACIÓN \n4- DIVISION" +
                "\nIngrese el número correspondiente a la operación que desee realizar:");

        // Lee la entrada del usuario - operación
        int operacion = scanner.nextInt();

        // Solicita al usuario ingresar el primer número
        System.out.println("Ingrese 1er número de la operación a realizar: ");

        // Lee la entrada del usuario - 1er número
        int numeroA = scanner.nextInt();

        // Solicita al usuario ingresar el segundo número
        System.out.println("Ingrese 2do número de la operación a realizar: ");

        // Lee la entrada del usuario - 2do número
        int numeroB = scanner.nextInt();

        // Muestra la operación realizada segun los datos ingresados por el usuario
        switch (operacion)
        {
            case 1:
                System.out.println("Suma: " + (numeroA+numeroB));
                break;
            case 2:
                System.out.println("Resta: " + (numeroA-numeroB));
                break;
            case 3:
                System.out.println("Multiplicación: " + (numeroA*numeroB));
                break;
            case 4:
                System.out.println("Division: " + (numeroA/numeroB));
                break;
            default:
                System.out.println("La opción de operación ingresada no es valida, ¡vuelva a intentarlo!");
        }
        // Cerrar el Scanner
        scanner.close();
    }
}
