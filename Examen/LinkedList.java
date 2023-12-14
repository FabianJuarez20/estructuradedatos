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
    public void seleccionRecursiva(Nodo start) {
        if (start == null || start.next == null) {
            return;
        }

        // Encontrar nodo con valor maximo
        Nodo maxNodo = start;
        Nodo actual = start.next;
        while (actual != null) {
            if (actual.data < maxNodo.data) {
                maxNodo = actual;
            }
            actual = actual.next;
        }

        // Intercambiar los valores maximo con primero en lista
        int temp = start.data;
        start.data = maxNodo.data;
        maxNodo.data = temp;

        // Llamada recursiva para ordenar lista
        seleccionRecursiva(start.next);
    }
}
