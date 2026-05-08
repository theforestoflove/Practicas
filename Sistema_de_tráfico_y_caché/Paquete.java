package Sistema_de_tráfico_y_caché;

public class Paquete {

    String ipOrigen;
    String ipDestino;
    int payload;

    public Paquete(String ipOrigen, String ipDestino, int payload) {
        this.ipOrigen = ipOrigen;
        this.ipDestino = ipDestino;
        this.payload = payload;
    }

    @Override
    public String toString() {
        return "Origen: " + ipOrigen +
               " | Destino: " + ipDestino +
               " | Payload: " + payload + " bytes";
    }
}
