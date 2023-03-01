package Class;

class Ex6_14 {
	static {	//클래스 초기화 블럭
		System.out.println("static { }");
	}
	
	{	//인스턴스 초기화 블럭
		System.out.println("{ }");
	}
	
	public Ex6_14() {
		System.out.println("생성자");
	}

	public static void main(String[] args) {
		System.out.println("ex6_14 bt = new Ex6_14(); ");
		Ex6_14 bt = new Ex6_14();
		
		System.out.println("Ex6_14 bt2 = new Ex6_14(); ");
		Ex6_14 bt2 = new Ex6_14();
	}
}

//예제가 실행되면 Ex6_14이 메모리에 로딩될 때, 클래스 초기화 블럭이 가장 먼저 수행되어 'static {}'이 화면에 출력된다.
//그 다음에 main메소드가 수행되어 Ex6_14의 인스턴스가 생성됨녀서 인스턴스 초기화 블럭이 먼저 수행되고, 끝으로 생성자가 수행된다.
//위의 실행결과에서도 알 수 있듯이 클래스 초기화 블럭은 처음 메모리에 로딩될 때 한번만 수행되었지만, 인스턴스 초기화 블럭은 인스턴스가 생성될 때 마다 수행되었다.