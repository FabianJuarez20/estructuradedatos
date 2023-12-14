import java.util.Scanner;

public class MainPila {
    public static void main(String[] args) throws ArrayIndexOutOfBoundsException {
        try (Scanner t = new Scanner(System.in)) {
            Pila p = new Pila();
            int dato, opt;

            do {
                System.out.println("\n1.-Insertar \n2.-Extraer \n3.-Ver pila");
                opt = t.nextInt();
                switch (opt){
                    case 1:{
                        System.out.println("Dame edad");
                        dato = t.nextInt();
                        if (p.push(dato)) {
                            System.out.println(p.toString());
                        }
                        break;
                    }
                    case 2:{
                        if (p.pop()){
                            System.out.println("Elemento extraido: " + p.toString());;
                        }
                        break;
                    }
                    case 3:{
                        System.out.println(p.showPila());
                        break;
                    }
                }
            } while (opt != 0);
        }
    }
}
