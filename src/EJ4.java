import java.util.Scanner;

public class EJ4 {
//4) Modifica la aplicación anterior, para que nos pida el nombre que queremos introducir (recuerda usar JOptionPane).
    public static void main(String[] args){
        System.out.println("Dame tu nombre");
        var scanner = new Scanner(System.in);
        String nombre = scanner.next();

        System.out.println("Bienvenido "+nombre);
    }
}
