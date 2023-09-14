package Inmuebles;

public class LocalComercial extends Local{

    private double valorArea;
    private String centroComercial;

    public LocalComercial(int identificador, int area, String direccion, double valorArea, String centroComercial) {
        super(identificador, area, direccion);
        this.valorArea = valorArea;
        this.centroComercial = centroComercial;
    }

    public double getValorArea() {
        return valorArea;
    }

    public void setValorArea(double valorArea) {
        this.valorArea = valorArea;
    }

    public String getCentroComercial() {
        return centroComercial;
    }

    public void setCentroComercial(String centroComercial) {
        this.centroComercial = centroComercial;
    }

    @Override
    public double calcularPrecio(int area) {
        return 0;
    }

    @Override
    public void imprimir() {
        System.out.println("Soy un local comercial");
    }
}
