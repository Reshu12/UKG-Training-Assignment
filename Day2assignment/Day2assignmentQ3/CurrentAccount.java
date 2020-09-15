package Day2assignmentQ3;

class CurrentAccount extends Account{
	private String tradeLicenseNumber;

	public CurrentAccount(String memberName, double accountBalance, String tradeLicenseNumber) {
		super(memberName, accountBalance);
		this.tradeLicenseNumber = tradeLicenseNumber;
	}
	
	public double getBalance() {
		return this.getAccountBalance();
	}

	public void withdraw(double money) {
		if(this.getAccountBalance()>=money) {
			this.setAccountBalance(this.getAccountBalance()-money);
		}
	}
}
