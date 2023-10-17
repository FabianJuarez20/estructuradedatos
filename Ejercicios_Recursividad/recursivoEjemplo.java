import java.util.Scanner;

public class recursivoEjemplo {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.println("Numero:");
        int numero = read.nextInt();
        System.out.println("Exponente:");
        int exponente = read.nextInt();
        System.out.println(exponencialRecursivo(numero, exponente));

    }

    private static int exponencialRecursivo(int dato,int exponencial) {
        // condicion de paro
        int numero = dato;
        int exponente = exponencial;

        if(exponente == 0){
            return 1;
        }else{
            numero = numero * exponencialRecursivo(numero, exponencial - 1);
            return numero;
        }
    }
}