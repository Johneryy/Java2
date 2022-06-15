package tdd;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AccountTest {


  @Test
  public void accountCanBeCreatedTest() {
    //given i have created an account
    Account nepaAccount = new Account();
    //when i check my balance
    int balance = nepaAccount.getBalance();
    //confirm that my balance is zero
    assertEquals(0, balance);


  }


  @Test
  public void depositMoneyTest() {
    Account johnAccount = new Account();
    johnAccount.deposit(1_500);
    assertEquals(1_500, johnAccount.getBalance());
  }


  @Test
  public void depositTwice() {
    Account uselessAccount = new Account();
    uselessAccount.deposit(1_500);
    uselessAccount.deposit(2_000);
    assertEquals(3_500, uselessAccount.getBalance());
  }


  @Test
  public void withdraw() {
    Account johnnyAccount = new Account();
    johnnyAccount.withdraw(5_000);
    assertEquals(0, johnnyAccount.getBalance());
  }

  @Test
  public void withdrawAfterDeposit() {
    Account johnnyAccount = new Account();
    johnnyAccount.deposit(10_000);

    johnnyAccount.withdraw(5_000);
    assertEquals(5000, johnnyAccount.getBalance());
  }

@Test
public void withdrawNegativeValue() {
    Account johnnieAccount = new Account();
    johnnieAccount.deposit(10_000);
    johnnieAccount.withdraw(-2_000);
    assertEquals(10000,johnnieAccount.getBalance());
}



}







