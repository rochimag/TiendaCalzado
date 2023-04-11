package Vista;// package que pertenece la clase


import Modelo.Deportivo;
import Modelo.Hombre;
import Modelo.Mujer;
import Modelo.Producto;

public class Aplicacion { //define la estructura

    public static void main(String[] args) {

        Deportivo deportivo = new Deportivo(new Producto("123ABC", 100, 10000), 44, "" + "semana", "futbol", "cuero");

        Deportivo deportivo2 = new Deportivo(new Producto("123ABC", 100, 10000), 44, "semana", "futbol", "cuero");

        Hombre hombre = new Hombre( "semana", 44, new Producto("123ABC", 100, 10000), "rojo");

        System.out.println(hombre.valorVenta());

        Mujer mujer = new Mujer("semana", 37, new Producto("123ABC", 100, 10000), "rojo", 5);

        System.out.println(mujer.valorVenta());

        System.out.println(deportivo.valorVenta());

        System.out.println(deportivo2.valorVenta());

        System.out.println("el valor venta del calzado deportivo durante la "+ deportivo.getDiaVenta() +
                " es: $" + deportivo.valorVenta());

    }
}
