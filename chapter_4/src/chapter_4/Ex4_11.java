package chapter_4;

public class Ex4_11 {
	public static void main(String[] args) {
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}

//똑같은 내용이 반복되는데 반복문으로 간단히 처리할 방법이 없을까?
//이럴때는 한 문장의 조건식에 숫자 대신 변수 i를 넣고, 이 문장을 i의 값이 1부터 5까지 증가하는 for문 안에 넣으면 된다.
