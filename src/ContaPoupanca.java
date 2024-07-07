public class ContaPoupanca extends Conta {

    public ContaPoupanca(Cliente cliente) {
        super(cliente);
    }

    @Override
    public void imprmirExtrato() {
        System.out.println("=== EXTRATO CONTA POUPANÇA ===");
        super.imprimirInfos();
    }

}
