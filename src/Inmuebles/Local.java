package Inmuebles;

public abstract class Local extends Inmuebles{
    public Local() {
    }

    public Local(int identificador, int area, String direccion, double precio) {
        super(identificador, area, direccion, precio);
    }

    public Local(int identificador, int area, String direccion) {
        super(identificador, area, direccion);
    }
}
