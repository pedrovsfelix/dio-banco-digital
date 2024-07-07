public class App {
    public static void main(String[] args) {

        Cliente pedro = new Cliente();
        pedro.setNome("Pedro");
        
        Conta cc = new ContaCorrente(pedro);
        Conta cp = new ContaPoupanca(pedro);

        cc.imprmirExtrato();
        cp.imprmirExtrato();
    }
}
