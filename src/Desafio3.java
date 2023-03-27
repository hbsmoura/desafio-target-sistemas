import com.fasterxml.jackson.databind.ObjectMapper;
import dominio.Faturamento;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Desafio3 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new FileReader(new File("resources/dados.json")));

        Faturamento[] mes = new ObjectMapper().readValue(bf.lines().collect(Collectors.joining()), Faturamento[].class);

        List<Faturamento> diasComFaturamento =
                Arrays.stream(mes).filter(
                        faturamento -> faturamento.getValor() > 0
                ).collect(Collectors.toList());

        Faturamento menor = diasComFaturamento.stream().reduce((a, b) ->
                a.getValor() < b.getValor() ? a : b
        ).get();

        Faturamento maior = diasComFaturamento.stream().reduce((a, b) ->
                a.getValor() > b.getValor() ? a : b
        ).get();

        double media = diasComFaturamento.stream().mapToDouble(f -> f.getValor()).average().getAsDouble();

        List<Faturamento> diasComFaturamentoMaior =
                diasComFaturamento.stream().filter(
                        faturamento -> faturamento.getValor() > media
                ).collect(Collectors.toList());

        System.out.println(String.format("O menor valor de faturamento ocorrido foi de %f, e aconteceu no dia %d.", menor.getValor(), menor.getDia()));
        System.out.println(String.format("O maior valor de faturamento ocorrido foi de %f, e aconteceu no dia %d.", maior.getValor(), maior.getDia()));
        System.out.println(String.format("Número de dias no mês em que o valor de faturamento diário foi superior à média mensal (%f): %d", media, diasComFaturamentoMaior.size()));

        bf.close();
    }


}
