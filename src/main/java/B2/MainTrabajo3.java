package B2;

import java.util.Scanner;

public class MainTrabajo3
{

    public static void main (String[] args)
    {
        // Crear un objeto Scanner para leer la entrada del teclado
        Scanner scanner = new Scanner(System.in);

        // Función de la aplicación
        System.out.println("Esta aplicación valida si un número es positivo, negativo o cero");

        // Solicita al usuario ingresar el número a validar
        System.out.println("Ingrese un número entero:");

        // Lee la entrada del usuario - número
        int numeroEntero = scanner.nextInt();

        // Crea una instancia de la clase Trabajo3ValidaciónNumeros
        Trabajo3ValidacionNumeros miNumero = new Trabajo3ValidacionNumeros(numeroEntero);

        // Se hace un llamamiento al metodo que valida los número
        miNumero.validarNumero();
    }
}
