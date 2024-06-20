import java.util.ArrayList;
import java.util.List;

public class Banco {
    private String nome;
    List<Conta> contas;
    public Banco() {
        contas = new ArrayList<Conta>();
    }

    public Banco(String nome) {
        this();
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Conta> getContas() {
        return contas;
    }

    public void addConta(Conta conta) {
        contas.add(conta);
    }
    public void removerConta(Conta conta) {
        contas.remove(conta);
    }
    public String listarContas() {
        StringBuilder retorno = new StringBuilder();
        for (Conta conta : contas) {
            retorno.append(conta).append("\n***************\n");
        }
        return retorno.toString();
    }

    @Override
    public String toString() {
        return "Nome: " + nome + "\nContas: " + listarContas();
    }
}
