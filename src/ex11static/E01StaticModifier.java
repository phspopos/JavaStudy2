package ex11static;

class MyStatic{
	
	int instanceVar;
	static int staticVar;
	
	void instanceMethod() {
		System.out.println("instanceVar = " + instanceVar);
		System.out.println("staticVar = " + staticVar);
		staticMethod();
	}
	
	static void staticMethod() {
		//System.out.println("instanceVar = " + instanceVar);
		System.out.println("staticVar = " + staticVar);
		//instanceMethod();
	}	
	
}

public class E01StaticModifier {

	public static void main(String[] args) {
		MyStatic myStatic = new MyStatic();
		myStatic.instanceVar = 100;
		System.out.println("myStatic.instanceVar = " + myStatic.instanceVar);
		
		MyStatic.staticVar = 200;
		System.out.println("MyStatic.staticVar = " + MyStatic.staticVar);
		
		MyStatic.staticVar = 300;
		System.out.println("myStatic.staticVar = " + myStatic.staticVar);
		
		//////////////////////////////////////
		System.out.println("===================");
		
		MyStatic ms1 = new MyStatic();
		MyStatic ms2 = new MyStatic();
			
		ms1.instanceVar = 100;
		ms2.instanceVar = 1000;
		System.out.println("ms1.instance = " + ms1.instanceVar);
		System.out.println("ms2.instance = " + ms2.instanceVar);
		
		ms1.staticVar = 800;
		ms2.staticVar = 900;
		System.out.println("ms1.staticVar = " + ms1.staticVar);
		System.out.println("ms2.staticVar = " + ms2.staticVar);
		
		System.out.println("-----------------------");
		
		myStatic.instanceMethod();
		myStatic.staticMethod();
		
		
		
	}
}
