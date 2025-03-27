package ex10accessmodifier.sub;

class DefaultClass2{
	
	void myFunc() {
		System.out.println("DefaultClass2크래스의 myFunc()메서드 호출");
	}
}


public class E01AccessModifier2 {

	private int privateVar;
	int defaultVar;
	public int publicVar;
	
	private void privateMethod() {
		privateVar = 400;
		System.out.println("privateMethod()2 메소드 호출");
	}
	
	void defaultMethod() {
		privateVar = 500;
		System.out.println("defaultMethod()2 메서드 호출");
	}
	
	public void publicMethod() {
		publicVar = 600;
		System.out.println("publicMethod()2 메서드 호출");
		privateMethod();
	}
	
	
	
	
	
}
