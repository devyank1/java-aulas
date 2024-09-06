package ex04;

public class Interface {

    private double balance;
    private double deposit;
    private double withdraw;
    private double allVlaues;

    public double getBalance(){
        return balance;
    }

    public void setBalance(double balance){
        this.balance = balance;
    }

    public double getDeposit(){
        return deposit;
    }

    public void setDeposit(double deposit){
        this.deposit = deposit;
    }

    public double getWithdraw(){
        return withdraw;
    }

    public void setWithdraw(double withdraw){
        this.withdraw = withdraw;
    }

    public double getAllVlaues(){
        return allVlaues;
    }

    public void setAllVlaues(){
        this.allVlaues = this.balance + deposit - withdraw;
    }
}
