package Class;

public class Ex6_3 {
	public static void main(String[] args) {
		System.out.println("Card.width = " + Card.width);
		System.out.println("Card.height = " + Card.height);
		
		Card c1 = new Card();
		c1.kind = "heart";
		c1.number = 7;
		
		Card c2 = new Card();
		c2.kind = "Spade";
		c2.number = 4;
		
		System.out.println("c1은 " + c1.kind + ", " + c1.number + "이며, 크기는 (" + c1.width + "," + c1.height + ")");
		System.out.println("c2는 " + c2.kind + ", " + c2.number + "이며, 크기는 (" + c2.width + "," + c2.height + ")");
		System.out.println("c1의 width와 height를 각각 50, 80으로 변경합니다");
		
		c1.width = 50;
		c1.height = 80;
		
		System.out.println("c1은 " + c1.kind + ", " + c1.number + "이며, 크기는 (" + c1.width + "," + c1.height + ")");
		System.out.println("c2는 " + c2.kind + ", " + c2.number + "이며, 크기는 (" + c2.width + "," + c2.height + ")");	
	}
}

class Card {
	String kind;
	int number;
	static int width = 100;
	static int height = 250;
}

//Card클래스의 클래스 변수(static 변수)인 width, height는 Card클래스의 인스턴스를 생성하지 않고도 '클래스이름.클래스 변수'와 같은 방식으로 사용할 수 있다.
//Card인스턴스인 c1과 c2는 클래스 변수인 width와 height를 공유하기 때문에, c1의 width와 height를 변경하면 c2의 width와 height값도 바뀐 것과 같은 결과를 얻는다.
//Card.width, c1.width, c2.width는 모두 같은 저장공간을 참조하므로 항상 같은 값이다.
//클래스 변수를 사용할 때는 Card,width와 같이 '클래스이름.클래스변수'의 형태로 하는 것이 좋다.
//참조변수 c1, c2를 통해서도 클래스 변수를 사용할 수 있지만 이렇게 하면 클래스 변수를 인스턴스 변수로 오해하기 쉽기 때문이다.