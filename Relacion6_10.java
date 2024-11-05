import java.util.Scanner;
//NO TENGO EN CUENTA LAS MAYUSCULA
public class Relacion6_10 {
    public static void main(String[] args) {
        System.out.println("Introduce una palabra para comprobar si es palindromo: ");
        Scanner entrada = new Scanner(System.in);
        String palabra = entrada.nextLine();
        String palabraInv = "";
        for (int i = palabra.length() - 1; i >= 0; i--) {
            palabraInv += palabra.charAt(i); // Añadimos cada carácter desde el final al principio
        }
        if (palabra.equals(palabraInv)) {
            System.out.println("La palabra es palindroma");
        } else {
            System.out.println("La palabra NO es palindroma");
        }
    entrada.close();
    }
}
