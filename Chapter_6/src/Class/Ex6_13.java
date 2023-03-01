package Class;

class Car2 {
	String color;			//색상
	String gearType;		//변속기 종류 - auto(자동), manual(수동)
	int door;				//문의 개수
	
	Car2() {
		this("white","auto", 4);	//Car2(String color, String gearType, int door)를 호출
	}
	
	Car2(String color) {
		this(color,"auto",4);		//Car2(String color, String gearType, int door)를 호출
	}
	
	Car2(String color, String gearType, int door) {
		this.color = color;
		this.gearType = gearType;
		this.door = door;
	}
}

public class Ex6_13 {
	public static void main(String[] args) {
		Car2 c1 = new Car2();
		Car2 c2 = new Car2("blue");
		
		System.out.println("c1의 color = " + c1.color + ", gearType = " + c1.gearType + ", door = " + c1.door);
		System.out.println("c2의 color = " + c2.color + ", gearType = " + c2.gearType + ", door = " + c2.door);
	}
}

//생성자 Car2()에서 또 다른 생성자 Car2(String color, String gearType, int door)를 호출하였다.
//이처럼 생성자간의 호출에는 생성자의 이름 대신 this를 상요해야만 하므로 'Car2' 대신 'this'를 사용했다. 그리고 생성자 Car2()의 첫째 줄에서 호출하였다는 점을 유의할 것
//같은 클래스 내의 생성자들은 일반적으로 서로 관계가 깊은 경우가 많아서 이처럼 서로 호출하도록 하여 유기적으로 연결해주면 더 좋은 코드를 얻을 수 있다.
//그리고 수정이 필요한 경우에 보다 적은 코드만을 변경하면 되므로 유지보수가 쉬워진다.