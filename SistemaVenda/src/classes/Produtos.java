package classes;

public abstract class Produtos {
    private String codigo;
    private String marca;
    private String modelo;
    private float precoCusto;
    private float precoVenda;

    public Produtos() {
    }
    public Produtos(String codigo, String marca, String modelo, float precoCusto, float precoVenda) {
        this.codigo = codigo;
        this.marca = marca;
        this.modelo = modelo;
        this.precoCusto = precoCusto;
        this.precoVenda = precoVenda;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public float getPrecoCusto() {
        return precoCusto;
    }

    public void setPrecoCusto(float precoCusto) {
        this.precoCusto = precoCusto;
    }

    public float getPrecoVenda() {
        return precoVenda;
    }

    public void setPrecoVenda(float precoVenda) {
        this.precoVenda = precoVenda;
    }
}
