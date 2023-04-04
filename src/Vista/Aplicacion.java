package Vista;// package que pertenece la clase


import Modelo.Calzado;
import Modelo.Producto;

public class Aplicacion { //define la estructura

    public static void main(String[] args) {
        //instancio un producto
        //Constructor
        Producto producto = new Producto();
        producto.stock = 100;
        producto.codigo = "123ABC";
        producto.valorBase = 10000;

        Calzado calzado = new Calzado();

        calzado.producto = producto;

        System.out.println("Codigo producto: "+ producto.codigo);
        System.out.println("Stock producto: "+ producto.stock);



    }
}
