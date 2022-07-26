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
    public void test_AccountCanBeCreated(){
     myBank.createAccountFor("Banke" , "1234");
     myBank.createAccountFor("James" , "1234");
     assertEquals(2, myBank.getNumberOfCustomer());
    }

    @Test
    public void testThatWeCanFindAccount(){
        myBank.createAccountFor("Banke" , "1234");
        myBank.createAccountFor("James" , "1234");
        myBank.findAccount("2");
        assertEquals("James" ,  myBank.getName());
    }
}
