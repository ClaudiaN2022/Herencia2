import Inmuebles.Casa;
import Inmuebles.LocalComercial;

public class Main {
    public static void main(String[] args) {

   Casa c1 = new Casa(1,50,"Peña 25",2,1,1);
   LocalComercial l1 = new LocalComercial(1,20,"Peru 20",25.20,"Palmares");

   c1.imprimir();
   c1.calcularPrecio(20);
   l1.imprimir();
   l1.calcularPrecio(10);

    }
}