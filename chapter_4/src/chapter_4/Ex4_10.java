package chapter_4;

public class Ex4_10 {
	public static void main(String[] args) {
		int sum = 0;		//합계를 저장하기 위한 변슈
		
		for(int i=1; i<=5; i++) {
			sum += i;
			System.out.printf("1���� %2d ������ ��: %2d%n", i ,sum);
		}
	}	//
}

//1부터 5까지의 합을 구하는 예제이다. 변수 i를 1부터 5까지 변화시키면서 i를 sum에 계속 더해서 누적시킨다.