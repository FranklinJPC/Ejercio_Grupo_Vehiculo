public class Main
{
    public static void main(String[] args)
    {
        Metodos metodos = new Metodos();
        Vehiculo varVehi[] = new Vehiculo[5];

        System.out.println("Hola mundo");
        metodos.algo();

        metodos.ingresar_Arreglos(varVehi);
        metodos.ver_Datos(varVehi);
    }
}
