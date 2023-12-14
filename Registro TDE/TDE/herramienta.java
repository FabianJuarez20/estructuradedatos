import java.util.Scanner;

public class herramienta {
    ferreteria [] pb = new ferreteria[100];
    public herramienta(){
        pb[11] = new ferreteria("Pala", "Truper", 01, "rojo", 200, "Mango corto");
        pb[32] = new ferreteria("Martillo", "Makita", 02, "azul", 300, "Acero Inoxhidable");
        pb[12] = new ferreteria("Clavos", "ToolCraft", 03, "amarillo", 100, "Cubs");
    }

    /*
   Create
    */
    public  boolean registerHerramientas (String nombre, String marca, double id,
                                           String color, int precio, String caracteristica) {
        int i = 0;
        do {
            if (pb[i] == null) {
                pb[i] = new ferreteria(nombre, marca, id, color, precio, caracteristica);
                return true;
            }
            i++;
        } while (i < pb.length);
        return false;
    }
    /*
  Read
   */
    public void listHerramientas(){
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
    public String getHerramientas(String nombre, String caracteristica){
        try {
            for (int i = 0; i < pb.length; i++) {
                if (pb[i] != null) {
                    if (pb[i].nombre.equals(nombre)) {
                        if (pb[i].caracteristica.equals(caracteristica)) {
                            System.out.println(pb[i] + " ");
                            return pb[i].toString();
                        }
                    }
                }
            }
        }catch (NullPointerException e){
            System.out.println("Herramienta no encontrada");
        }
        return "";
    }
    public int getHerramienta (String nombre, String caracteristica){
        try {
            for (int i = 0; i < pb.length; i++) {
                if (pb[i] != null) {
                    if (pb[i].nombre.equals(nombre)) {
                        if (pb[i].caracteristica.equals(caracteristica)) {
                            //System.out.println(pb[i] + " ");
                            return i;
                        }
                    }
                }
            }
        }catch (NullPointerException e){
            System.out.println("Herramuienta no encontrado");
        }
        return -1;
    }
    /*
    Delete
     */
    public boolean deleteHerramienta(String nombre, String caracteristica){
        try {
            for (int i = 0; i < pb.length; i++) {
                if (pb[i] != null) {
                    if (pb[i].nombre.equals(nombre)) {
                        if (pb[i].caracteristica.equals(caracteristica)) {
                            pb[i] = null;
                            System.out.println(pb[i]);
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
    public boolean upadteHerramienta(String nombre, String caracteristica ){
        try (Scanner t = new Scanner(System.in)) {
            int i = getHerramienta(nombre,caracteristica);
            if (i != -1){
                System.out.println("¿Que desea actualizar de la herramienta? "
                        + "\n| 1.-Nombre | 2.-Marca | 3.-ID | 4.-Colo | 5.-Precio | 6.-Caracteristica |");
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
                        System.out.print("Nueva Marca: ");
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
                        System.out.print("Nueva color: ");
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
                        System.out.print("Nuevo caracteristica: ");
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
