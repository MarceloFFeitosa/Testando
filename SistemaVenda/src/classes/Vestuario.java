package classes;

public class Vestuario extends Produtos{
    private String tipo; // Camisa, jaqueta, luva...
    private String cor;
    private String tamanho;

    public Vestuario() {
    }
    public Vestuario(String codigo, String marca, String modelo, float precoCusto, float precoVenda, String tipo, String cor, String tamanho) {
        super(codigo, marca, modelo, precoCusto, precoVenda);
        this.tipo = tipo;
        this.cor = cor;
        this.tamanho = tamanho;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getTamanho() {
        return tamanho;
    }

    public void setTamanho(String tamanho) {
        this.tamanho = tamanho;
    }
}
