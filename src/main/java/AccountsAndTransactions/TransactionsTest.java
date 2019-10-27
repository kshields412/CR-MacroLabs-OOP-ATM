package AccountsAndTransactions;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TransactionsTest {

    @Test
    public void depositTest(){
        Account jeff = new Account ("Jeff", "Smith", 1234);
        jeff.setChkAcctBal(100.00);
        Transactions deposit = new Transactions(jeff);
        deposit.deposit(100.0,"checking");
        Assert.assertEquals(200.0,jeff.getChkAcctBal(), 0.0);
    }


}