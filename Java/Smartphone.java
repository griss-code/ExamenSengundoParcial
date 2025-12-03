package modelos;

public class Smartphone extends Dispositivo {

    private int numeroCamaras;

    public Smartphone(String marca, String modelo, double precio, int numeroCamaras) {
        super(marca, modelo, precio);
        this.numeroCamaras = numeroCamaras;
    }

    public int getNumeroCamaras() {
        return numeroCamaras;
    }

    public void setNumeroCamaras(int numeroCamaras) {
        this.numeroCamaras = numeroCamaras;
    }

    @Override
    public void conectarInternet() {
        System.out.println("- El dispositivo " + getMarca() + " " + getModelo() + ": Se ha conectado a la red 5G");
    }
}
