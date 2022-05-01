package methodHiding;

public class ChildClass extends ParentClass {
	
	public static void methodHidingTest() {
		
		System.out.println("I'm Child Method");
		
	}
	public void ordinaryMethod() {
		System.out.println("I'm Child Ordinary");
	}

}
