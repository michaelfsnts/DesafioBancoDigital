public interface IConta {
    //Métodos
    void sacar(double valor);
    void depositar(double valor);
    void transferir(double valor, Conta contaDestino);
    void imprimirExtrato();
    void exibirClientes();
}
