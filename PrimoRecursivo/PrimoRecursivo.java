package PrimoRecursivo;

import java.util.Scanner;

public class PrimoRecursivo {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingresa un número: ");
        int n = sc.nextInt();

        if (esPrimo(n)) {
            System.out.println("Es primo");
        } else {
            System.out.println("No es primo");
        }

        sc.close();
    }

    public static boolean esPrimo(int n) {
        if (n <= 1) return false;
        return esPrimoRec(n, 2);
    }

    private static boolean esPrimoRec(int n, int divisor) {
        if (divisor * divisor > n) return true;
        if (n % divisor == 0) return false;
        return esPrimoRec(n, divisor + 1);
    }
}