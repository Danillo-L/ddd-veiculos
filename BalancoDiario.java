package Models;

public class BalancoDiario {
    private static int qtdeCarros;
    private static double total;

    public void doAdd(Veiculo obj) {
        qtdeCarros++;
        total = total + obj.doTotal();
    }
    public String doGerarRelatiorio() {
        return "Quantidade de carros: " + qtdeCarros
                + "\nValor total: " + total;
    }
}
