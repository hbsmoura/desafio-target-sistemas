package dominio;

import java.util.Objects;

public class Faturamento {
    private int dia;
    private double valor;

    public Faturamento() {
    }

    public Faturamento(int dia, double valor) {
        this.dia = dia;
        this.valor = valor;
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    @Override
    public String toString() {
        return "Faturamento{" +
                "dia=" + dia +
                ", valor=" + valor +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Faturamento that = (Faturamento) o;
        return dia == that.dia && Double.compare(that.valor, valor) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(dia, valor);
    }
}
