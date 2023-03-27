public class Desafio1 {
    public static void main(String[] args) {
        int indice = 13;
        int k = 0;
        int soma = 0;
        while(k < indice) {
            k = k + 1;
            soma = soma + k;
        }
        System.out.println(soma);
    }
}