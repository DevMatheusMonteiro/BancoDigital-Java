public abstract class Conta {
    private static final int AGENCIA_PADRAO = 1;
    private static int sequencial = 1;

    protected int agencia;
    protected int numero;
    protected double saldo;
    protected Cliente cliente;

    public Conta(Cliente cliente, double saldo) {
        agencia = AGENCIA_PADRAO;
        numero = sequencial++;
        this.cliente = cliente;
        this.saldo = saldo;
    }

    public void depositar(double valor) {
        saldo += valor;
    }
    public void sacar(double valor) {
        saldo -= valor;
    }
    public void transferencia(double valor, Conta conta) {
        sacar(valor);
        conta.depositar(valor);
    }

    public int getAgencia() {
        return agencia;
    }

    public int getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }

    @Override
    public String toString() {
        return  "Titular: " + cliente.getNome() +
                "\nAgência: " + agencia +
                "\nNúmero: " + numero +
                String.format("\nSaldo: R$ %.2f", saldo).replace(".", ",");
    }
}
