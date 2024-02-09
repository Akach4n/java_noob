import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //    var scanner = new Scanner(System.in);

        //System.out.print("Introduce un número: ");
        //  int numero = scanner.nextInt();
        //   scanner.close();
//
//        for(int i = 0;i <= numero;i++){
//            if (i % 2 == 0) {
//                System.out.println(i);
//            }
//            else {
//                System.out.println("No par");
//            }
//        }
//            int i = 1;
//        while(i <= 5){
//            if(i % 2 == 0){
//                System.out.println("El número "+i+" es par");
//            }
//            else{
//                System.out.println("El número "+i+" es impar");
//            }i++;
//
//        int[] lista_numeros = new int[5];
//        String[] lista_texto = {"Maria","Carlos","Juan","Jose"};
//        for(int numero : lista_numeros) {
//            System.out.printf(numero+ " ");
//        }
//        for(String texto : lista_texto) {
//            System.out.printf(texto+ " ");
//        }
//
//
//        }

        System.out.println("Cuál es tu nombre? ");
        var scanner = new Scanner(System.in);
        String nombre = scanner.next();


        System.out.println("Cuál es tu edad? ");
        var scanner1 = new Scanner(System.in);
        int edad = scanner1.nextInt();
        System.out.println("Tienes " + edad + " años y te llamas " + nombre);





    }
}
