package classes;

public class ServicosTerceirizados extends Servicos{
    private String empresa;

    public ServicosTerceirizados() {
    }
    public ServicosTerceirizados(String codigo, String descricao, float preco, String empresa) {
        super(codigo, descricao, preco);
        this.empresa = empresa;
    }

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }
}
