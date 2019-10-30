import AccountsAndTransactions.Account;
import AccountsAndTransactions.Transactions;

public class TransactionMenu {


    //accountsMenu(Account selected) should have a parameter which specifies the account being accessed.
    //Same for transactions(Account selected)
    public static void accountsMenu(Account selected){

        TransactionMenu transactionMenu = new TransactionMenu();
        Integer inputValue = Console.getIntegerInput("Please choose which account you want to access" +
                " \n 1. Checkings \n 2. Savings \n 3. Investement \n 4. Quit ");


        switch (inputValue) {
            case 1:

                System.out.println(String.format(" Your Checking balance is $%.2f",Account.getChkAcctBal()));
                transactionMenu.transactions(selected);

                break;

            case 2:
                //System.out.println(" Your Savings balance is $" + Account.getSavAcctBal());
                System.out.println(String.format(" Your Savings balance is $%.2f",Account.getSavAcctBal()));
                transactionMenu.transactions(selected);


                break;

            case 3:
                System.out.println(String.format(" Your Investment balance is $%.2f",Account.getInvAcctBal()));
                transactionMenu.transactions(selected);

                break;

        }
    }


    public void transactions(Account selected) {
        Transactions transactionsMenu = new Transactions(selected);
        Integer inputValue = Console.getIntegerInput("Choose an option: \n 1. Deposit \n 2. Withdrawl \n 3. Transfer \n 4. Check Balance"
        );

        switch (inputValue) {
            case 1:
                transactionsMenu.deposit();
                break;

            case 2:
                //input Withdrawl method here
                break;

            case 3:
                // input Transfer method here
                break;

            case 4:

                break;
        }

    }
}