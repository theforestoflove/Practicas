import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Cola cola = new Cola();

        int opcion;

        do {
            System.out.println("\n--- MENU COLA ---");
            System.out.println("1. Encolar");
            System.out.println("2. Desencolar");
            System.out.println("3. Peek");
            System.out.println("4. Mostrar");
            System.out.println("0. Salir");
            System.out.print("Opción: ");

            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese valor: ");
                    int valor = sc.nextInt();
                    cola.encolar(valor);
                    break;

                case 2:
                    int eliminado = cola.desencolar();
                    if (eliminado == -1)
                        System.out.println("Cola vacía");
                    else
                        System.out.println("Eliminado: " + eliminado);
                    break;

                case 3:
                    int frente = cola.peek();
                    if (frente == -1)
                        System.out.println("Cola vacía");
                    else
                        System.out.println("Frente: " + frente);
                    break;

                case 4:
                    cola.mostrar();
                    break;
            }

        } while (opcion != 0);

        sc.close();
    }
}