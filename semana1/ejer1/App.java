
import java.until.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("introoduce un numero: ");
        int num1 = sc.nextInt();
        System.out.println("introduce otro numero: ");
        int num2 = sc.nextInt();
        System.out.printf("la suma es: %d\n", num1 + num2);
        sc.close();
    }
}