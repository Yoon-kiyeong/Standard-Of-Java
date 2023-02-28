package Class;

class MyMath2 {
	long a, b;
	
	long add() { return a + b;}
	long substract() { return a - b;}
	long multiply() { return a * b;}
	double divide() { return a / b;}
	
	static long add( long a, long b) { return a + b;}	//a, b는 지역변수
	static long substract( long a, long b) { return a - b;}
	static long multiply( long a, long b) { return a * b;}
	static double divide( long a, long b) { return a / b;} 
}

public class Ex6_9 {
	public static void main(String[] args) {
		//클래스는 메소드 호출. 인스턴스 생성없이 호출가능
		System.out.println(MyMath2.add(200L, 100L));
		System.out.println(MyMath2.substract(200L,100L));
		System.out.println(MyMath2.multiply(200L,100L));
		System.out.println(MyMath2.divide(200L,100L));
		
		MyMath2 mm = new MyMath2();		//인스턴스를 생성
		mm.a = 200L;
		mm.b = 100L;
		//인스턴스 메소드는 객체생성 후에만 호출이 가능함
		System.out.println(mm.add());
		System.out.println(mm.substract());
		System.out.println(mm.multiply());
		System.out.println(mm.divide());
	}
}

//인스턴스메소드인 add(), substract(), multiply(), divide()는 인스턴스변수인 a와 b만으로도 충분히 작업이 가능하기 때문에, 매개변수를 필요로 하지 않으므로 괄호()에 매개변수를 선언하지 않았다.
//반면에 add(long a, long b), substract(long a, long b) 등은 인스턴스 변수 없이 매개변수 만으로 작업을 수행하기 때문에 static을 붙여서 클래스 메소드로 선언하였다.
//그래서 Ex6_9의 main메소드에서 보면, 크래스메소드는 객체생성업싱 바로 호출이 가능했고, 인스턴스메소드는 MyMath2클래스의 인스턴스를 생성한 후에야 호출이 가능했다.
