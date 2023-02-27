package Class;

class Data { int x; }

public class Ex6_6 {
	public static void main(String[] args) {
		Data d = new Data();
		d.x = 10;
		System.out.println("main() : x = " + d.x);
		
		change(d.x);
		System.out.println("After change(d.x)");
		System.out.println("main() : x = " + d.x);
	}
	
	static void change (int x) {	//기본형 매개변수
		x = 1000;
		System.out.println("change() : x = " + x);
	}
}

//1. change 메소드가 호출되면서 'd.x'가 change메소드의 매개변수 x에 복사됨
//2. change 메소드에서 x의 값을 1000으로 변경
//3. change 메소드가 종료되면서 매개변수 x는 스택에서 제거됨
//'d.x'의 값이 변경된 것이 안리ㅏ, change메소드의 매개변수 x의 값이 변경된것이다.
//즉, 원본이 아닌 복사본이 변경된 것이 아니라 원본에는 아무런 영향을 미치지 못한다.
//이처럼 기본형 매개변수는 변수에 저장된 값만 있을 뿐 변경할 수는 없다.