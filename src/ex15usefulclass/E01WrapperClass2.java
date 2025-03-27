package ex15usefulclass;

public class E01WrapperClass2 {
	
	public static void main(String[] args) {
		
		String strNumber = "1000";
		System.out.println("10 + strNumber =" + ( 10 + strNumber ));
		System.out.println("10 + strNumber를 숫자로 변경 : " + (10 + Integer.parseInt(strNumber)));
		
		String money = "120원";
		//System.out.println("120원 : " + Integer.parseInt(money) );
		
		String floatString = "3.14";
		//System.out.println( Integer.parseInt(floatString));
		System.out.println("실수형(float)형으로 변경 : " + Float.parseFloat(floatString));
		System.out.println("실수형(Double)형으로 변경 : " + Double.parseDouble(floatString));
		
		/*
		 codePointAt() 
		 */
	
		System.out.println("ABCD에서 3번째 인덱스 D의 아스키코드");
		System.out.println( Character.codePointAt("ABCD", 3));
	}
	
}
