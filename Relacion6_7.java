import java.util.Scanner;
public class Relacion6_7 {
    public static void main(String[] args) {
        char uno = ' ';
        char dos = ' ';
        Scanner entrada = new Scanner(System.in);
        String caracteres = "";
        do {
        System.out.println("Introduce 2 carácteres: ");
        caracteres = entrada.nextLine();
            if (caracteres.length() > 2){
                System.out.println("Solo 2 carácteres");
            }
        } while (caracteres.length() > 2);
        uno = caracteres.charAt(1);
        dos = caracteres.charAt(0);
        System.out.println("Las letra invertidas son: " + uno + dos);
        entrada.close();
    }
}
