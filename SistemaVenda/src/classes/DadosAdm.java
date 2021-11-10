package classes;
public class DadosAdm {
    private String nome;
    private String senha;
    
    public boolean validarUsuario(String usuario, String senha){
        this.nome = usuario;
        this.senha = senha;
        if(this.nome.equals("celomania") && this.senha.equals("12345"))
            return true;
        else if(this.nome.equals("nildo") && this.senha.equals("54321"))
                return true;
        else
            return false;
    }
}
