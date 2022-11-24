public class Main
{
    public static void main(String[] args)
    {
        int op;
        Metodos menu = new Metodos();
        Vehiculo a = new Vehiculo();
        Vehiculo b = new Vehiculo();
        Vehiculo c = new Vehiculo();
        Vehiculo d = new Vehiculo();
        Vehiculo e = new Vehiculo();

        do{
            op = menu.menu();
            switch(op){
                case 1:
                    System.out.println("Ingrese los datos del vehiculo");
                    menu.ingreso(a, b, c ,d ,e);
                    break;
                case 2:
                    System.out.println("Los datos del vehiculo");
                    menu.Visualizar(a, b, c ,d ,e);
                    break;
            }
        }while (op != 0);
    }
}
