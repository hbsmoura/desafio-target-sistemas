import java.util.HashMap;
import java.util.Map;

public class Desafio4 {
    public static void main(String[] args) {
        Map<String, Double> faturamentoPorEstado = new HashMap<>();
        faturamentoPorEstado.put("SP", 67836.43);
        faturamentoPorEstado.put("RJ", 36678.66);
        faturamentoPorEstado.put("MG", 29229.48);
        faturamentoPorEstado.put("ES", 27165.48);
        faturamentoPorEstado.put("Outros", 19849.53);

        double total = faturamentoPorEstado.values().stream().reduce(Double::sum).get();

        System.out.println("Percentual de representação dos estados no faturamento mensal da distribuidora");
        faturamentoPorEstado.forEach((key, value) -> {
            double percentual = value / total * 100;
            System.out.println(String.format("%s - Valor: %.2f - Percentual: %.2f%%.", key, value, percentual));
        });
    }
}
