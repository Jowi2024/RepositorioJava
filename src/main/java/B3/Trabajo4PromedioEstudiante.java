package B3;

public class Trabajo4PromedioEstudiante
{

    public static void main(String[] args)
    {
        double sumatoriaDeNotas=0;

        // Se crean las instancias de los estudiantes
        Estudiante[] estudiantes = new Estudiante[5];
        estudiantes[0] = new Estudiante("Juan", 3.5, "3117491156");
        estudiantes[1] = new Estudiante("Mauricio", 4.5, "3145320972");
        estudiantes[2] = new Estudiante("Natalia", 5, "3145320408");
        estudiantes[3] = new Estudiante("Catalina", 3.2, "3145323014");
        estudiantes[4] = new Estudiante("Miguel", 4.0, "3145320132");

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
