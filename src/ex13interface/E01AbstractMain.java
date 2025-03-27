package ex13interface;

abstract class AbsClass1{
	
	public static final int MAX_INT = Integer.MAX_VALUE;
	
	void instanceMethod() {}
	static void staticMethod() {}
	
}

class AbsClassChild1 extends AbsClass1{
	
	@Override
	void instanceMethod() {
		System.out.println("선택적 오버라이딩");
	}	
}

abstract class AbsClass2{
	abstract void absMethod( int number );
}

class AbsClassChild2 extends AbsClass2{
	
	@Override
	void absMethod( int number ) {
		System.out.println("필수 오버라이딩");
	}
	
	void newMethod() {
		System.out.println("확장한 메소드");
	}
}

public class E01AbstractMain {

	public static void main(String[] args) {
		
		//AbsClass1 absClass1 = new AbsClass1();
		AbsClassChild1 absClassChild1 = new AbsClassChild1();
		
		AbsClass2 absClass2 = new AbsClassChild2();
		absClass2.absMethod(100);
		( (AbsClassChild2)absClass2 ).newMethod();
		
		AbsClass1.staticMethod();
		AbsClassChild1.staticMethod();
		System.out.println("int형의 최대값 : " + AbsClass1.MAX_INT);
		
		
		
		
		
		
		
		
		
	}
}
