package Modelo;

public class Mujer extends Formal{
    private int alturaTaco;

    public Mujer(String diaVenta, int numero, Producto producto, String color, int alturaTaco) {
        super(diaVenta, numero, producto, color);
        this.alturaTaco = alturaTaco;
    }

    public Mujer() {
      super();

    }

    public int getAlturaTaco() {
        return alturaTaco;
    }

    public void setAlturaTaco(int alturaTaco) {
        this.alturaTaco = alturaTaco;
    }
}
