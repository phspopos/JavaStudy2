package ex13interface;

abstract class PersonalNumberStorageAbs {
	public abstract void addPersonalInf( String juminNum, String name );
	public abstract String searchPersonalInfo( String juminNum );
}

class PersonalInfoDTO{
	
	private String name;
	private String juminNum;
	
	//멤버변수 선언 후 자동생성 하세요
	public PersonalInfoDTO( String name, String juminNUm ) {
		this.name = name;
		this.juminNum = juminNUm;
	}
	
	public String getName() {
		return name;
	}
	
	public String getJuminNum() {
		return juminNum;
	}
	
	public void setName( String name ) {
		this.name = name;
	}
	
	public void setJuminNum( String juminNum ) {
		this.juminNum = juminNum;
	}
		
}

class PersonalNumberStorageExt extends PersonalNumberStorageAbs {
	
	PersonalInfoDTO[] personalArr;
	int numOfPerInfo;
	
	public PersonalNumberStorageExt( int arrSize ) {
		personalArr = new PersonalInfoDTO[ arrSize ];
		numOfPerInfo = 0;
	}
	
	@Override
	public void addPersonalInf( String juminNum, String name ) {
		personalArr[ numOfPerInfo ] = new PersonalInfoDTO( name, juminNum );
		numOfPerInfo++;
	}
	
	@Override
	public String searchPersonalInfo( String juminNum ) {
		
		for( int i = 0; i < numOfPerInfo; i++ ) {
			if( juminNum.compareTo( personalArr[i].getJuminNum()) == 0 ) {
				return personalArr[i].getName();
			}
		}		
		return null;
	}	
	
}


public class E02AbstractToInterface1 {

	public static void main(String[] args) {
		
		PersonalNumberStorageExt storage = 
				new PersonalNumberStorageExt(10);
		
		storage.addPersonalInf("901234-2222222", "김태희");
		storage.addPersonalInf("901234-1111111", "정지훈");
		
		System.out.println( storage.searchPersonalInfo("901234-2222222"));
		System.out.println( storage.searchPersonalInfo("901234-1111111"));
		System.out.println( storage.searchPersonalInfo("001024-1090333"));
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
