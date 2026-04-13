package QuickSort;
public class Main {

    public static void main(String[] args) {

        int[] arr = {10, 7, 8, 9, 1, 5};

        QuickSort qs = new QuickSort();

        System.out.println("Arreglo original:");
        printArray(arr);

        qs.sort(arr);

        System.out.println("Arreglo ordenado:");
        printArray(arr);
    }

    public static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}