package Inmuebles;

public abstract class Inmuebles {

    protected int identificador;
    protected int area ;
    protected String direccion;
    protected double precio;

    public Inmuebles() {
    }

    public Inmuebles(int identificador, int area, String direccion, double precio) {
        this.identificador = identificador;
        this.area = area;
        this.direccion = direccion;
        this.precio = precio;
    }

    public Inmuebles(int identificador, int area, String direccion) {
        this.identificador = identificador;
        this.area = area;
        this.direccion = direccion;
    }
    public abstract double calcularPrecio(int area);
    public abstract void imprimir();

}
