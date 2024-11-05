import java.util.Scanner;
public class Relacion6_3 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduce una frase: ");
        String frase = entrada.nextLine();
        String letra;
        do {
        System.out.println("Introduce la letra a contar: ");
        letra = entrada.nextLine();
        if (letra.length() > 1) {
            System.out.println("Por favor, introduce solo una letra.");
        } 
        }  while (letra.length() != 1);

        char caracter = letra.charAt(0);
        int cont = 0;
            for (int i = 0; i < frase.length(); i++) {
                if (frase.charAt(i) == caracter) {
                    cont++;
                }
            }
            if (cont == 0) {
                System.out.println("La letra no aparece en la cadena.");
            } else {
                System.out.println("La letra '" + caracter + "' aparece " + cont + " veces en la frase.");
            }
            entrada.close();
        }
    }

