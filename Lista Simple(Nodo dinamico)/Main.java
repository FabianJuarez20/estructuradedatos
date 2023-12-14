import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        Lista lista = new Lista(); // creacion de objeto lista
        Scanner t = new Scanner(System.in);

        String datos = "";
        int opc = 0;
        int point = 0;
        do {
            System.out.println("1.- agregar articulo"); /* Menu usando numeros */
            System.out.println("2.- agregar articulo al principio");
            System.out.println("3.- agregar articulo en una pocision");
            System.out.println("4.- ver todos los datos");
            System.out.println("5.- modificar un dato en una posicion");
            System.out.println("6.- eliminar un dato en una pociocion");
            System.out.println("0.-SALIR");
            System.out.print("elije opcion:");
            opc = t.nextInt();
            
            if (!datos.equals("salir")) {

                switch (opc) {
                    case 1: {

                        System.out.println("ingrese articulo");
                        t.nextLine();
                        datos = t.nextLine();
                        lista.addNodo(datos); // metodo para crear nodos
                        break;
                    }
                    case 2: {

                        System.out.println("ingrese articulo");
                        t.nextLine();
                        datos = t.nextLine();
                        lista.addFirst(datos); // metodo para crear nodos al principio
                        break;
                    }
                    case 3: {
                        System.out.println("ingrese articulo");
                        t.nextLine();
                        datos = t.nextLine();
                        System.out.print("en la pocicion:");
                        point = t.nextInt();
                        lista.addIN(datos, point); /* metodo para crear nodos en un punto(point) */
                        break;
                    }
                    case 4:{
                        lista.view();
                        break;
                    }
                    case 5:{
                        System.out.println("ingrese articulo");
                        t.nextLine();
                        datos = t.nextLine();
                        System.out.print("en la pocicion:");
                        point = t.nextInt();
                        lista.update(datos, point); /* metodo para modificar nodos en un punto(point) */
                        break;
                    }
                    case 6:{
                        System.out.print("la pocicion:");
                        t.nextLine();
                        point = t.nextInt();
                        lista.delete(point);
                        break;
                    }
                    case 0:{
                        System.out.println("si esta sueguro teclee salir:");
                        datos = t.nextLine();
                        break;
                    }

                }
            }

        } while (!datos.equals("salir"));
    }

}