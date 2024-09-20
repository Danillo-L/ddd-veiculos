package Models;

public class Segurado extends Veiculo implements ISeguroService{
    private double seguro;

    public double Segurado(double seguro) {
        this.seguro = seguro;
        return seguro;
    }
    public double doTotal() {
        return super.doTotal() - doDesconto();
    }
    public String doViewCupom() {
        return "";
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
