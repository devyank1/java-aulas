public class Conta{

    protected int agencia;
    protected int numero;
    protected double saldo;

    private static final int AGENCIA_PADRAO = 1;

    private static int SEQUENCIAL = 1;

    public Conta() {
        this.agencia = AGENCIA_PADRAO;
        this.numero = SEQUENCIAL++;
    }

    public int getAgencia() {
        return agencia;
    }

    public int getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public void sacarConta(double valor){
        saldo -= valor;
    }

    public void depositarConta(double valor){
        saldo += valor;
    }


    protected void imprimirDetalhesConta(){
        System.out.println("AGÊNCIA: " + this.agencia);
        System.out.println("NÚMERO: " + this.numero);
        System.out.println("SALDO: " + this.saldo);
    }

    public void transferirConta(double valor, Conta contaDestino){
        this.sacarConta(valor);
        contaDestino.depositarConta(valor);
    }


}
