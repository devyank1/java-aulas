public class Main {
    public static void main(String[] args) {
        Conta cc = new ContaCorrente();
        Conta poupanca = new ContaCorrente();

        cc.depositarConta(100);
        cc.transferirConta(70, poupanca);
        cc.sacarConta(25);

        poupanca.transferirConta(30, cc);

        cc.imprimirDetalhesConta();
        poupanca.imprimirDetalhesConta();

    }
}
