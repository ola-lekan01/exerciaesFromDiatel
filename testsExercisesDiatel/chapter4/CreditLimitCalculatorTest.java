package chapter4;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

public class CreditLimitCalculatorTest {

    private StoreLimitCalculator lake;
    private StoreLimitCalculator james;
    private StoreLimitCalculator banke;
    private StoreLimitCalculator customers;

    @BeforeEach
    void setUp(){
        lake = new StoreLimitCalculator(153654735,2000, 2000,5000,1000);
        james = new StoreLimitCalculator();
        james.setAccountNumber(25635373);
        james.setStartingBalance(5000);
        james.setTotalItemCharged(2000);
        james.setCreditLimit(5000);
        james.setAllowedCreditLimit(1000);
        banke = new StoreLimitCalculator(38736457,1500,3000,10000,2000);
    }

    @Test
    @DisplayName("To Test That Object Exist")
    void testThatObjectExist(){
        assertNotNull(lake);
    }

    @Test
    @DisplayName("Test for Starting Balance for Object 1")
    void testForStartingBalanceForObject1(){
        assertEquals(4000, lake.getStartingBalance());
    }

    @Test
    @DisplayName("Test for Starting Balance for Object 2")
    void testForStartingBalanceForObject2(){
        james.setStartingBalance(5000);
        assertEquals(5000, james.getStartingBalance());
    }

    @Test
    @DisplayName("To Test That we can calculate Balance For James")
    void toTestThatWeCanCalculateBalanceForJames(){

        james.calculateBalance();
        assertEquals(2000 , james.getStartingBalance());
    }

    @Test
    @DisplayName("To Test That we can calculate Balance For Lake")
    void toTestThatWeCanCalculateBalanceForLake(){
        lake.calculateBalance();
        assertEquals(-1000 , lake.getStartingBalance());
    }

    @Test
    @DisplayName("To Test That we can calculate Balance For Banke")
    void toTestThatWeCanCalculateBalanceForBanke(){
        banke.calculateBalance();
        assertEquals(-5500 , banke.getStartingBalance());
    }

    @Test
    @DisplayName("Check That the Customer Credit is Exceeded")
    void checkIfCheckCreditLimitIsExceeded(){
        banke.calculateBalance();
        assertFalse(banke.isCreditLimitExceeded());
    }
    @Test
    public void main(){
        StoreLimitCalculator [] customer = {banke , lake , james};
        for(int i = 0; i < customer.length; i++) {
             customers = customer[i];
            if(customers.isCreditLimitExceeded()){
                System.out.printf("Your account Number is: %d%n" , customers.getAccountNumber() );
                System.out.println("Credit Limit Exceeded");
                System.out.println();
            }
            else {
                System.out.printf("Your account Number is: %d%n ", customers.getAccountNumber());
                System.out.println("You have a credit Limit Balance Remaining");
                System.out.println();
            }
        }
    }

}
