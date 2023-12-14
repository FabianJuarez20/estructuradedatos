import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ferreteria[] pb = new ferreteria[1000];
        pb[21]= new ferreteria("Pala", "Truper", 01,"rojo", 200, "Pala corta");
        try (Scanner t = new Scanner(System.in)) {
            int opt;
            do {
                System.out.println("REGISTRO DE HERRAMIENTAS DE LA FERRETERIA" + "\n1.-Registrar herramientas" +
                        "\n2.-Ver Herramientas" + "\n3.-Buscar Herramienta" + "\n4.-Eliminar Herramienta" + "\n5.-Actualizar Herramienta");
                opt = t.nextInt();
                switch (opt) {
                    case 1: {
                        if (registerHerramientas(pb)) {
                            System.out.println("Herramienta registrado");
                        } else {
                            System.out.println("No se pudo registrar");
                        }
                        break;
                    }
                    case 2: {
                        listHerramientas(pb);
                        break;
                    }
                    case 3: {
                        String nombre, caracteristica;
                        t.nextLine();
                        System.out.print("Nombre: ");
                        nombre = t.nextLine();
                        System.out.print("Caracteristica: ");
                        caracteristica = t.nextLine();
                        getHerramienta(nombre, caracteristica, pb);
                        break;
                    }
                    case 4: {
                        String nombre, caracteristica;
                        t.nextLine();
                        System.out.print("Nombre: ");
                        nombre = t.nextLine();
                        System.out.print("Caracteristica: ");
                        caracteristica = t.nextLine();
                        if (deleteHerramienta(nombre, caracteristica, pb)) {
                            System.out.println("Herramienta eliminado");
                        }
                        break;
                    }
                    case 5: {
                        String nombre, caracteristica;
                        t.nextLine();
                        System.out.print("Nombre: ");
                        nombre = t.nextLine();
                        System.out.print("Caracteristica: ");
                        caracteristica = t.nextLine();
                        if(upadteHerramienta(nombre, caracteristica, pb)){
                            System.out.println("Herramienta actulizada");
                        }
                        break;
                    }
                }
            } while (opt != 6);
        }
    }

    /*
    Create
     */
    public static boolean registerHerramientas(ferreteria[]pb) {
        try (Scanner t = new Scanner(System.in)) {
            String nombre, marca,color, caracteristica;
            double id;
            int precio;
            System.out.print("Nombre: "); nombre = t.nextLine();
            System.out.print("Marca: "); marca = t.nextLine();
            System.out.print("ID: "); id = t.nextDouble();
            t.nextLine();
            System.out.print("Color: "); color = t.nextLine();
            System.out.print("Precio: "); precio = t.nextInt();
            t.nextLine();
            System.out.print("Caracteristicas: "); caracteristica = t.nextLine();
            int i = 0;
            do {
                if (pb[i] == null) {
                    pb[i] = new ferreteria(nombre, marca, id, color, precio, caracteristica);
                    return true;
                }
                i++;
            } while (i < pb.length);
        }
        return false;
    }
    /*
   Read
    */
    public static void listHerramientas(ferreteria[] pb){
        int i=0;
        do {
            if (pb[i] != null){
                System.out.println(pb[i]+ " ");
            }
            i++;
        }while (i<pb.length);
    }
    /*
   Search player
    */
    public static int getHerramienta (String nombre, String caracteristica, ferreteria[]pb){
        try {
            for (int i = 0; i < pb.length; i++) {
                if (pb[i] != null) {
                    if (pb[i].nombre.equals(nombre)) {
                        if (pb[i].caracteristica.equals(caracteristica)) {
                            System.out.println(pb[i] + " ");
                            return i;
                        }
                    }
                }
            }
        }catch (NullPointerException e){
            System.out.println("Herramienta no encontrada");
        }
        return -1;
    }
    /*
    Delete
     */
    public static boolean deleteHerramienta(String nombre, String caracteristica, ferreteria[]pb){
        try {
            for (int i = 0; i < pb.length; i++) {
                if (pb[i] != null) {
                    if (pb[i].nombre.equals(nombre)) {
                        if (pb[i].caracteristica.equals(caracteristica)) {
                            pb[i] = null;
                            return true;
                        }
                    }
                }
            }
        }catch (NullPointerException e){
            System.out.println("No se pudo eliminar");
        }
        return false;
    }
    /*
   Update
    */
    public static boolean upadteHerramienta(String nombre, String caracteristica, ferreteria[]pb){
        try (Scanner t = new Scanner(System.in)) {
            int i = getHerramienta(nombre, caracteristica, pb);
            if (i != -1){
                System.out.println("¿Que desea actualizar de la herramienta? "
                + "\n| 1.-Nombre | 2.-Marca | 3.-ID | 4.-Color | 5.-Precio | 6.-Caracteristicas |");
                int opt = t.nextInt();
                switch (opt){
                    case 1:{
                        String newNombre;
                        t.nextLine();
                        System.out.print("Nuevo nombre: ");
                        newNombre = t.nextLine();
                        pb[i].nombre = newNombre;
                        break;
                    }
                    case 2:{
                        String newMarca;
                        t.nextLine();
                        System.out.print("Nueva marca: ");
                        newMarca = t.nextLine();
                        pb[i].marca = newMarca;
                        break;
                    }
                    case 3:{
                        double newId ;
                        t.nextLine();
                        System.out.print("Nuevo ID: ");
                        newId = t.nextDouble();
                        pb[i].id = newId;
                        break;
                    }
                    case 4:{
                        String newColor;
                        t.nextLine();
                        System.out.print("Nuevo Color: ");
                        newColor = t.nextLine();
                        pb[i].color = newColor;
                        break;
                    }
                    case 5:{
                        int newPrecio;
                        t.nextLine();
                        System.out.print("Nuevo precio: ");
                        newPrecio = t.nextInt();
                        pb[i].precio = newPrecio;
                        break;
                    }
                    case 6:{
                        String newCaracteristica;
                        t.nextLine();
                        System.out.print("Nueva caracteristica: ");
                        newCaracteristica = t.nextLine();
                        pb[i].caracteristica = newCaracteristica;
                        break;
                    }
                }
                return true;
            }else {
                System.out.println("Herramienta no encontrada");
            }
        }
        return false;
    }

}

