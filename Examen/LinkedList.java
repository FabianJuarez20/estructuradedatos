public class LinkedList {
    Nodo head;

    // Metodo insertar nodo al inicio
    public void push(int newData) {
        Nodo newNodo = new Nodo(newData);
        newNodo.next = head;
        head = newNodo;
    }

    // Metodo imprimir lista
    public void imprimirLista() {
        Nodo temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    // Metodo para ordenar lista con recursividad
    /**
     * @param start
     */
    public void seleccionRecursiva(Nodo start) {
        if (start == null || start.next == null) {
            return;
        }

        // Encontrar nodo con valor mínimo
        Nodo minNodo = start;
        Nodo actual = start.next;
        while (actual != null) {
            if (actual.data < minNodo.data) {
                minNodo = actual;
            }
            actual = actual.next;
        }

        // Intercambiar los valores mínimos con el primero en la lista
        int temp = start.data;
        start.data = minNodo.data;
        minNodo.data = temp;

        // Llamada recursiva para ordenar la lista
        seleccionRecursiva(start.next);
    }

}
