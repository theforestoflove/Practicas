package SistemaGestionTrafico;

import java.util.HashMap;

public class CacheSeguridad {

    private HashMap<String, Boolean> ipsSeguras;

    public CacheSeguridad() {
        ipsSeguras = new HashMap<>();
    }

    public void agregarIP(String ip) {
        ipsSeguras.put(ip, true);
    }

    public boolean esSegura(String ip) {
        return ipsSeguras.containsKey(ip);
    }

    public void mostrarIPs() {

        System.out.println("\n=== IPS SEGURAS ===");

        for (String ip : ipsSeguras.keySet()) {
            System.out.println(ip);
        }
    }

    public void eliminarIPSegura(String ip, HistorialIP historial) {

        if (ipsSeguras.containsKey(ip)) {

            ipsSeguras.remove(ip);

            System.out.println("\nIP eliminada de cache: " + ip);

            historial.eliminarIP(ip);

        } else {
            System.out.println("\nLa IP no existe en cache");
        }
    }
}