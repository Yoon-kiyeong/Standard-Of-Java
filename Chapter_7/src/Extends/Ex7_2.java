package Extends;

public class Ex7_2 {
	public static void main(String[] args) {
		Child c = new Child();
		c.method();
	}
}

class Parent { int x = 10;} /*super.x */

class Child extends Parent {
	int x = 20;	//this.20;
	
	void method() {
		System.out.println("x = " + x);
		System.out.println("this.x = " + this.x);
		System.out.println("super.x = " + super.x);
	}
}

//위의 예제에서 Child클래스는 조상인 Parent클래스로부터 x를 상속받는데, 공교롭게도 자신의 멤버인 x와 이름이 같아서 이 둘을 구분할 방법이 필요하다.
//바로 이럴 때 사용하는 것ㄹ이 super이다.