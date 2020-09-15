package Day2assignmentQ3;

class SavingAccount extends Account {

	private double max_withdraw_limit;
	private double interest = 5;
	public SavingAccount(String memberName, double accountBalance, double max_withdraw_limit) {
		super(memberName, accountBalance);
		this.max_withdraw_limit = max_withdraw_limit;
	}
	public double getBalance() {
		return this.getAccountBalance()+interest;
	}
	public void withdraw(double money) {
		if(money<=max_withdraw_limit && this.getAccountBalance()-money >=500)
			this.setAccountBalance(this.getAccountBalance()-money);
	}
}
