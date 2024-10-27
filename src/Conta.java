import java.util.ArrayList;
import java.util.List;

public abstract class Conta implements IConta{

    private static final int AGENCIA_PADRAO = 001;
    private static int SEQUENCIAL = 1;

    private int agencia;
    private int conta;
    private double saldo;
    private Cliente cliente;
    private List<Cliente> contas;

    public Conta(Cliente cliente) {
        this.agencia = Conta.AGENCIA_PADRAO;
        this.conta = SEQUENCIAL++;
        this.cliente = cliente;
        this.contas = new ArrayList<>();
        contas.add(cliente);
    }


    public double getSaldo() {
        return saldo;
    }

    public int getAgencia() {
        return agencia;
    }

    public int getConta() {
        return conta;
    }



    protected void imprimirInfoComum(){
        System.out.println(String.format("CLIENTE: %s", this.cliente.getNome()));
        System.out.println(String.format("AGENCIA: %d", this.agencia));
        System.out.println(String.format("CONTA: %d", this.conta));
        System.out.println(String.format("SALDO: %.2f", this.saldo));
    }


    @Override
    public void sacar(double valor) {
        saldo -= valor;

    }

    @Override
    public void depositar(double valor) {
        saldo += valor;

    }

    @Override
    public void transferir(double valor, Conta contaDestino) {
        this.sacar(valor);
        contaDestino.depositar(valor);
    }

    @Override
    public void exibirClientes() {
        System.out.println(this.cliente.getNome());;
    }

    public void exibirTotalClientes(){
        System.out.println(contas.size());
    }
}
