import java.util.Scanner;

public class Relacion6_6 {
    public static void main(String[] args) {
        System.out.println("Introduce una palabra: ");
        Scanner entrada = new Scanner(System.in);
        String palabra = entrada.nextLine();
        String palabraInv = "";
        for (int i = palabra.length() - 1; i >= 0; i--) {
            palabraInv += palabra.charAt(i);
        }
        System.out.println("La palabra invertida es: " + palabraInv);
        entrada.close();
}
}
