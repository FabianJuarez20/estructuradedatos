public class algoritmoInserccion {
    public static void main(String[] args) {
        int[] arreglo = { 5, 2, 9, 1, 5, 6 };
        int actual;
        int j;
        for (int i = 0; i < arreglo.length; i++) {
            actual = arreglo[i];
            for (j = i; j > 0 && arreglo[j - 1] > actual; j--) {
            arreglo[j] = arreglo[j - 1];
        }
        arreglo[j] = actual;
            System.out.println(actual);
            
        }
    }
}