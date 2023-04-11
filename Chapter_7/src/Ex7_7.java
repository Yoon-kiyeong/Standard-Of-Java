public class Ex7_7 {
	public static void main(String[] args) {
		Car car = null;
		FireEngine fe = new FireEngine();
		FireEngine fe2 = null;
		
		fe.water();
		car = fe;	//car = (Car)fe;에서 형변환이 생략됨
		//car.watar();	//컴파일 에러. Car타입의 참조변수로는 water()를 호출할 수 없다.
		fe2 = (FireEngine)car; //자손타입 <- 조상타입. 형변환 생략 불가
		fe2.water();
	}
}

class Car {
	String color;
	int door;
	
	void drive() {	//운전하는 기능
		System.out.println("drive, Brrrr~~~");
	}
	
	void stop() {	//멈추는 기능
		System.out.println("stop!!!");
	}
}

class FireEngine extends Car {	//소방차
	void water() {	//물을 뿌리는 기능
		System.out.println("water!!!");
	}
}

//참조변수 fe의 값을 car에 저장해서 car로도 FireEngine인스턴스를 다룰 수 있게 되었다.
//다만 참조변수 fe와 달리 car로는 FireEngine인스턴스의 멤버 중 4개만 사용 가능하다.