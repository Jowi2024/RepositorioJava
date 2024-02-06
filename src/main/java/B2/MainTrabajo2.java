package B2;

public class MainTrabajo2 {

    public static void main(String[] args) {
        // Crear un objeto Celular
        Trabajo2Celular miCelular = new Trabajo2Celular("Samsung", "Galaxy S21",
                "Android", 128, 8,
                6.2, true, 4000, "Negro",
                true);

        // Mostrar información del celular
        miCelular.mostrarInformacion();

        // Realizar una llamada
        miCelular.llamar("3117491156");

        // Tomar una foto
        miCelular.tomarFoto();
    }
}
