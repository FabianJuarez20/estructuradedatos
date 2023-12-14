import java.util.Scanner;
public class Metodos{

     public static void crearArreglo(int[] arreglo, int n) {
        Scanner leer = new Scanner(System.in);
       
        for (int i = 0; i < n; i++) {
            System.out.print("Ingrese el elemento " + (i + 1) + " del array: ");
            arreglo[i] = leer.nextInt();    
        }
    }

     public static int buscarArreglo(int[] arreglo, int num, int v) {
       if (v == arreglo.length) {
            return -1;
       }
             if (arreglo[v] == num) {
            return v;
        }
          
        return buscarArreglo(arreglo, num, v + 1);  
    }

    public static int  buscarFibonacci( int s){
          
        if((s == 1) || ( s==0)){
            return s;

        }else{
          return buscarFibonacci(s-1) + buscarFibonacci(s-2);
        }
    }

    public static void buscarSerie(int s, int n){
    
      if(n<s){
        System.out.print(buscarFibonacci(n) + " ");
        
        buscarSerie(s, n+1);  
      }

    }

    public static int valorMaximo(int d){
        if (d == 0) {
            return 0;
        } else {
            return (1 << (d - 1)) + valorMaximo(d - 1);
        }
      
    }

}