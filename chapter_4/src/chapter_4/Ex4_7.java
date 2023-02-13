package chapter_4;

public class Ex4_7 {
	public static void main(String[] args) {
		int num = 0;
		
		// 괄호{}안의 내용을 5번 반복한다
		for (int i = 1; i<= 5; i++)  {
			num = (int)(Math.random() * 6) + 1;
			System.out.println(num);
		}
	}
}

//Math.random()을 사용했기 때문에 실행할 때마다 실행결과가 달라진다. 반복문 for를 이용해서 1과 6사이의 임의의 수를 얻어 출력하는 일을 5번 반복한다.
