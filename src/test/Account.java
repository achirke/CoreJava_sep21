package test; 
 public class Account {

	
	private int balance;
	private int AccountNumber;
	
	private String AccountHolderename;
	public char[] getBalance;
	
	
	public int getBalance() {
		return balance;
	}

	public int getAccountNumber() {
		return AccountNumber;
	}

	public void setAccountNumber(int accountNumber) {
		AccountNumber = accountNumber;
	}

	public String getAccountHolderename() {
		return AccountHolderename;
	}

	public void setAccountHolderename(String accountHolderename) {
		AccountHolderename = accountHolderename;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

}
