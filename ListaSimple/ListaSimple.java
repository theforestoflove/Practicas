package ListaSimple;

class ListaSimple {
    
 Nodo cabeza;

    public ListaSimple() {
        cabeza = null;
    }

    public void mostrar() {
        mostrarRecursivo(cabeza);
        System.out.println();
    }

    private void mostrarRecursivo(Nodo nodo) {
        if (nodo == null) return;
        System.out.print(nodo.dato + " -> ");
        mostrarRecursivo(nodo.siguiente);
    }

    public void insertarFinal(int dato) {
        cabeza = insertarFinalRecursivo(cabeza, dato);
    }

    private Nodo insertarFinalRecursivo(Nodo nodo, int dato) {
        if (nodo == null) {
            return new Nodo(dato);
        }
        nodo.siguiente = insertarFinalRecursivo(nodo.siguiente, dato);
        return nodo;
    }

}
