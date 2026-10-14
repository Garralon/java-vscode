import java.util.Scanner;

public class ej1 {
    
    Scanner scanner = new Scanner(System.in);
    
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
       System.out.println("Año actual: ");
       int añoactual = scanner.nextInt();
       System.out.println("El año actual es: " + añoactual);
      
       System.out.println("Año nacimiento: ");
       int añonacimiento = scanner.nextInt();
       System.out.println("El año de nacimiento es: "  + añonacimiento);

       int edad = añoactual - añonacimiento;
       
       String nombre = scanner.nextLine();
       System.out.printf("La edad es: %d\n ", edad, nombre);

       System.out.println("\nIngrese nombre: ");
       nombre = scanner.nextLine();
       System.out.printf("El nombre es: %s", nombre);

    }
}
