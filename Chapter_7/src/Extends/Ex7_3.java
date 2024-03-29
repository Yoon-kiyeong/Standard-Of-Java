package Extends;

public class Ex7_3 {
	public static void main(String[] args) {
		Child2 c = new Child2();
		c.method();
	}
}

class Parent2 { int x = 10;}	//super.x와 this.x 둘 다 가능

class Child2 extends Parent2 {
	void method() {
		System.out.println("x = " + x);
		System.out.println("this.x = " + this.x);
		System.out.println("super.x = " + super.x);
	}
}

//모든 인스턴스 메소드에는 this와 super가 지역변수로 존재하는데, 이 들에는 자신이 속한 인스턴스의 주소가 자동으로 저장된다.
//조상의 멤버와 자신의 멤버를 구별하는데 사용된다는 점만 제외하면 this와 super는 근본적으로 같다.