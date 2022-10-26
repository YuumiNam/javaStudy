package prob05;

public class Account {
	// 필드
	private String accountNo;
	private int balance;
	
	//생성자
	public Account() {
		System.out.println("계좌가 생성되었습니다.");
	}
	
	public Account(String accountNo) {
		this();
		this.accountNo = accountNo;
	}
	
	// getter setter
	public String getAccountNo() {
		return accountNo;
	}
	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	
	
	// 메소드
	public void save(int i) {
		balance += i;
	}
	
	public void deposit(int i) {
		balance -= i;
	}
}
