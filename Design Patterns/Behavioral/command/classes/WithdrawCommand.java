package command.classes;

public class WithdrawCommand implements ICommand {
	private BankAccount bankAccount;
	private int amount;
	
	public WithdrawCommand(BankAccount bankAccount, int amount) {
		this.bankAccount = bankAccount;
		this.amount = amount;
	}

	@Override
	public void execute() {
		bankAccount.withdraw(amount);
	}
}