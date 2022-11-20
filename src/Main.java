public class Main
{
    public static void main(String[] args)
    {
        int op;
        Metodos menu = new Metodos();
        do{
            op = menu.menu();
            switch(op){
                case 1:
                    System.out.println("Ingrese los datos del vehiculo");
                    break;
                case 2:
                    System.out.println("Los datos del vehiculo");
                    break;
            }
        }while (op != 0);


    }
}
