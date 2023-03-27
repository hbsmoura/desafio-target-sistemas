import java.util.Scanner;

public class Desafio5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Insira aqui a string a ser invertida: ");
        String string = scanner.next();

        System.out.println("Eis o resultado: ");
        System.out.println(inverteString(string));

        scanner.close();
    }

    public static String inverteString(String entrada) {
        String saida = "";
        for (int i = entrada.length(); i > 0; i--) {
            saida = saida.concat(String.valueOf(entrada.charAt(i-1)));
        }
        return saida;
    }
}
