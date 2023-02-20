package Class;

public class Ex6_2 {
	public static void main(String[] args) {
		Tv t1 = new Tv();
		Tv t2 = new Tv();
		System.out.println("t1의 channel값은 " + t1.channel + "입니다");
		System.out.println("t2의 caannel값은 " + t2.channel + "입니다");
		
		t1.channel = 7;
		System.out.println("t1의 channel값을 7로 변경하였습니다.");
		
		System.out.println("t1의 channel값은 " + t1.channel + "입니다");
		System.out.println("t2의 channel값은 " + t2.channel + "입니다");
	}
}

//같은 클래스로부터 생성되었을지다로 각 인스턴스의 속성(멤버변수)은 서로 다른 값을 유지할 수 있으며, 메소드의 내용은 모든 인스턴스에 대해 동일하다.
//(참조 : 참조변수 t1이 가리키고(참조하고) 있는 인스턴스를 간단히 인스턴스 t1이라고 했다.)