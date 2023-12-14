
public class Main {
    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();

        //Datos predeterminados en lista
        linkedList.push(26);
        linkedList.push(54);
        linkedList.push(93);
        linkedList.push(17);
        linkedList.push(77);
        linkedList.push(31);
        linkedList.push(44);
        linkedList.push(55);
        linkedList.push(20);

        //Mostrar resultado de lista Original
        System.out.println("===============");
        System.out.println("Lista original:");
        System.out.println("---------------");
        linkedList.imprimirLista();
        System.out.println("===============");

        //Llamada del metodo recursivo
        linkedList.seleccionRecursiva(linkedList.head);

        //Mostrar resultado de lista Ordenada
        System.out.println("===============");
        System.out.println("Lista ordenada:");
        System.out.println("---------------");
        linkedList.imprimirLista();
        System.out.println("===============");
    }
}
