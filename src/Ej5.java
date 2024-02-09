import java.util.Scanner;

public class Ej5 {
    //5) Haz una aplicación que calcule el área de un círculo(pi*R2). El radio se pedirá por teclado (recuerda pasar de String a double con Double.parseDouble). Usa la constante PI y el método pow de Math.
    public static void main(String[] args){
        System.out.println("Bienvenido al calculador del área de círculo \nCuál es el radio? ");
        var scanner1 = new Scanner(System.in);
        double radio = scanner1.nextDouble();

       double area = Math.PI * Math.pow(radio,2);

       System.out.println("El área del círculo es "+ (float) Math.round(area*100)/100);
    }
}
