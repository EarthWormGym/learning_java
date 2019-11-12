public class BankAccount {
    int balance = 0;

    public static void main(){
        BankAccount bankAccount = new BankAccount();
        System.out.println("Your current bank balance is: " + bankAccount.balance);
    }

    public void deposit(int money){
        balance = balance + money;
    }

    public void withdraw(int money){
        balance = balance - money;
    }
}
