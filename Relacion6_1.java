import java.util.Scanner;
public class Relacion6_1 {
    public static void main (String[] args){
                 //EJERCICIO 1
                String frase = "";
                System.out.println("Introduce una frase: ");
                Scanner entrada = new Scanner(System.in);
                frase = entrada.nextLine();
                for (int i=0; i < frase.length(); i++){
                    System.out.println(frase.charAt(i));
                }
       entrada.close();
    }
}

