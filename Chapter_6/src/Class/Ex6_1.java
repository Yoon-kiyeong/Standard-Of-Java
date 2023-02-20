package Class;

public class Ex6_1 {
	public static void main(String[] args) {
		Tv t;				//Tv인스턴스를 참조하기 위한 변수 t를 선언
		t = new Tv();		//Tv인스턴스를 생성한다
		t.channel = 7;		//Tv인스턴스의 멤버변수 channel의 값을 7로 한다.
		t.channelDown();	//Tv인스턴스의 메소드 channelDown()을 호출한다.
		System.out.println("현재 체널은 " + t.channel + "입니다.");
	}
}

class Tv {
	//Tv의 속성변수;
	String color;			//색상
	boolean power;			//전원변수(on/off);
	int channel;			//채널
	
	void power() {power = !power;}	//Tv를 켜거나 끄는 기능을 하는 메소드
	void channelUp() {++channel;}	//Tv의 채널을 높이는 기능을 하는 메소드
	void channelDown() {--channel;}	//Tv의 채널을 낮추는 기능을 하는 메소드
}	

//Tv클래스를 선언한 것은 Tv설계도를 작성한 것에 불과하므로, Tv인스턴스를 생성해야 제품(Tv)를 사용할 수 있다.
//클래스로부터 인스턴스를 생성하는 방법은 여러 가지가 있지만 일반적으로 다음과 같다.
//클래스명 변수명;			//클래스의 객체를 참조하기 위한 참조변수를 선언
//변수명 = new 클래스명();	//클래스의 객체를 생성 후, 객체의 주소를 참조변수에 저장
//Tv t;					//Tv클래스 타입의 참조변수 t를 선언
//t = new Tv();			//Tv인스턴스를 생성한 후, 생성된 Tv인스턴스의 주소를 t에 저장