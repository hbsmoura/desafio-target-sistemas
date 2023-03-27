import java.util.Scanner;

public class Desafio2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um número");

        int n = scanner.nextInt();
        n = Math.abs(n);

        String resultado;
        if (pertenceAFibonacci(n)) resultado = String.format("O número %d pertence à sequência de Fibonacci!", n);
        else resultado = String.format("O número %d não pertence à sequência de Fibonacci!", n);

        System.out.println(resultado);

        scanner.close();
    }

    private static boolean pertenceAFibonacci(int n) {
        if (n < 2) return true;

        int atual = 1;
        int anterior = 0;

        while (atual < n) {
            atual = atual + anterior;
            anterior = atual - anterior;
            if (n == atual) return true;
        }
        return false;
    }
}
