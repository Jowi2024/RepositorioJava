package B2;

public class Trabajo3ValidacionNumeros
{

    //Atributos
    private int numeroEntero;

    //Constructor
    public Trabajo3ValidacionNumeros(int numeroEntero){
        this.numeroEntero = numeroEntero;
    }

    //Metodo para validar número
    public void validarNumero()
    {
        if (numeroEntero == 0)
        {
            System.out.println("El número es 0");
        } else if (numeroEntero > 0)
            {
                System.out.println("El número es positivo");
            } else if (numeroEntero < 0)
                {
                    System.out.println("El número es negativo");
                }
    }
}

