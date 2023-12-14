public class Lista {
    Nodo raiz;// inicio del nodo
    Nodo aux;// actualiza el orden de los nodos
    Nodo actual;// ultimo dato guardado

    public void addNodo(String datos) {// agregar
        actual = new Nodo(datos);

        if (raiz == null) { // busca el primer campo vacio
            raiz = actual;
        } else {
            aux = raiz;
            while (aux.next != null) {
                aux = aux.next; // Asigna AUX al siguiente nodo
            }
            aux.next = actual; // asigna actual a valor vacio

        }
    }

    public void addFirst(String datos) { /* metodo pata agregar el nodo al principio */

        actual = new Nodo(datos);
        if (raiz != null) {
            actual.next = raiz;
            raiz = actual;
        } else {
            raiz = actual;
        }
    }

    public void addIN(String datos, int point) { /* Metodo para agregar un nodo en un punto(point) en la lista */

        actual = new Nodo(datos);

        if (raiz == null) {
            raiz = actual;
        } else {
            aux = raiz;
            for (int i = 1; i < point - 1; i++) {/* se recorre la lista hasta llegar el punto */
                if (aux.next == null) {
                    aux.next = actual;
                } else {
                    aux = aux.next;
                }
            }
            actual.next = aux.next;
            aux.next = actual;
        }
    }

    public void view() { /* metodo para VER la lista completa */
        aux = raiz;
        while (aux != null) {
            System.out.println(aux.getDatos());
            aux = aux.next;
        }

    }

    public void update(String datoMod, int point) {
        aux = raiz;
        for (int i = 1; i < point; i++) {/* se recorre la lista hasta llegar al punto */
            aux = aux.next;

        }
        aux.setDatos(datoMod);

    }

    public void delete(int point) {
        aux = raiz;
        actual = raiz.next;
        for (int i = 1; i < point - 1; i++) {/* se recorre la lista hasta llegar al punto */
            aux = actual;
            actual = actual.next;
        }
        aux.next = actual.next;
    }
}
