public class ContaCorrente extends Conta {

    public ContaCorrente(Cliente cliente) {
        super(cliente);
    }

    @Override
    public void imprmirExtrato() {
        System.out.println("=== EXTRATO CONTA CORRENTE ===");
        super.imprimirInfos();
    }

}