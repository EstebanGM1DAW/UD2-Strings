import java.util.Scanner;

public class Relacion6_2 {
    public static void main(String[] args) {
        System.out.println("Introduce una frase: ");
        Scanner teclado = new Scanner(System.in);
        String frase = teclado.nextLine();
        System.out.println("Subcadena para comprobar: ");
        String subcadena = teclado.nextLine();
        if (frase.startsWith(subcadena)) 
        {
            System.out.println("La frase empieza por la subcadena");
        }
        else 
        {
            System.out.println("La frase NO empieza por la subcadena");
        }
        teclado.close();
        }
    }
