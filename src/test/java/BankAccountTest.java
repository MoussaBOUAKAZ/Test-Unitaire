import org.example.BankAccount;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class BankAccountTest {
    @Test
    void depositAndWithdraw() {
        BankAccount account = new BankAccount(100, 0.05);
        account.deposit(50);
        assertEquals(150, account.getBalance());
        account.withdraw(30);
        assertEquals(120, account.getBalance());
    }

    @Test
    void transfer() {
        BankAccount a1 = new BankAccount(100, 0.05);
        BankAccount a2 = new BankAccount(200, 0.05);
        a1.transfer(50, a2);
        assertEquals(50, a1.getBalance());
        assertEquals(250, a2.getBalance());
    }

    @Test
    void addInterest() {
        BankAccount account = new BankAccount(100, 0.1);
        account.addInterest();
        assertEquals(110, account.getBalance());
    }
}