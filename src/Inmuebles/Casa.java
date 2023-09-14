package Inmuebles;

public class Casa extends InmuebleVivienda{
    private int numerodePiso;

    public Casa(int identificador, int area, String direccion, int numerodeHabitaciones, int numeroBaños, int numerodePiso) {
        super(identificador, area, direccion, numerodeHabitaciones, numeroBaños);
        this.numerodePiso = numerodePiso;
    }

    public int getNumerodePiso() {
        return numerodePiso;
    }

    public void setNumerodePiso(int numerodePiso) {
        this.numerodePiso = numerodePiso;
    }

    @Override
    public double calcularPrecio(int area) {
        System.out.println("Estoy calculando el precio de la casa");
        return 0;
    }

    @Override
    public void imprimir() {
        System.out.println(" Soy un inmueble tipo casa");
    }
}
