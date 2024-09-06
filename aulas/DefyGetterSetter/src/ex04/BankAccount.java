package ex04;

public class BankAccount {
    public static void main(String[] args) {
        Interface interf = new Interface();

        interf.setBalance(5000);
        interf.setDeposit(13000);
        interf.setWithdraw(2000);
        interf.setAllVlaues();

        System.out.println("O seu saldo é de R$ " + interf.getBalance());
        System.out.println("O seu depósito de R$" + interf.getDeposit() + " foi realizado!");
        System.out.println("O seu saque de R$" + interf.getWithdraw() + " foi realizado!");
        System.out.println("O total de sua conta é de R$ " + interf.getAllVlaues());
    }
}
