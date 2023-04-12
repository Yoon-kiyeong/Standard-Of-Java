class Product2 {
	int price;		//제품의 가격
	int bonusPoint;	//제품구매 시 제공하는 보너스점수

	Product2(int price) {
		this.price = price;
		bonusPoint = (int)(price/10.0);
	}
	
	Product2() {}
}

class Tv2 extends Product2 {
	Tv2() { super(100); }
	
	public String toString() { return "tv"; }
}

class Computer2 extends Product2 {
	Computer2() { super(200); }
	public String toString() { return "Computer"; }
}

class Audio2 extends Product2 {
	Audio2() { super(50); }
	public String toString() { return "Audio"; }
}

class Buyer2 {
	int money = 1000;
	int bonusPoint = 0;
	Product2[] cart = new Product2[10];
	int i = 0;
	
	void buy(Product2 p) {
		if(money < p.price) {
			System.out.println("잔액이 부족하여 물건을 살 수 없습니다.");
			return;
		}
		
		money -= p.price;
		bonusPoint += p.bonusPoint;
		cart[i++] = p;
		System.out.println(p + "을/를 구입하셨습니다.");
	}
	
	void summary() {
		int sum = 0;
		String itemList = "";
		
		//반복문을 이용해서 구입한 물품의 총 가격과 목록을 만든다.
		for(int i = 0; i < cart.length; i ++) {
			if(cart[i]==null) break;
			sum += cart[i].price;
			itemList += cart[i] + ", ";
		}
		System.out.println("궁비하신 물품의 총금액은 " + sum + "만원입니다");
		System.out.println("구빙하신 제품은 " + itemList + "입니다");
	}
}

public class Ex7_9 {
	public static void main(String[] args) {
		Buyer2 b = new Buyer2();
		
		b.buy(new Tv2());
		b.buy(new Computer2());
		b.buy(new Audio2());
		b.summary();
	}
}

//(참고 : 구입한 제품목록의 마지막에 출력되는 콤마(.)가 눈에 거슬린다면, itemList += cart[i] + ", ";를 itemList += (i==0) ? "" + cart[i]:", " + cart[i];과 같이 변경하자)

//위 예제에서 Product2배열로 구입한 제품들을 저장할 수 있도록 했지만, 배열의 크기를 10으로 했기 때문에 11개 이상의 제품을 구입할 수 없는 것이 문제다.
//그렇다고 해서 배열의 크기를 무조건 크게 설정할 수만도 없는 일이다.
//이런 경우, Vector클래스를 사용하면 된다. Vector클래스는 내부적으로 Object타입의 배열을 가지고 있어서, 이 배열에 객체를 추가하거나 제거할 수 있게 작성되어 있다.
//그리고 배열의 크기를 알아서 관리해주기 때문에 저장할 인스턴스의 개수에 신경 쓰지 않아도 된다.

//public class Vector extends AbstractList implements List, Cloneable, java.io.Serializable {
//protected Object elementData[];
//...
//}

//Vector클래스는 이름 때문에 클래스의 기능을 오해할 수 있는데, 단지 동적으로 크기가 관리되는 객체배열일 뿐이다.