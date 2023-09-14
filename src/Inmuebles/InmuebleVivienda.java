package Inmuebles;

public abstract class InmuebleVivienda extends Inmuebles{

    protected int numerodeHabitaciones;
    protected int numeroBaños;

    public InmuebleVivienda() {
    }

    public InmuebleVivienda(int identificador, int area, String direccion, int numerodeHabitaciones, int numeroBaños) {
        super(identificador, area, direccion);
        this.numerodeHabitaciones = numerodeHabitaciones;
        this.numeroBaños = numeroBaños;
    }
}
