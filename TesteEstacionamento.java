package Models;

public class TesteEstacionamento {
    public static void main(String[] args) {
        Segurado veicSeg = new Segurado(10);
        veicSeg.setValorHora(5);
        veicSeg.setValorAdicional(20);
        veicSeg.setHoras(5);
        System.out.println(veicSeg.doViewCupom());

        BalancoDiario bd = new BalancoDiario();
        bd.doAdd(veicSeg);
        System.out.println(bd.doGerarRelatiorio());
    }
}
