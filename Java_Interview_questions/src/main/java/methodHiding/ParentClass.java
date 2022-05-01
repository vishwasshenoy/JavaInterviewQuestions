package methodHiding;

public class ParentClass {
	
	public static void methodHidingTest() {
		
		System.out.println("I'm Parent Method");
	}
	
	public void ordinaryMethod() {
		System.out.println("I'm Parent Ordinary");
	}
}
