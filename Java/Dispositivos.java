package modelos;

public abstract class Dispositivo {

    private String marca;
    private String modelo;
    private double precio;

    public Dispositivo(String marca, String modelo, double precio) {
        this.marca = marca;
        this.modelo = modelo;
        this.precio = precio;
    }

    // Encapsulamiento (GET y SET)
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    // Método concreto
    public void encender() {
        System.out.println("- Encendiendo dispositivo: " + marca + " " + modelo + " (Precio:$" + precio + ")");
    }

    // Método abstracto
    public abstract void conectarInternet();
}

