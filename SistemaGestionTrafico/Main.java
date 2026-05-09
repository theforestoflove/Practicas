package SistemaGestionTrafico;

import java.util.LinkedList;
import java.util.Queue;

public class Main {

    public static void main(String[] args) {

        Queue<Paquete> cola = new LinkedList<>();

        cola.add(new Paquete("192.168.1.1", "8.8.8.8", 500));
        cola.add(new Paquete("192.168.1.2", "8.8.4.4", 300));
        cola.add(new Paquete("10.0.0.1", "1.1.1.1", 800));
        cola.add(new Paquete("172.16.0.1", "9.9.9.9", 200));
        cola.add(new Paquete("192.168.0.10", "208.67.222.222", 1000));

        System.out.println("=== PAQUETES ENCOLADOS ===");

        for (Paquete p : cola) {
            System.out.println(p);
        }

        HistorialIP historial = new HistorialIP();

        System.out.println("\n=== DESENCOLANDO PAQUETES ===");

        while (!cola.isEmpty()) {

            Paquete procesado = cola.poll();

            System.out.println("Procesando -> " + procesado);

            historial.agregar(procesado.ipOrigen);
        }


        historial.recorrerAdelante();
        historial.recorrerAtras();

        CacheSeguridad cache = new CacheSeguridad();

        cache.agregarIP("192.168.1.1");
        cache.agregarIP("8.8.8.8");
        cache.agregarIP("1.1.1.1");

        cache.mostrarIPs();

        String busqueda = "8.8.8.8";

        System.out.println("\nBuscando IP: " + busqueda);

        if (cache.esSegura(busqueda)) {
            System.out.println("La IP es SEGURA");
        } else {
            System.out.println("La IP NO es segura");
        }

        System.out.println("\n=== LIMPIEZA DE SEGURIDAD ===");

        cache.eliminarIPSegura("192.168.1.1", historial);

        System.out.println("\nHistorial actualizado:");

        historial.recorrerAdelante();
    }
}