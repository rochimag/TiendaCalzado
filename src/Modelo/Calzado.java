package Modelo;

public class Calzado {
    private String diaVenta; // semana finde
    private int numero; //44

    private Producto producto; // {"123ABC" ,100, 1000}

    public Calzado(String diaVenta, int numero, Producto producto) {
        super();
        this.diaVenta = diaVenta;
        this.numero = numero;
        this.producto = producto;
    }

    public Calzado() {
    }

    public String getDiaVenta() {
        return diaVenta;
    }

    public void setDiaVenta(String diaVenta) {
        this.diaVenta = diaVenta;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    public int valorVenta(){
        int valorVenta = 0;
        if(this.getDiaVenta().equalsIgnoreCase("Semana")){
          //-15%
            valorVenta = this.getProducto().getValorBase() - Math.round(this.getProducto().getValorBase()*15/100);
        }else if(this.getDiaVenta().equalsIgnoreCase("Fin de semana")){
          //+24%
            valorVenta = (int) (this.getProducto().getValorBase() + Math.round(this.getProducto().getValorBase()*0.24));
        }
        return valorVenta;
    }

    public int impuestoIVA(){
        return 0;
    }
}


