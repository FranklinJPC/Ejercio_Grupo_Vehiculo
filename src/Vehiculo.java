public class Vehiculo
{
    String marcaVehiculo;
    String modeloVehiculo;
    String colorVehiculo;
    String precioVehiculo;

    public Vehiculo(){
        marcaVehiculo="Toyota";
        modeloVehiculo="Hilux";
        colorVehiculo="Rojo";
        precioVehiculo="$49.990";
    }

    public String getMarcaVehiculo() {
        return marcaVehiculo;
    }

    public void setMarcaVehiculo(String marcaVehiculo) {
        this.marcaVehiculo = marcaVehiculo;
    }

    public String getModeloVehiculo() {
        return modeloVehiculo;
    }

    public void setModeloVehiculo(String modeloVehiculo) {
        this.modeloVehiculo = modeloVehiculo;
    }

    public String getColorVehiculo() {
        return colorVehiculo;
    }

    public void setColorVehiculo(String colorVehiculo) {
        this.colorVehiculo = colorVehiculo;
    }

    public String getPrecioVehiculo() {
        return precioVehiculo;
    }

    public void setPrecioVehiculo(String precioVehiculo) {
        this.precioVehiculo = precioVehiculo;
    }
    public void Visualizar(){
        System.out.println("\t<<-- Caracteristicas del Vehiculo -->>");
        System.out.println();
        System.out.println("-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/");
        System.out.println("-<-<-<-<-<-<-<-< V E I H C U L O 1 -<-<-<-<-<-<-<-<-<-<");
        System.out.println("|\tMarca del Vehiculo:  "+getMarcaVehiculo()+"                |");
        System.out.println("|\tModelo del Vehiculo: "+getModeloVehiculo()+"                 |");
        System.out.println("|\tColor del Vehiculo:  "+getColorVehiculo()+"                  |");
        System.out.println("|\tPrecio del Vehiculo: "+getPrecioVehiculo()+"               |");
        System.out.println("-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/");
        System.out.println();
        System.out.println("-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/");
        System.out.println("-<-<-<-<-<-<-<-< V E I H C U L O 2 -<-<-<-<-<-<-<-<-<-<");
        System.out.println("|\tMarca del Vehiculo:  "+getMarcaVehiculo()+"                |");
        System.out.println("|\tModelo del Vehiculo: "+getModeloVehiculo()+"                 |");
        System.out.println("|\tColor del Vehiculo:  "+getColorVehiculo()+"                  |");
        System.out.println("|\tPrecio del Vehiculo: "+getPrecioVehiculo()+"               |");
        System.out.println("-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/");
        System.out.println();
        System.out.println("-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/");
        System.out.println("-<-<-<-<-<-<-<-< V E I H C U L O 3 -<-<-<-<-<-<-<-<-<-<");
        System.out.println("|\tMarca del Vehiculo:  "+getMarcaVehiculo()+"                |");
        System.out.println("|\tModelo del Vehiculo: "+getModeloVehiculo()+"                 |");
        System.out.println("|\tColor del Vehiculo:  "+getColorVehiculo()+"                  |");
        System.out.println("|\tPrecio del Vehiculo: "+getPrecioVehiculo()+"               |");
        System.out.println("-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/");
        System.out.println();
        System.out.println("-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/");
        System.out.println("-<-<-<-<-<-<-<-< V E I H C U L O 4 -<-<-<-<-<-<-<-<-<-<");
        System.out.println("|\tMarca del Vehiculo:  "+getMarcaVehiculo()+"                |");
        System.out.println("|\tModelo del Vehiculo: "+getModeloVehiculo()+"                 |");
        System.out.println("|\tColor del Vehiculo:  "+getColorVehiculo()+"                  |");
        System.out.println("|\tPrecio del Vehiculo: "+getPrecioVehiculo()+"               |");
        System.out.println("-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/");
        System.out.println();
        System.out.println("-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/");
        System.out.println("-<-<-<-<-<-<-<-< V E I H C U L O 5 -<-<-<-<-<-<-<-<-<-<");
        System.out.println("|\tMarca del Vehiculo:  "+getMarcaVehiculo()+"                |");
        System.out.println("|\tModelo del Vehiculo: "+getModeloVehiculo()+"                 |");
        System.out.println("|\tColor del Vehiculo:  "+getColorVehiculo()+"                  |");
        System.out.println("|\tPrecio del Vehiculo: "+getPrecioVehiculo()+"               |");
        System.out.println("-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/");
    }
}
