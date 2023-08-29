package chain_of_responsability.classes;

public abstract class Notificator {
	private Notificator successor;
	
	public Notificator getSuccessor() {
		return this.successor;
	}
	
	public void setSuccessor(Notificator successor) {
		this.successor = successor;
	}
	
	public abstract void notify(Customer customer, String message);
}