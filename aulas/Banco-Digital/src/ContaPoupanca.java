public class ContaPoupanca extends Conta{

    public void imprimirExtrato(){
        System.out.println("EXTRATO CONTA POUPANÇA");
        super.imprimirDetalhesConta();
    }
}
