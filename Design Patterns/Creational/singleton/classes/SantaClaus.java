package singleton.classes;

public class SantaClaus {
	
	// Thread Safe Singleton

	private int age;	
	private static SantaClaus instance = null;
	
	private SantaClaus(int age) {
		this.age = age;
	}
	
	public static synchronized SantaClaus getInstance(int age) {
		if(instance == null) {
			instance = new SantaClaus(age);
		}
		else {
			System.out.println("There is only one Santa Claus and he is already spreading joy around the world!");
		}
		return instance;
	}
	
	public void getAge() {
		System.out.println("Santa Claus is " + this.age + " years old.");
	}
	
}