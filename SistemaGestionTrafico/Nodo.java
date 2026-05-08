package SistemaGestionTrafico;

public class Nodo {

    String ip;
    Nodo next;
    Nodo prev;

    public Nodo(String ip) {
        this.ip = ip;
    }
}