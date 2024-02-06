package B3;
public class Estudiante {

    // Atributos
    private String nombre;
    private double nota;
    private String numeroTelefono;

    // Constructor
    public Estudiante (String nombre, double nota, String numeroTelefono){
        this.nombre = nombre;
        this.nota = nota;
        this.numeroTelefono = numeroTelefono;
    }

    // Metodos get
    public String getNombre(){
        return nombre;
    }
    public double getNota(){
        return nota;
    }
    public String getNumeroTelefono(){
        return numeroTelefono;
    }

    // Metodos set

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setNota(double nota){
        this.nota = nota;
    }
    public void setNumeroTelefono(String numeroTelefono){
        this.numeroTelefono = numeroTelefono;
    }
    public void imprimirInformacion(){
        System.out.println("Nombre: " + nombre);
        System.out.println("Nota: " + nota);
        System.out.print("Número de Telefono: " + numeroTelefono);
        System.out.println("\n");
    }
}
