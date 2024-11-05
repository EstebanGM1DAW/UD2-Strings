import java.util.Scanner;

public class Relacion6_9 {
    public static void main(String[] args) {
        System.out.println("Introduce una frase: ");
        Scanner teclado = new Scanner(System.in);
        String frase = teclado.nextLine();
        System.out.println("Subcadena para comprobar: ");
        String subcadena = teclado.nextLine();
        if (frase.contains(subcadena)) 
        {
            System.out.println("La frase contiene la subcadena");
        }
        else 
        {
            System.out.println("La frase NO contiene la subcadena");
        }
        teclado.close();
        }
    }
