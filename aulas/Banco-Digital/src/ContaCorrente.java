public class ContaCorrente extends Conta{

    public void imprimirExtrato(){
        System.out.println("EXTRATO CONTA CORRENTE");
        super.imprimirDetalhesConta();
    }
}
