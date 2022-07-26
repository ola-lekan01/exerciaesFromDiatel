package Chapter7.Account;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class AccountTest {
    Account bankeAccount;
    Account jamesAccount;
    
    @BeforeEach
    void setUp(){
        bankeAccount = new Account("2" , "Banke" , "1234");
        jamesAccount = new Account("1" , "James" , "1234");
    }
    @Test
    public void accountCanBeCreatedTest(){
        //given that account exist
        //check that account exist
        //check that balance is zero
        Account account = new Account("3" , "AccountTest" , "1234");
        assertNotNull(account);
        assertEquals(0, account.getBalance("1234"));
    }
    @Test
    public void depositMoney_BalanceIncreaseTest(){
        //given that I have account and Balance is Zero
        //When I deposit 200
        //check that the balance is 200
        assertEquals(0, bankeAccount.getBalance("1234"));
        bankeAccount.deposit(200);
        assertEquals(200, bankeAccount.getBalance("1234"));
    }

    @Test
    @DisplayName("Test That User Cannot deposit a Negative Amount")
    public void test_ThatUserCannotDepositNegativeAmount(){
        assertEquals(0, bankeAccount.getBalance("1234"));
        bankeAccount.deposit(-2500);
        assertEquals(0 , bankeAccount.getBalance("1234"));
    }

    @Test
    public void test_ThatUserCannotWithdrawMoreThanYourBalance(){
        //given that your account balance is zero
        //when I deposit 200
        //check that I can't withdraw more than what I have
        assertEquals(0, bankeAccount.getBalance("1234"));
        bankeAccount.deposit(200);
        bankeAccount.withdraw(200, "1234");
        assertEquals(0 , bankeAccount.getBalance("1234"));
    }

    @Test
    public void test_ThatUserCanDepositAndWithdrawAtTheSameTime(){
        assertEquals(0, bankeAccount.getBalance("1234"));
        bankeAccount.deposit(2000);
        assertEquals(2000 , bankeAccount.getBalance("1234"));
        bankeAccount.withdraw(1000, "1234");
        assertEquals(1000 , bankeAccount.getBalance("1234"));
        bankeAccount.withdraw(2000, "1234");
        assertEquals(1000 , bankeAccount.getBalance("1234"));
    }

    @Test
    public void getBalanceWithWrongPin_ReturnZeroTest(){
        assertEquals(0, jamesAccount.getBalance("1234"));
        jamesAccount.deposit(2000);
        int myBalance = jamesAccount.getBalance("2345");
        assertEquals(0 , myBalance);
    }

    @Test
    public void getBalanceWithRightPin_ReturnNormalBalanceTest(){
        assertEquals(0, jamesAccount.getBalance("1234"));
        jamesAccount.deposit(2000);
        int myBalance = jamesAccount.getBalance("1234");
        assertEquals(2000 , myBalance);
    }

    @Test
    public void test_IfPinIsRightWithdrawAmountShouldWork(){
        assertEquals(0, bankeAccount.getBalance("1234"));
        bankeAccount.deposit(200);
        bankeAccount.withdraw(-200, "1234");
        assertEquals(200 , bankeAccount.getBalance("1234"));
    }

    @Test
    public void test_IfPinIsWrongWithdrawAmountShouldNotWork(){
        assertEquals(0, bankeAccount.getBalance("1234"));
        bankeAccount.deposit(200);
        bankeAccount.withdraw(-200, "123465");
        assertEquals(200 , bankeAccount.getBalance("1234"));
    }
}
