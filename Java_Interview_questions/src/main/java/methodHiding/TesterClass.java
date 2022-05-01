package methodHiding;

public class TesterClass {

	
	public static void main(String args[]) {
		
		
		//------------- No difference can be observed between overriding and hiding------------
		ParentClass pc = new ParentClass();
		pc.methodHidingTest();//warning is thrown. "Static method should be called in static way"
		pc.ordinaryMethod();
		
		ChildClass cc = new ChildClass();
		cc.methodHidingTest();////warning is thrown. "Static method should be called in static way"
		cc.ordinaryMethod();
		
		//--------------------------------------------------------------------------------------
		
		
		//++++++++++ But this one is tricky+++++++++++++++++++++++
		
		ParentClass pcc = new ChildClass();
		pcc.methodHidingTest();
		pcc.ordinaryMethod();
		
		//++++++++++++++++++++++++++++++++++++++++++++++++++++++++
		
		//ChildClass ccc = new ParentClass();//Not Allowed
	}
}
