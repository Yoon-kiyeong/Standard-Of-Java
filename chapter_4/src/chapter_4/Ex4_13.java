package chapter_4;

public class Ex4_13 {
	public static void main(String[] args) {
		int i = 5;
		
		while(i--!=0) {
			System.out.println(i + " - I can do it");
		}
	}
}

//변수 i의 값만큼 블럭{}을 반복하는 예제이다. i의 값이 5이므로 'I can do it'이 모두 5번 (4~0) 출력되었다.
//while문의 조건식 'i--!=0'는 i의 값이 0이 아닌 동안만 참이 되고, i의 값이 매 반복마다 1씩 감소하다 0이 되면 조건식은 거짓이 되어 while문을 벗어난다.
//'i--'가 후위형이므로 조건식이 평가된 후에 i의 값이 감소한다는 점에 주의하자. 예를 들어, i의 값이 1일 때는 조건식이 참으로 평가된 후에 i의 값이 1 감소되어 0이 된다.
//그래서 실행 결과에서 i의 값이 5~1이 아닌 4~0으로 출력된 것이다.
