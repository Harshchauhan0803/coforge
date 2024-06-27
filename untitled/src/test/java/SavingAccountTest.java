import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;

import org.junit.jupiter.api.Test;


public class SavingAccountTest {
    SavingAccount account;
    @BeforeEach
    public void init(){
        account=new SavingAccount(1,"Harsh",70000,0.04f,4,"haryana");
    }
    @Test
    public void testGetActId(){
        Assertions.assertEquals(account.getActId(),1);
    }
    @Test
    public void testGetActName(){
        Assertions.assertEquals(account.getActName(),"Harsh");
    }
    @Test
    public void testGetBalance(){
        Assertions.assertEquals(account.getBalance(),70000);
        account.deposit(10000);
        Assertions.assertEquals(account.getBalance(),80000);

    }
    @Test
    public void testGetRate(){
        Assertions.assertEquals(account.getRate(),0.04f);
    }
    @Test
    public void testGetTime(){
        Assertions.assertEquals(account.getTime(),4);
    }
    @Test
    public void testGetLocation(){
        Assertions.assertEquals(account.getLocation(),"haryana");
    }

}
