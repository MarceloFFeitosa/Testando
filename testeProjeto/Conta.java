package testeProjeto;

public class Conta {
    private String nome;
    private int conta;
    private int saldo;
    private int limite;

    public Conta(String nome, int conta, int saldo, int limite) {
        this.nome = nome;
        this.conta = conta;
        this.saldo = saldo;
        if(limite > 940)
            System.out.println("Limite não pode ser maior que o salário mínimo(940,00): ");
        else
            this.limite = limite;
    }

    public String getNome() {
        return nome;
    }

    public int getConta() {
        return conta;
    }

    public int getSaldo() {
        return saldo;
    }

    public int getLimite() {
        return limite;
    }
    
    public void depositar(float valor){
        this.saldo += valor;
    }
    
    public boolean sacar(float valor){
        if(valor > this.saldo){
            System.out.println("Nao tem saldo disponível!");
            return false;
        }
        else{
            this.saldo -= valor;
            return true;
        }
    }
    
}
