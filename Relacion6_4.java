import java.util.Scanner;
public class Relacion6_4 {
    public static void main(String[] args) {
        int cont=0;
        System.out.println("Introduce una frase: ");
        Scanner teclado = new Scanner(System.in);
        String frase = teclado.nextLine();
        for (int i = 0;frase.length() > i;i++) {
            if (frase.charAt(i) == ' ') {
                cont++;
            }
        }
        System.out.println("La frase tiene: " + cont + " espacios.");
        teclado.close();
    }
}
