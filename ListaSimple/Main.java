package ListaSimple;

class Main {
   
public static void main(String[] args) {
        ListaSimple lista = new ListaSimple();

        lista.insertarFinal(10);
        lista.insertarFinal(20);
        lista.insertarFinal(30);
        lista.insertarFinal(40);

        System.out.println("Elementos de la lista:");
        lista.mostrar();
    }   

}
