package classes;

public class ServicosInternos extends Servicos{
    private String tipo; // Rápido ou longo

    public ServicosInternos() {
    }
    public ServicosInternos(String codigo, String descricao, float preco, String tipo) {
        super(codigo, descricao, preco);
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}
