package Vista;// package que pertenece la clase


import Modelo.Calzado;
import Modelo.Deportivo;
import Modelo.Producto;

public class Aplicacion { //define la estructura

    public static void main(String[] args) {

        Deportivo deportivo = new Deportivo(new Producto("123ABC", 100, 10000), 44, "semana", "futbol", "cuero");

        Deportivo deportivo2 = new Deportivo();




    }
}
