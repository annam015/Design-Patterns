package command.main;

import command.classes.*;

public class CommandMain {
	
	public static void main(String[] args) {
		Operator operator = new Operator();
		
		BankAccount bankAccount = new BankAccount("RO12BRDL98765423", "Alexander");

		WithdrawCommand withdrawCommand1 = new WithdrawCommand(bankAccount, 50);
		DepositCommand depositCommand1 = new DepositCommand(bankAccount, 400);
		WithdrawCommand withdrawCommand2 = new WithdrawCommand(bankAccount, 300);
		DepositCommand depositCommand2 = new DepositCommand(bankAccount, 2500);
		
		operator.addCommand(withdrawCommand1);
		operator.addCommand(depositCommand1);
		operator.addCommand(withdrawCommand2);
		operator.addCommand(depositCommand2);
		
		operator.executeCommand();
		System.out.println(bankAccount.getBalance());
		operator.executeCommand();
		System.out.println(bankAccount.getBalance());
		
		operator.undo();
		
		operator.executeCommand();	
		System.out.println(bankAccount.getBalance());
		operator.executeCommand();	
		System.out.println(bankAccount.getBalance());
	}
	
}	