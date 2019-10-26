public class Transactions {
    /*
      needed:
      1. Deposit to acct
      2. Withdraw from acct
      3. Transfer across accounts (self)
      4. Open new account
      5. Close account (must be empty)
      6. Print transaction history
      7. Check balance
      *. Challenge: Transfer to another user's account (but not from)
     */

    //establish variables:
    private double increment;  //the amount to be changed
    private String acctType;   //the type of account being changed
    private String acctType2;  //used when a second account type is required, such as a transfer

    public void deposit(double increment, String acctType){
        //pull the amount being changed
        this.increment = increment;
        //determine which account
        this.acctType = acctType;
        //grab current balance
        //increase to the new balance
        //set the new balance in the bin
        //save to transaction history (append to list array)
    }

    public void withdraw(double increment, String acctType){
        //pull the amount being changed
        this.increment = increment;
        //determine which account
        this.acctType = acctType;
        //grab current balance
        //ensure sufficient funds
            //if sufficient
                //decrease from the old balance
                //set the new balance in the bin
                //save to transaction history (append to list array)
            //if insufficient
                //"insufficient funds" message

    }

    public void transfer(double increment, String acctType, String acctType2){
        //pull the amount being changed
        this.increment = increment;
        //determine the origin account
        this.acctType = acctType;
        //determine the origin account
        this.acctType = acctType;
        //grab current balance for both accounts
        //ensure sufficient funds
            //if sufficient
                //decrease from the origin balance
                //set the new origin balance in the bin
                //add to the destination balance
                //set the new destination balance in the bin
                //save both actions to transaction history (append to list array)
            //if insufficient
                //"insufficient funds" message
    }

/*  ignore this one - account will be created in account class
    public void newAccount(String firstName, String lastName, int pin){
        //create a new account bin containing the first three integers
        this.firstName = firstName;
        this.lastName = lastName;
        this.pin = pin;
        //then fill the remainder of the bin with default values
    }
*/

    public void closeAccount(double increment, String acctType){
        //pull the amount being changed
        this.increment = increment;
        //determine which account
        this.acctType = acctType;
        //grab current balance
        //increase to the new balance
        //set the new balance in the bin
        //save to transaction history (append to list array)
    }

    public void currentBalance(double increment, String acctType){
        //pull the amount being changed
        this.increment = increment;
        //determine which account
        this.acctType = acctType;
        //grab current balance
        //increase to the new balance
        //set the new balance in the bin
        //save to transaction history (append to list array)
    }

    public void transactionHistory(double increment, String acctType){
        //pull the amount being changed
        this.increment = increment;
        //determine which account
        this.acctType = acctType;
        //grab current balance
        //increase to the new balance
        //set the new balance in the bin
        //save to transaction history (append to list array)
    }

    /* --------------------CHALLENGE------------------------
    public void transferOtherUser(double increment, String acctType){
        //pull the amount being changed
        this.increment = increment;
        //determine which account
        this.acctType = acctType;
        //grab current balance
        //increase to the new balance
        //set the new balance in the bin
        //save to transaction history (append to list array)
   }
    -----------------------CHALLENGE---------------------*/

}
