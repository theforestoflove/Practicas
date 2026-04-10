import java.util.LinkedList;
import java.util.Queue;

public class Cola {
    private Queue<Integer> cola;

    public Cola() {
        cola = new LinkedList<>();
    }

    public void encolar(int valor) {
        cola.add(valor);
    }

    public int desencolar() {
        if (cola.isEmpty()) {
            return -1;
        }
        return cola.poll();
    }

    public int peek() {
        if (cola.isEmpty()) {
            return -1;
        }
        return cola.peek();
    }

    public void mostrar() {
        System.out.println(cola);
    }

    public boolean estaVacia() {
        return cola.isEmpty();
    }
}