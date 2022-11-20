import java.util.Scanner;

public class Metodos
{
    public int menu ()
    {
        Scanner sc = new Scanner(System.in);
        int op = 0;
        do {
            System.out.println("\n ->->->->-> VEHICULOS <-<-<-<-<-");
            System.out.println(" ================================= ");
            System.out.println("|1. Ingresa datos                  |");
            System.out.println("|2. Visualizar datos               |");
            System.out.println("|0. Salir                          |");
            System.out.println(" ================================= ");
            System.out.print("Opcion: ");
            op = sc.nextInt();

        }while (op < 0 || op > 3);
        return op;
    }
    public void ingreso ()
    {
        Vehiculo v = new Vehiculo();
        Scanner sc = new Scanner(System.in);
        String marca1, marca2, marca3, marca4, marca5, modelo1, modelo2, modelo3, modelo4, modelo5, color1, color2,
        color3,color4,color5, valor1, valor2, valor3, valor4, valor5;
        System.out.println("Datos del primer vehiculo");
        System.out.println("\nIngrese la marca del primer vehiculo: ");
        marca1 = sc.next();
        System.out.println("Ingrese el modelo del primer vehiculo: ");
        modelo1 = sc.next();
        System.out.println("Ingrese el color del priemer vehiculo: ");
        color1 = sc.next();
        System.out.println("Ingrese el valor del primer vehiculo: ");
        valor1 = sc.next();
        System.out.println();
        Vehiculo a = new Vehiculo();
        System.out.println("Datos del segundo vehiculo");
        System.out.println("\nIngrese la marca del segundo vehiculo: ");
        marca2 = sc.next();
        System.out.println("Ingrese el modelo del segundo vehiculo: ");
        modelo2 = sc.next();
        System.out.println("Ingrese el color del segundo vehiculo: ");
        color2 = sc.next();
        System.out.println("Ingrese el valor del segundo vehiculo: " + a.getPrecioVehiculo());
        valor2 = sc.next();
        System.out.println();
        Vehiculo b = new Vehiculo();
        System.out.println("Datos del tercer vehiculo");
        System.out.println("\nIngrese la marca del tercer vehiculo: ");
        marca3 = sc.next();
        System.out.println("Ingrese el modelo del tercer vehiculo: " + b.getModeloVehiculo());
        modelo3 = sc.next();
        System.out.println("Ingrese el color del tercer vehiculo: " + b.getColorVehiculo());
        color3 = sc.next();
        System.out.println("Ingrese el valor del tercer vehiculo: " + b.getPrecioVehiculo());
        valor3 = sc.next();
        System.out.println();
        Vehiculo c = new Vehiculo();
        System.out.println("Datos del cuarto vehiculo");
        System.out.println("\nIngrese la marca del cuarto vehiculo: ");
        marca4 = sc.next();
        System.out.println("Ingrese el modelo del cuarto vehiculo: " + c.getModeloVehiculo());
        modelo4 = sc.next();
        System.out.println("Ingrese el color del cuarto vehiculo: " + c.getColorVehiculo());
        color4 = sc.next();
        System.out.println("Ingrese el valor del cuarto vehiculo: " + c.getPrecioVehiculo());
        valor4 = sc.next();
        System.out.println();
        Vehiculo d = new Vehiculo();
        System.out.println("Datos del quinto vehiculo");
        System.out.println("\nIngrese la marca del quinto vehiculo: " + d.getMarcaVehiculo());
        marca5 = sc.next();
        System.out.println("Ingrese el modelo del quinto vehiculo: " + d.getModeloVehiculo());
        modelo5 = sc.next();
        System.out.println("Ingrese el color del quinto vehiculo: " + d.getColorVehiculo());
        color5 = sc.next();
        System.out.println("Ingrese el valor del quinto vehiculo: " + d.getPrecioVehiculo());
        valor5 = sc.next();
    }
}
