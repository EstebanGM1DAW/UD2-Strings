import java.util.Scanner;
public class Relacion6_5 {
    public static void main(String[] args) {
        System.out.println("Escribe tu nombre y apellidos: ");
        Scanner teclado = new Scanner(System.in);
        String nombre = teclado.nextLine();
        String iniciales="";
        iniciales += nombre.charAt(0);
        for (int i = 0;nombre.length() > i;i++) {
            if (nombre.charAt(i) == ' ') {
                iniciales += nombre.charAt(i+1);
            }
        }
        System.out.println("Iniciales: " + iniciales.toUpperCase());
        teclado.close();
    }
}
