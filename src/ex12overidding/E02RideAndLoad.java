package ex12overidding;

class A{
	
	public void rideMethod() {
		System.out.println("A의 rideMethod()");
	}
	
	public void lodeMethod() {
		System.out.println("A의 loadMethod()");
	}
	
}

class B extends A{
	
	@Override
	public void rideMethod() {
		System.out.println("B의 rideMethod()");
	}
	
	public void loadMethod(int num) {
		System.out.println("B의 loadMethod()");
	}
	
}

class C extends B{
	
	@Override
	public void rideMethod() {
		System.out.println("C의 rideMethod()");
	}
	
	public void loadMethod(double num) {
		System.out.println("C의 loadMethod()");
	}
	
}

public class E02RideAndLoad {
	
	public static void main(String[] args) {
		A ref1 = new C();
		B ref2 = new C();
		C ref3 = new C();
		
		System.out.println("오버라이딩 처리된 메소드");
		ref1.rideMethod();
		ref2.rideMethod();
		ref3.rideMethod();
		
		System.out.println("오버로딩 처리된 메소드");
		ref3.lodeMethod();
		ref3.loadMethod(1);
		ref3.loadMethod(1.1);
		
		ref2.lodeMethod();
		ref2.loadMethod(1);
		//ref2.loadMethod(1.1);
		
		ref1.lodeMethod();
		//ref1.lodeMethod(1);
		//ref1.lodeMethod(1.1);
	}
}
