package classes;

public class Pecas extends Produtos{
    private String tipo; // Pneu, oleo, bateria...

    public Pecas() {
    }
    public Pecas(String codigo, String marca, String modelo, float precoCusto, float precoVenda, String tipo) {
        super(codigo, marca, modelo, precoCusto, precoVenda);
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}
