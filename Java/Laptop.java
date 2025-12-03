package modelos;

public class Laptop extends Dispositivo {

    private int cantidadRam;

    public Laptop(String marca, String modelo, double precio, int cantidadRam) {
        super(marca, modelo, precio);
        this.cantidadRam = cantidadRam;
    }

    public int getCantidadRam() {
        return cantidadRam;
    }

    public void setCantidadRam(int cantidadRam) {
        this.cantidadRam = cantidadRam;
    }

    @Override
    public void conectarInternet() {
        System.out.println("- El dispositivo " + getMarca() + " " + getModelo() + ": Se ha conectado a internet vía Ethernet");
    }

    // Tarea 4: Sobrecarga
    public void diagnostico() {
        System.out.println("Diagnóstico: La laptop funciona correctamente.");
    }

    public void diagnostico(String detalle) {
        System.out.println("Diagnóstico avanzado: " + detalle);
    }

}
