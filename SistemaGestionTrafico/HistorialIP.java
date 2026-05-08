package SistemaGestionTrafico;

public class HistorialIP {

    private Nodo head;
    private Nodo tail;
    private int size;

    private final int LIMITE = 100;

    public void agregar(String ip) {

        Nodo nuevo = new Nodo(ip);

        if (head == null) {
            head = tail = nuevo;
        } else {
            tail.next = nuevo;
            nuevo.prev = tail;
            tail = nuevo;
        }

        size++;

        if (size > LIMITE) {
            eliminarAntiguo();
        }
    }

    private void eliminarAntiguo() {

        if (head != null) {
            head = head.next;

            if (head != null) {
                head.prev = null;
            }

            size--;
        }
    }

    public void recorrerAdelante() {

        System.out.println("\nHistorial (Antiguo -> Reciente)");

        Nodo actual = head;

        while (actual != null) {
            System.out.println(actual.ip);
            actual = actual.next;
        }
    }

    public void recorrerAtras() {

        System.out.println("\nHistorial (Reciente -> Antiguo)");

        Nodo actual = tail;

        while (actual != null) {
            System.out.println(actual.ip);
            actual = actual.prev;
        }
    }
}