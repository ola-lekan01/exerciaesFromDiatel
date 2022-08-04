package Chapter7.Account;

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

public class BankTest {
    private Bank myBank;

    @BeforeEach
    public void setUp(){
        myBank = new Bank();
    }

    @Test
    @DisplayName("Test that Bank Exist")
    public void test_BankExist(){
        assertNotEquals(null, myBank);
    }

    @Test
    public void test_ThatFourAccountCanBeCreated(){
     myBank.createAccountFor("Banke" , "1454");
        assertEquals(1, myBank.getNumberOfCustomer());
     myBank.createAccountFor("James" , "1674");
        assertEquals(2, myBank.getNumberOfCustomer());
     myBank.createAccountFor("Emmanuel OlaIfa" , "1445");
        assertEquals(3, myBank.getNumberOfCustomer());
     myBank.createAccountFor("Lekan Sam" , "1234");
     assertEquals(4, myBank.getNumberOfCustomer());
    }

    @Test
    public void testThatWeCanFindAccount(){
        myBank.createAccountFor("Banke" , "1234");
        Account account = myBank.findAccount("1");
        assertEquals("Banke" ,  account.getName());
    }

    @Test
    public void test_ThatCustomerCanDeposit(){
        myBank.createAccountFor("Banke" , "1234");
        myBank.deposit(2000, "1");

        Account bankeAccount = myBank.findAccount("1");
        assertEquals(2000, bankeAccount.getBalance("1234"));
    }

    @Test
    public void testThatCustomerCanWithdrawPositiveBalance(){
        myBank.createAccountFor("Banke" , "1234");
        myBank.deposit(2000, "1");

        Account bankeAccount = myBank.findAccount("1");
        bankeAccount.withdraw(1500, "1234");
        assertEquals(500 , bankeAccount.getBalance("1234"));
    }

    @Test
    public void testThatCustomerCantWithdrawNegativeAmount(){

        myBank.createAccountFor("Banke" , "1234");
        myBank.deposit(2000, "1");

        Account bankeAccount = myBank.findAccount("1");
        bankeAccount.withdraw(-1500, "1234");
        assertEquals(2000 , bankeAccount.getBalance("1234"));
    }
}