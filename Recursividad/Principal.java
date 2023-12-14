import java.util.Scanner;

public class Principal{

public static void main(String[] args) {
    Scanner leer = new Scanner(System.in);
    int opcion;
    
    do{

    menu();
      opcion = leer.nextInt();
    switch (opcion) {
        case 1:
            System.out.println("Recorrido de Arreglo");
            int condition = 0;
            int opcion2;
            
            
                    System.out.print("Ingrese el tamaño del array: ");
                    int n = leer.nextInt();
                    int[] arreglo = new int[n];
                    Metodos.crearArreglo(arreglo, n); 
                    System.out.println("Que numero quieres buscar");
                    int num = leer.nextInt();
                    int posicion= Metodos.buscarArreglo(arreglo, num, 0);
                    
                    if(posicion==-1){
                     System.out.println("No se encontro el numero en el arreglo");
                    }else{
                        System.out.println("El numero " +num+" se encuentra en la pocision "+ posicion);
                       
                    }
                   break;
                

            
    
        case 2:
           System.out.println("-------Serie Fibonacci-----");
           System.out.println("Que dimencion quieres :");
           int s = leer.nextInt();
           System.out.print("La serie es:  ");
              Metodos.buscarSerie( s, 0);
            break;
        case 3:
        System.out.println("-------Maximo Valor Decimal-----");
        System.out.println("Cantidad de Digitos Binarios");
          int  d= leer.nextInt();
          int result= Metodos.valorMaximo(d );

          System.out.println(result);


        break;
        case 4:
        System.out.println("Saliendo");
        break;
        default:
            System.out.println("Opcion no encontrada");
        break;
    }
}while(opcion!=4);
}


 public static void  menu(){
    System.out.println("  ------------------------");
    System.out.println("/Procedimientos Recursivos/");
    System.out.println("  ------------------------");
    System.out.println("1.-Recorrido de un Array");
    System.out.println("2.Serie Fibonacci");
    System.out.println("3.Maximo Valor Decimal");
    System.out.println("     de un valor binario");
    System.out.println("4.-Salir");

}

public static void menuArray(){
System.out.println("1.Crear Arreglo");
System.out.println("2.Buscar numero en arreglo");
System.out.println("3.Salir");
}
}