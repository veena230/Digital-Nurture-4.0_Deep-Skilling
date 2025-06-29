package com.example.bank;

import static org.junit.Assert.*;
import org.junit.*;

public class BankAccountTest {

    private BankAccount account;

    @BeforeClass
    public static void beforeAll() {
        System.out.println(">>> Starting BankAccount tests");
    }

    @AfterClass
    public static void afterAll() {
        System.out.println(">>> Finished BankAccount tests");
    }

    @Before
    public void setUp() {
   
        account = new BankAccount(100);
    }

    @After
    public void tearDown() {
        System.out.println("Test completed.");
    }

    @Test
    public void testDeposit() {
       
        account.deposit(50);

    
        assertEquals(150, account.getBalance());
    }

    @Test
    public void testWithdrawWithSufficientFunds() {
     
        boolean result = account.withdraw(40);

        assertTrue(result);
        assertEquals(60, account.getBalance());
    }

    @Test
    public void testWithdrawWithInsufficientFunds() {
       
        boolean result = account.withdraw(200);

   
        assertFalse(result);
        assertEquals(100, account.getBalance());
    }
}
