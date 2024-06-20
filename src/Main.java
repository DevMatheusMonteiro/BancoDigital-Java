import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Banco banco = new Banco("Nubank");
        Cliente cliente = new Cliente("Matheus");
        Conta contaCorrente = new ContaCorrente(cliente, 40000);
        banco.addConta(contaCorrente);
        Conta contaPoupanca = new ContaPoupanca(cliente, 3300);
        banco.addConta(contaPoupanca);

        contaCorrente.transferencia(4000, contaPoupanca);
        System.out.println(banco);
    }
}