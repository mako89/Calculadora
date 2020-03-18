package calculadora;

import java.util.Scanner;

/**
 *
 * @author ADI
 */
public class Calculadora {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        int num1, num2, suma;
        
        System.out.println("Introduce el primer numero:");
        num1 = teclado.nextInt();
        System.out.println("Introduce el segundo numero:");
        num2 = teclado.nextInt();
        
        System.out.println("La suma de los numeros es: " + (suma=num1+num2));
    }
    
}
