import java.util.Scanner;

public class Metodos
{
    int menu (){
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
}
