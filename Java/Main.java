package main;

import modelos.Dispositivo;
import modelos.Laptop;
import modelos.Smartphone;

import java.util.ArrayList;
import java.util.List;

public class Main {

    // Método con sobrecarga
    public static void mostrarInfo(Dispositivo d) {
        System.out.println("Mostrando información general de un dispositivo...");
    }

    public static void mostrarInfo(String mensaje) {
        System.out.println("Mensaje: " + mensaje);
    }

    public static void main(String[] args) {

        System.out.println("-----SISTEMA TECHMASTER-----");

        List<Dispositivo> inventario = new ArrayList<>();

        // Objetos
        Laptop laptop = new Laptop("Asus", "Vivobook", 17000.00, 16);
        Smartphone phone = new Smartphone("Samsung", "Galaxy S56", 7000.99, 4);

        inventario.add(laptop);
        inventario.add(phone);

        for (Dispositivo d : inventario) {

            if (d instanceof Laptop) {
                System.out.println("El objeto es una Laptop");
                d.encender();
                System.out.println("- Especificaciones: " + ((Laptop) d).getCantidadRam() + " GB de RAM");
                d.conectarInternet();
                System.out.println();
            }

            if (d instanceof Smartphone) {
                System.out.println("El objeto es un Smartphone");
                d.encender();
                System.out.println("- Especificaciones: " + ((Smartphone) d).getNumeroCamaras() + " Cámaras");
                d.conectarInternet();
                System.out.println();
            }
        }

        // Demostración de que la sobrecarga se implementa bien
        mostrarInfo("Inventario cargado correctamente.");
        mostrarInfo(laptop);

        // PRUEBA DE SOBRECARGA para la laptop
        System.out.println("---------------------------------------------------");
        System.out.println("PRUEBA DE LOGICA DE SOBRECARGA (lógica propia)");

        // Caso A: Método 1
        System.out.println("- Caso A: (Método 1)");
        laptop.diagnostico();

        // Caso B: Método 2
        System.out.println("- Caso B: (Método 2)");
        laptop.diagnostico("Temperatura del equipo es normal.");

    }

}


