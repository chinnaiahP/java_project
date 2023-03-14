package all_in_one_atm;
import java.util.*;

public class main {
	public static void main(String[] args) {
		Savings_account s = new Savings_account();
		Current_account c = new Current_account();
		int pin = 1234;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your name");
		String name = sc.nextLine();
		System.out.println("Enter your pin number");
		int pin_check = sc.nextInt();
		if(pin==pin_check) {
			System.out.println("enter your account type Savings/Current :");
			String account_name = sc.next();
			if(account_name.compareTo("Savings") == 0) {
				while(true) {
					System.out.println("Enter option 1 to view balance");
					System.out.println("Enter option 2 to deposit amount");
					System.out.println("Enter option 3 to withdraw amount");
					System.out.println("Enter option 4 to view bill statement");
					System.out.println("Enter option 5 to exit");
					System.out.println("enter your option : ");
					int option = sc.nextInt();
					if(option==5) {
						System.out.println("Thank you ,Welcome again..");
						break;
					}
					else {
					switch(option) {
					case 1:
						s.balance_enquiry();
						break;
					case 2:
						s.credit_amount();
						break;
					case 3:
						s.cash_withdraw();
						break;
					case 4:
						s.view_receipt(name.toUpperCase());
						break;
					}
					}
				}
			}
			else if(account_name.compareTo("Current") == 0) {
				while(true) {
					System.out.println("Enter option 1 to view balance");
					System.out.println("Enter option 2 to deposit amount");
					System.out.println("Enter option 3 to withdraw amount");
					System.out.println("Enter option 4 to view bill statement");
					System.out.println("Enter option 5 to exit");
					System.out.println("enter your option : ");
					int option = sc.nextInt();
					if(option==5)
						break;
					else {
					switch(option) {
					case 1:
						c.balance_enquiry();
						break;
					case 2:
						c.credit_amount();
						break;
					case 3:
						c.cash_withdraw();
						break;
					case 4:
						c.view_receipt(name.toUpperCase());
						break;
					}
					}
				}
			}
			else
				System.out.println("Invalid account name");
			
		}
		else {
			System.out.println("Wrong pin number ,Enter correct pin number! ");
			System.out.println("Thank you,Welcome again.....");
		}
			
	}

}
