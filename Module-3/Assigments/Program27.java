package AssignmentModule3;

/*Write a Java Program to create a custom exception if Customer withdraw amount 
  which is greater than account balance then program will show custom exception 
  otherwise amount will deduct from account balance. 
  
  Account balance is:2000 
  Enter withdraw amount:2500 
  Sorry, insufficient balance, you need more 500 Rs. 
  To perform this transaction.
*/

class MinimumAccountBalance extends Exception {

    String message;

    public MinimumAccountBalance(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return message;
    }
}

public class Program27 {

    static double current_balance = 2000;
    static double withdraw_amount = 2500;

    public static void main(String[] args) throws MinimumAccountBalance {
        
        try {
            if (current_balance < withdraw_amount) 
            {
                throw new MinimumAccountBalance("Sorry, insufficient balance."+" "+ "You need more Rs." + (withdraw_amount-current_balance)+" "+ "to perform this transaction");
            } else {
                System.out.println("Please Take The Money : " + withdraw_amount);
                System.out.println("Account Balance : " + (current_balance-withdraw_amount));
            }

        } catch (Exception e) 
        
        {
               System.out.println(e);
        }
    }

}



	