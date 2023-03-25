package Extends;

class Tv {
	boolean power;		//전원상태(on/off)
	int channel;		//채널
	
	void power() { power = !power;}
	void channelUp() { ++channel;}
	void channelDown() {--channel;}
}

class SmartTv extends Tv {	//StartTv는 Tv에 캡션(자막)을 보여주는 기능을 추가
	boolean caption;		//캡션상태(on/off)
	void displayCaption(String text) {
		if (caption) {		//캡션 상태가 on(true)일 때만 text를 보여 준다.
			System.out.println(text);
		}
	}
	
}

public class Ex7_1 {
	public static void main(String[] args) {
		SmartTv stv = new SmartTv();
		stv.channel = 10;						//조상 클래스로부터 상속받은 멤버
		stv.channelUp();						//조상 클래스로부터 상속받은 멤버
		System.out.println(stv.channel);
		stv.displayCaption("Hello, World!");
		stv.caption = true;						//캡션(자막) 기능을 켠다.
		stv.displayCaption("Hello, World!");
	}
}

//Tv클래스로부터 상속받고 기능을 추가하여 SmartTv클래스를 작성하였다.
//멤버변수 caption은 캡션기능의 상태(on/off)를 저장하기 위한 boolean형 변수이고, displayCaption(String text)은 매개변수로 넘겨받은 문자열(text)을 캡션이 켜져 있는 경우(caption의 값이 true인 경우)에만 화면에 출력한다.
//자손 클래스의 인스턴스를 생성하면 조상 클래스의 멤버도 함께 생성되기 때문에 따로 조상 클래스의 인스턴스를 생성하지 않고도 조상 클래스의 멤버들을 사용할 수 있다.