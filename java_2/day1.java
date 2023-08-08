import java.util.*;

public class BankAccount {
	
	String accountNumber = "0";
	String holderName = "0";
	Integer accountBalance = 0;

	public BankAccount(String accountNum, String holder) {
		accountNumber = accountNum;
		holderName = holder;
	}

	public void deposit(Integer depositAmount) {
		accountBalance += depositAmount;
	}

	public void withDraw(Integer withdrawalAmount) throws Exception {
		if(accountBalance < withdrawalAmount) {
			throw new Exception("Insufficient Balance");
		}
		accountBalance -= withdrawalAmount;
	}

	public void displayInfo() {
		System.out.println("Account Number: " + accountNumber);

		System.out.println("Account Holder Name: " + holderName);

		System.out.println("Account Balance: " + accountBalance);
	}

  public static void main(String[] args) {
    BankAccount b = new BankAccount("1234","abc");
    b.displayInfo();
    b.deposit(100);
    b.displayInfo();
    try {
      b.withDraw(150);
    } catch(Exception e) {
      System.out.println(e);
    }
    b.displayInfo();
  }
  
}