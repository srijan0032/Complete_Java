class BankAccount{
    private long accountNumber;
    private double balance;

    public void deposit(double amount){
        if(amount>0){
            balance+=amount;
            System.out.println("Deposited:"+amount);
        }else{
            System.out.println("Invalid Deposit Amount");
        }
    }

    public void withdraw(double amount){
        if(amount>0 && amount<=balance){
            balance-=amount;
            System.out.println("Withdraw"+amount);
        }else{
            System.out.println("Invalid amount or Insufficient balance");
        }

    }

    public long getAccountNumber(){
        return accountNumber;
    }

    public void setAccountNumber(long accountNumber){
        this.accountNumber=accountNumber;
    }

    public double getBalance(){
        return balance;
    }
}
public class Encapsulation {
    public static void main(String[] args) {
        BankAccount bank = new BankAccount();
        bank.setAccountNumber(32332);
        bank.deposit(-10);
        bank.withdraw(10);
        bank.deposit(100);
        bank.withdraw(10);
        System.out.println(bank.getBalance());
    }
}
