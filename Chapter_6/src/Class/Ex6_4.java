package Class;

public class Ex6_4 {
	public static void main(String[] args) {
		MyMath mm = new MyMath();
		long result1 = mm.add(5L,3L);
		long result2 = mm.substract(5L, 3L);
		long result3 = mm.multiply(5L, 3L);
		double result4 = mm.divide(5L, 3L);
		
		System.out.println("add(5L, 3L) = " + result1);
		System.out.println("substract(5L, 3L) = " + result2);
		System.out.println("multiply(5L, 3L) = " + result3);
		System.out.println("divide(5L, 3L) = " + result4);
	}
}

class MyMath {
	long add(long a, long b) {
		long result = a + b;
		return result;
		//return a + b;		//위의 두 줄을 이와 같이 한 줄로 간단히 할 수 있다.
	}
	long substract(long a, long b) { return a - b;}
	long multiply(long a, long b) { return a * b;}
	double divide(long a, long b) { return a / b;}
}

//사칙연산을 위한 4개의 메소드가 정의되어 있는 MyMath클래스를 이용한 예제이다. 이 예제를 통해서 클래스에 선언된 메소드를 어떻게 호출하는지 알 수 있을 것이다.
//여기서 눈여겨봐야 할 곳은 divide(double a, double b)를 호출하는 부분이다.
//divde메소드에 선언된 매개변수 타입은 double형인데, 이와 다른 long형의 값인 5L과 3L을 사용해서 호출하는 것이 가능하다.
//호출 시에 입력된 값은 메소드의 매개변수에 대입되는 값이므로, long형의 값을 double형 변수에 저장하는 것과 같아서 'double a = 5L;'을 수행했을 때와 같이 long형의 값인 5L은 double형 값인 5.0으로 자동 형변환되어 divide의 매개변수 a에 저장된다.
//그래서 divide 메소드에 두 개의 정수값(5L, 3L)을 입력하여 호출하였음에도 불구하고 연산결과가 double형의 값이 된다.