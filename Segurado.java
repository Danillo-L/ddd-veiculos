package Models;

public class Segurado extends Veiculo implements ISeguroService{
    private double seguro;

    public Segurado(double seguro) {
        this.seguro = seguro;
    }

    public double doTotal() {
        return super.doTotal() - doDesconto();
    }
    public String doViewCupom() {
        return "Desconto: " + doDesconto()
                + "\nValor a pagar com desconto: " + doTotal() + "\n";
    }

    @Override
    public double doDesconto() {
        return super.doTotal() * seguro /100;
    }

    public double getSeguro() {
        return seguro;
    }



    public void setSeguro(double seguro) {
        this.seguro = seguro;
    }
}
