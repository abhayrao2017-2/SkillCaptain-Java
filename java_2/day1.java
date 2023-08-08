import java.util.*;

public class Amount {
	public Integer amount;
}

public class WithdrawalAmount extends Amount {

}

public class DepositAmount extends Amount {
	
}


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

	public void changeBalance(WithdrawalAmount w) {
		try {
      withDraw(w.amount);
    } catch(Exception e) {
      System.out.println(e);
    }
	}

	public void changeBalance(DepositAmount d) {
		deposit(d.amount);
	}

  public static void main(String[] args) {
    BankAccount b = new BankAccount("1234","abc");
    b.displayInfo();
    DepositAmount d = new DepositAmount();
    d.amount = 100;
    b.changeBalance(d);
    b.displayInfo();
    try {
      b.withDraw(150);
    } catch(Exception e) {
      System.out.println(e);
    }
    b.displayInfo();
  }
  
}