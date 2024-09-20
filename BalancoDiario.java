package Models;

public class BalancoDiario {
    private static int qtdeCarros;
    private static double total;

    public void doAdd(Veiculo obj) {
        qtdeCarros++;


    }
    public String doGerarRelatiorio() {
        return "";
    }

    public static int getQtdeCarros() {
        return qtdeCarros;
    }

    public static void setQtdeCarros(int qtdeCarros) {
        BalancoDiario.qtdeCarros = qtdeCarros;
    }

    public static double getTotal() {
        return total;
    }

    public static void setTotal(double total) {
        BalancoDiario.total = total;
    }
}
