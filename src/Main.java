
public class Main {
    public static void main(String[] args) {

        Cliente cliente = new Cliente();
        cliente.setNome("Michael");

        Conta cc = new ContaCorrente(cliente);
       cc.depositar(1500);

       Conta poupanca = new ContaPoupanca(cliente);
       poupanca.depositar(10000);

       cc.transferir(1500,poupanca);

       cc.imprimirExtrato();
       poupanca.imprimirExtrato();

       poupanca.exibirClientes();
       poupanca.exibirTotalClientes();

    }
}