import static org.junit.jupiter.api.Assertions.*;

class BankAccountTest {

    @org.junit.jupiter.api.Test
    void bankAccountBalanceShowsZero(){
        BankAccount bankAccount = new BankAccount();
        assertEquals(bankAccount.balance, 0);
    }

    @org.junit.jupiter.api.Test
    void canDepositMoneyIntoBankBalance(){
        BankAccount bankAccount = new BankAccount();
        bankAccount.deposit(20);
        assertEquals(bankAccount.balance, 20 );
    }

    @org.junit.jupiter.api.Test
    void canWithdrawMoneyOutBankBalance(){
        BankAccount bankAccount = new BankAccount();
        bankAccount.deposit(35);
        bankAccount.withdraw(30);
        assertEquals(bankAccount.balance, 5);
    }
}