package classes;

public class Motos extends Produtos{
    private String chassi;
    private String cor;
    private int cilindrada;

    public Motos(){
    }
    public Motos(String codigo, String marca, String modelo, float precoCusto, float precoVenda, String chassi, String cor, int cilindrada) {
        super(codigo, marca, modelo, precoCusto, precoVenda);
        this.chassi = chassi;
        this.cor = cor;
        this.cilindrada = cilindrada;
    }

    public String getChassi() {
        return chassi;
    }

    public void setChassi(String chassi) {
        this.chassi = chassi;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public int getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(int cilindrada) {
        this.cilindrada = cilindrada;
    }
}
