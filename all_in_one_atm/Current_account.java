package all_in_one_atm;
import java.util.*;

public class Current_account {
	Scanner sc = new Scanner(System.in);
	int balance = 10000;
	int deposit = 0;
	int withdraw = 0;
	int credit = 0;
	int debit = 0;
	void balance_enquiry() {
		System.out.println("Your balance is "+balance);	
		}
	void credit_amount() {
		System.out.println("Enter the amount to credit :");
		deposit = sc.nextInt();
		balance = balance+deposit;
		credit += deposit;
		System.out.println("successfully creditted");
		
	}
	void cash_withdraw() {
		System.out.println("Enter the amount to withdraw :");
	    withdraw = sc.nextInt();
	    if(balance-withdraw >= 1000) {
	        balance = balance-withdraw;
	        debit += withdraw;
	        System.out.println("successfully debitted");
	    }
	    else
	    	System.out.println("Insufficient balance,you can't withdraw the amount");
			
	}
	void view_receipt(String name) {
		System.out.println("WELCOME TO CANARA BANK");
		System.out.println("YOUR NAME IS "+name);
		System.out.println("YOUR AVAILABLE BALANCE "+balance);
		System.out.println("YOUR DEPOSITTED AMOUNT "+credit);
		System.out.println("YOUR WITHDRAWL AMOUNT "+debit);
		System.out.println("THANK YOU FOR ACCOUNTING WITH OUR BANK...");
	}
}

