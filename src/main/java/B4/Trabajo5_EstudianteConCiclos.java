package B4;
import B3.Estudiante;
import java.util.Scanner;


public class Trabajo5_EstudianteConCiclos
{
    public static void main (String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        double sumatoriaDeNotas=0;
        Estudiante[] estudiantes = new Estudiante[3];

        /*Solicita ingreso de datos estudiante, crea instancia estudiante y luego
          la almacena en un arreglo de estudiantes haciendo uso de un ciclo for*/
        for(int i=0; i<estudiantes.length; i++)
        {
            System.out.println("\nIngrese nombre estudiante: ");
            String nombre = scanner.next();
            System.out.println("Ingrese nota estudiante: ");
            double nota = scanner.nextDouble();
            System.out.println("Ingrese número de telefono estudiante: ");
            String telefono = scanner.next();
            estudiantes[i] = new Estudiante(nombre, nota, telefono);
        }

        // Este for imprime la info de cada estudiante y realiza la sumatoria de las notas
        for(Estudiante estudiante : estudiantes)
        {
            estudiante.imprimirInformacion();
            sumatoriaDeNotas += estudiante.getNota();
        }

        // Imprime el promedio de las notas de los estudiantes
        System.out.println("El promedio en las notas de los estudiantes es: "
                + sumatoriaDeNotas/estudiantes.length);
    }
}
