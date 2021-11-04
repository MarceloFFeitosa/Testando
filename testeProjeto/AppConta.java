//testando alteração

package testeProjeto;
public class AppConta {
    public static void main(String[] args) {
       Conta c1 = new Conta("Marcelo", 111, 200, 900);
       
        System.out.println("Nome: " +c1.getNome() + "\nSaldo: " + c1.getSaldo() + " reais");
        System.out.println("Depositando 100 reais");
        c1.depositar(100);
        System.out.println("Nome: " +c1.getNome() + "\nSaldo: " + c1.getSaldo() + " reais");
        System.out.println("Sacando 250 reais");
        c1.sacar(250);
        System.out.println("Nome: " +c1.getNome() + "\nSaldo: " + c1.getSaldo() + " reais");
    }
    
}
