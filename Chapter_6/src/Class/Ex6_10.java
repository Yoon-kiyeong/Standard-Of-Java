package Class;

public class Ex6_10 {
	public static void main(String[] args) {
		MyMath3 mm = new MyMath3();
		System.out.println("mm.add(3, 3) 결과 : " + mm.add(3,3));
		System.out.println("mm.add(3L, 3) 결과 : " + mm.add(3L, 3));
		System.out.println("mm.add(3, 3L) 결과 : " + mm.add(3, 3L));
		System.out.println("mm.add(3L, 3L) 결과 : " + mm.add(3L,3L));
		
		int[] a = {100, 200, 300};
		System.out.println("mm.add(a) 결과 : " + mm.add(a));
	}
}

class MyMath3 {
	int add(int a, int b) {
		System.out.print("int add(int a, int b) - ");
		return a + b;
	}
	
	long add(int a, long b) {
		System.out.print("long add(int a, long b) - ");
		return a + b;
	}
	
	long add(long a, int b) {
		System.out.print("long add(long a, int b) - ");
		return a + b;
	}
	
	long add(long a, long b) {
		System.out.print("long add(long a, long b) - ");
		return a + b;
	}
	
	int add(int[] a) {	//배열의 모든 요소의 합을 결과로 돌려준다.
		System.out.print("int add(int[] a) - ");
		int result = 0;
		for(int i = 0; i < a.length; i++)
			result += a[i];
		
		return result;
	}
}

//실행결과를 보면 어떻게 add메소드가 println메소드보다 먼저 호출되는지 의아할 수 있다.
//System.out.println("mm.add(3, 3) 결과 : " + mm.add(3,3));
//간단히 위의 문장이 아래의 두 문장을 하나로 합친 것이라고 생각하면 이해가 쉬울 것이다.
//int result = mm.add(3,3);
//System.out.println("mm.add(3,3) 결과 : " + result);