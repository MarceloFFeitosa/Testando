package classes;

public class Acessorios extends Produtos{
    private String cor;
    private String tipo; // Protetor, bagagem, estetico...

    public Acessorios() {
    }
    public Acessorios(String codigo, String marca, String modelo, float precoCusto, float precoVenda, String cor, String tipo) {
        super(codigo, marca, modelo, precoCusto, precoVenda);
        this.cor = cor;
        this.tipo = tipo;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}
