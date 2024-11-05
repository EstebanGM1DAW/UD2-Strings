import java.util.Scanner;
public class Relacion6_8 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduce una frase: ");
        String frase = entrada.nextLine();
        String fraseNueva = "";
        for (int i=0;i < frase.length(); i++) {
            char caracter = frase.charAt(i);
            char mayus = Character.toUpperCase(caracter);
            char minus = Character.toLowerCase(caracter);
            if (frase.charAt(i) == mayus) {
                fraseNueva = fraseNueva + minus;
            } else {
                if (frase.charAt(i) == minus ) {
                    fraseNueva = fraseNueva + mayus;
                }
            }
        }
        System.out.println(fraseNueva);
        entrada.close();
    }
}
