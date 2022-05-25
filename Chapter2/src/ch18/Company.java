package ch18;  // ΩÃ±€≈Ê ∆–≈œ (singleton pattern)

public class Company {

	private static Company instance = new Company();
	
	private Company() {}
	
	public static Company getInstance() {
		if( instance == null ) {
			instance = new Company();
		}
		return instance;
	}
	
}
