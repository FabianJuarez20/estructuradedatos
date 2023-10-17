public class Main {

        public static void main(String[] args) {
            int[] arreglo = {5, 2, 9, 1, 5, 6};

            System.out.println("Arreglo inicial:");
            imprimirArreglo(arreglo);

            ordenarBurbuja(arreglo);

            System.out.println("\nArreglo ordenado:");
            imprimirArreglo(arreglo);
        }

        public static void ordenarBurbuja(int[] arr) {
            int n = arr.length;
            boolean numintercambiado;

            do {
                numintercambiado = false;
                for (int i = 1; i < n; i++) {
                    if (arr[i - 1] > arr[i]) {
                        int temp = arr[i - 1];
                        arr[i - 1] = arr[i];
                        arr[i] = temp;
                        numintercambiado = true;
                    }
                }
            } while (numintercambiado);
        }

        public static void imprimirArreglo(int[] arr) {
            for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }
    }