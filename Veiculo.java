package Models;

public class Veiculo {
    private double valorHora;
    private double valorAdicional;
    private double horas;

    public double doTotal() {
        if(horas == 0) {
            return 0;
        } else {
            return valorHora + valorAdicional * (horas - 1);
        }
    }
    public String doViewCupom() {
        return "";
    }

    public double getValorHora() {
        return valorHora;
    }

    public void setValorHora(double valorHora) {
        this.valorHora = valorHora;
    }

    public double getValorAdicional() {
        return valorAdicional;
    }

    public void setValorAdicional(double valorAdicional) {
        this.valorAdicional = valorAdicional;
    }

    public double getHoras() {
        return horas;
    }

    public void setHoras(double horas) {
        this.horas = horas;
    }


}
