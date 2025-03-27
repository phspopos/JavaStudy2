package ex14innerclass;

class Unit{
	
	private String name;
	private int healPoint;
	
	Marine marine;
	Medic medic;
	
	public Unit( String name, int healPoint ) {
		this.name = name;
		this.healPoint = healPoint;
		marine = new Marine();
	}
	
	public String infoStr() {
		return "유닛정보[ 이름 : " + name + ", 체력 : "  + healPoint + "]";
	}
	
	class Marine {
		
		int attackPower;
	
		public void attak() {
			System.out.println( infoStr() + "\n마린이 공격한다.");
		}
	}
	
	class Medic {
		int healPower;
		
		public void heal() {
			System.out.println( infoStr() + "\n메딕이 치료한다.");
		}
	}	
	
}

public class E01InnerClassMain {

	public static void main(String[] args) {
		
		Unit unit = new Unit( "커맨드센터", 1000 );
		System.out.println( unit.infoStr() );
		
		Unit.Marine marine = new Unit("마린", 50).marine;
		marine.attak();
		
		Unit.Medic medic = new Unit("메딕", 30).new Medic();
		medic.heal();
		
	}
}
