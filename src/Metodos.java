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
    public void ingreso (Vehiculo a, Vehiculo b, Vehiculo c, Vehiculo d, Vehiculo e)
    {
        Scanner sc = new Scanner(System.in);
        String marca1, marca2, marca3, marca4, marca5, modelo1, modelo2, modelo3, modelo4, modelo5, color1, color2,
        color3,color4,color5;
        double valor1, valor2, valor3, valor4, valor5;
        System.out.println("Datos del primer vehiculo");
        System.out.print("\nIngrese la marca del primer vehiculo: ");
        marca1 = sc.next();
        a.setMarcaVehiculo(marca1);
        System.out.print("Ingrese el modelo del primer vehiculo: ");
        modelo1 = sc.next();
        a.setModeloVehiculo(modelo1);
        System.out.print("Ingrese el color del priemer vehiculo: ");
        color1 = sc.next();
        a.setColorVehiculo(color1);
        System.out.print("Ingrese el valor del primer vehiculo: ");
        valor1 = sc.nextDouble();
        a.setPrecioVehiculo(valor1);
        System.out.println();

        System.out.println("Datos del segundo vehiculo");
        System.out.print("\nIngrese la marca del segundo vehiculo: ");
        marca2 = sc.next();
        b.setMarcaVehiculo(marca2);
        System.out.print("Ingrese el modelo del segundo vehiculo: ");
        modelo2 = sc.next();
        b.setModeloVehiculo(modelo2);
        System.out.print("Ingrese el color del segundo vehiculo: ");
        color2 = sc.next();
        b.setColorVehiculo(color2);
        System.out.print("Ingrese el valor del segundo vehiculo: ");
        valor2 = sc.nextDouble();
        b.setPrecioVehiculo(valor2);
        System.out.println();

        System.out.println("Datos del tercer vehiculo");
        System.out.print("\nIngrese la marca del tercer vehiculo: ");
        marca3 = sc.next();
        c.setMarcaVehiculo(marca3);
        System.out.print("Ingrese el modelo del tercer vehiculo: ");
        modelo3 = sc.next();
        c.setModeloVehiculo(modelo3);
        System.out.print("Ingrese el color del tercer vehiculo: ");
        color3 = sc.next();
        c.setColorVehiculo(color3);
        System.out.print("Ingrese el valor del tercer vehiculo: ");
        valor3 = sc.nextDouble();
        c.setPrecioVehiculo(valor3);
        System.out.println();

        System.out.println("Datos del cuarto vehiculo");
        System.out.print("\nIngrese la marca del cuarto vehiculo: ");
        marca4 = sc.next();
        d.setMarcaVehiculo(marca4);
        System.out.print("Ingrese el modelo del cuarto vehiculo: ");
        modelo4 = sc.next();
        d.setModeloVehiculo(modelo4);
        System.out.print("Ingrese el color del cuarto vehiculo: ");
        color4 = sc.next();
        d.setColorVehiculo(color4);
        System.out.print("Ingrese el valor del cuarto vehiculo: ");
        valor4 = sc.nextDouble();
        d.setPrecioVehiculo(valor4);
        System.out.println();

        System.out.println("Datos del quinto vehiculo");
        System.out.print("\nIngrese la marca del quinto vehiculo: ");
        marca5 = sc.next();
        e.setMarcaVehiculo(marca5);
        System.out.print("Ingrese el modelo del quinto vehiculo: ");
        modelo5 = sc.next();
        e.setModeloVehiculo(modelo5);
        System.out.print("Ingrese el color del quinto vehiculo: ");
        color5 = sc.next();
        e.setColorVehiculo(color5);
        System.out.print("Ingrese el valor del quinto vehiculo: ");
        valor5 = sc.nextDouble();
        e.setPrecioVehiculo(valor5);

    }
    public void Visualizar(Vehiculo a, Vehiculo b, Vehiculo c, Vehiculo d, Vehiculo e){
        System.out.println("\t<<-- Caracteristicas del Vehiculo -->>");
        System.out.println();
        System.out.println("-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/");
        System.out.println("-<-<-<-<-<-<-<-< V E I H C U L O 1 -<-<-<-<-<-<-<-<-<-<");
        System.out.println("|\tMarca del Vehiculo:  "+a.getMarcaVehiculo()+"                |");
        System.out.println("|\tModelo del Vehiculo: "+a.getModeloVehiculo()+"                 |");
        System.out.println("|\tColor del Vehiculo:  "+a.getColorVehiculo()+"                  |");
        System.out.println("|\tPrecio del Vehiculo: "+a.getPrecioVehiculo()+"$               |");
        System.out.println("-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/");
        System.out.println();
        System.out.println("-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/");
        System.out.println("-<-<-<-<-<-<-<-< V E I H C U L O 2 -<-<-<-<-<-<-<-<-<-<");
        System.out.println("|\tMarca del Vehiculo:  "+b.getMarcaVehiculo()+"                |");
        System.out.println("|\tModelo del Vehiculo: "+b.getModeloVehiculo()+"                 |");
        System.out.println("|\tColor del Vehiculo:  "+b.getColorVehiculo()+"                  |");
        System.out.println("|\tPrecio del Vehiculo: "+b.getPrecioVehiculo()+"$               |");
        System.out.println("-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/");
        System.out.println();
        System.out.println("-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/");
        System.out.println("-<-<-<-<-<-<-<-< V E I H C U L O 3 -<-<-<-<-<-<-<-<-<-<");
        System.out.println("|\tMarca del Vehiculo:  "+c.getMarcaVehiculo()+"                |");
        System.out.println("|\tModelo del Vehiculo: "+c.getModeloVehiculo()+"                 |");
        System.out.println("|\tColor del Vehiculo:  "+c.getColorVehiculo()+"                  |");
        System.out.println("|\tPrecio del Vehiculo: "+c.getPrecioVehiculo()+"$               |");
        System.out.println("-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/");
        System.out.println();
        System.out.println("-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/");
        System.out.println("-<-<-<-<-<-<-<-< V E I H C U L O 4 -<-<-<-<-<-<-<-<-<-<");
        System.out.println("|\tMarca del Vehiculo:  "+d.getMarcaVehiculo()+"                |");
        System.out.println("|\tModelo del Vehiculo: "+d.getModeloVehiculo()+"                 |");
        System.out.println("|\tColor del Vehiculo:  "+d.getColorVehiculo()+"                  |");
        System.out.println("|\tPrecio del Vehiculo: "+d.getPrecioVehiculo()+"$               |");
        System.out.println("-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/");
        System.out.println();
        System.out.println("-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/");
        System.out.println("-<-<-<-<-<-<-<-< V E I H C U L O 5 -<-<-<-<-<-<-<-<-<-<");
        System.out.println("|\tMarca del Vehiculo:  "+e.getMarcaVehiculo()+"                |");
        System.out.println("|\tModelo del Vehiculo: "+e.getModeloVehiculo()+"                 |");
        System.out.println("|\tColor del Vehiculo:  "+e.getColorVehiculo()+"                  |");
        System.out.println("|\tPrecio del Vehiculo: "+e.getPrecioVehiculo()+"$               |");
        System.out.println("-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/");
    }
}
