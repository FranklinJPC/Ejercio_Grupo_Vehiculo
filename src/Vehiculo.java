public class Vehiculo
{
    String marcaVehiculo;
    String modeloVehiculo;
    String colorVehiculo;
    double precioVehiculo;

    public  Vehiculo(){
        marcaVehiculo = "Toyota";
        modeloVehiculo = "Hilux";
        colorVehiculo = "Rojo";
        precioVehiculo = 49.990;
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

    public double getPrecioVehiculo() {
        return precioVehiculo;
    }

    public void setPrecioVehiculo(double precioVehiculo) {
        this.precioVehiculo = precioVehiculo;
    }

}
