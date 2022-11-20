import java.util.Scanner;

public class Metodos
{
    Vehiculo vehi = new Vehiculo();
    public void algo ()
    {
        System.out.println("asdadasd");
    }
    public void ingresar_Arreglos(Vehiculo varVehi[])
    {
        Scanner scn = new Scanner(System.in);
        String marca;
        String color;
        String precio;
        String modelo;

        for (int i = 0; i < varVehi.length; i++)
        {
            System.out.println("Ingrese los siguietes campos del vehiculo " + (i+1) + "\n");
//            System.out.print("Ingrese la marca: ");
//            varVehi[i].marcaVehiculo = scn.next();
//            System.out.print("Ingrese el modelo: ");
//            varVehi[i].modeloVehiculo = scn.next();
//            System.out.print("Ingrese el color: ");
//            varVehi[i].colorVehiculo = scn.next();
//            System.out.print("Ingrese el precio: ");
//            varVehi[i].precioVehiculo = scn.next();
            System.out.print("Ingrese la marca: ");
            marca = scn.next();
            System.out.print("Ingrese el modelo: ");
            modelo = scn.next();
            System.out.print("Ingrese el color: ");
            color = scn.next();
            System.out.print("Ingrese el precio: ");
            precio = scn.next();
            varVehi[i] = new Vehiculo(marca, modelo, color, precio);
            System.out.println();
        }
    }
    public void ver_Datos(Vehiculo varVeni[])
    {
        for (int i = 0; i < varVeni.length; i++)
        {
            System.out.println("\t Vehiculo " + i);
            System.out.println("Color: " + varVeni[i].getColorVehiculo());
            System.out.println("Marca: " + varVeni[i].getMarcaVehiculo());
            System.out.println("Precio: " + varVeni[i].getPrecioVehiculo());
            System.out.println("Modelo: " + varVeni[i].getModeloVehiculo());
        }
    }
}
