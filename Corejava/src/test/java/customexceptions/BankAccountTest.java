package customexceptions;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class BankAccountTest {

    @Test
    public void testSuccessfulWithdrawal() throws InsufficientFundsException, InvalidWithdrawalException {
        BankAccount account = new BankAccount(1000);
        account.withdraw(500);
        assertEquals(500, account.getBalance());
    }

    @Test
    public void testInsufficientFundsException() {
        BankAccount account = new BankAccount(1000);
        assertThrows(InsufficientFundsException.class, () -> account.withdraw(1500));
    }

    @Test
    public void testInvalidWithdrawalException() {
        BankAccount account = new BankAccount(1000);
        assertThrows(InvalidWithdrawalException.class, () -> account.withdraw(-200));
    }
}
