/*
import org.junit.Test;
import static org.junit.Assert.*;
public class JunitExampleTestcases {
	@Test
    public void testDepositWithNegativeAmount() {
        Account account = new Account(1000);
        assertFalse(account.deposit(-500));
        assertEquals(0, account.getBalance(), 0.01);
    }

    @Test
    public void testWithdrawWithNegativeAmount() {
        Account account = new Account(1000);
        assertFalse(account.withdraw(-500));
        assertEquals(0, account.getBalance(), 0.01);
    }

    @Test
    public void testWithdrawExceedingOverdraftLimit() {
        Account account = new Account(1000);
        assertFalse(account.withdraw(1500));
        assertEquals(0, account.getBalance(), 0.01);
    }

    @Test
    public void testDeposit() {
        Account account = new Account(1000);
        assertTrue(account.deposit(500));
        assertEquals(500, account.getBalance(), 0.01);
    }

    @Test
    public void testWithdrawWithinBalanceAndOverdraftLimit() {
        Account account = new Account(1000);
        account.deposit(500);
        assertTrue(account.withdraw(300));
        assertEquals(200, account.getBalance(), 0.01);
    }

    @Test
    public void testWithdrawResult() {
        Account account = new Account(1000);
        account.deposit(500);
        assertTrue(account.withdraw(300));
        assertEquals(200, account.getBalance(), 0.01);
    }

    @Test
    public void testDepositResult() {
        Account account = new Account(1000);
        assertTrue(account.deposit(500));
        assertEquals(500, account.getBalance(), 0.01);
    }
}
*/