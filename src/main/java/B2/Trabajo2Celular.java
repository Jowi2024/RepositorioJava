package B2;

public class Trabajo2Celular {

    // Atributos
    private String marca;
    private String modelo;
    private String sistemaOperativo;
    private int capacidadAlmacenamiento;
    private int memoriaRAM;
    private double tamanoPantalla;
    private boolean tieneCamara;
    private int bateriaCapacidad;
    private String color;
    private boolean estaEncendido;

    // Constructor
    public Trabajo2Celular(String marca, String modelo, String sistemaOperativo,
                           int capacidadAlmacenamiento, int memoriaRAM, double tamanoPantalla,
                           boolean tieneCamara, int bateriaCapacidad, String color,
                           boolean estaEncendido)
    {
        this.marca = marca;
        this.modelo = modelo;
        this.sistemaOperativo = sistemaOperativo;
        this.capacidadAlmacenamiento = capacidadAlmacenamiento;
        this.memoriaRAM = memoriaRAM;
        this.tamanoPantalla = tamanoPantalla;
        this.tieneCamara = tieneCamara;
        this.bateriaCapacidad = bateriaCapacidad;
        this.color = color;
        this.estaEncendido = estaEncendido;
    }

    // Métodos Getter y Setter para el atributo "estaEncendido"
    public boolean getEstaEncendido() {
        return estaEncendido;
    }

    public void setEstaEncendido(boolean estaEncendido) {
        this.estaEncendido = estaEncendido;
    }

    // Otros métodos
    public void llamar(String numero) {
        System.out.println("Llamando al número: " + numero);
    }

    public void tomarFoto() {
        if (tieneCamara) {
            System.out.println("Tomando una foto...");
        } else {
            System.out.println("El celular no tiene cámara.");
        }
    }

    public void mostrarInformacion() {
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Sistema Operativo: " + sistemaOperativo);
        System.out.println("Capacidad de Almacenamiento: " + capacidadAlmacenamiento + " GB");
        System.out.println("Memoria RAM: " + memoriaRAM + " GB");
        System.out.println("Tamaño de Pantalla: " + tamanoPantalla + " pulgadas");
        System.out.println("Tiene Cámara: " + (tieneCamara ? "Sí" : "No"));
        System.out.println("Capacidad de Batería: " + bateriaCapacidad + " mAh");
        System.out.println("Color: " + color);
        System.out.println("Está Encendido: " + (estaEncendido ? "Sí" : "No"));
    }

}
