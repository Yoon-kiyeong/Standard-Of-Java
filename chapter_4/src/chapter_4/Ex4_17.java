package chapter_4;

public class Ex4_17 {
	public static void main(String[] args) {
		int sum = 0;
		int i = 0;
		
		while (true) {
			if(sum > 100)
				break;
			++i;
			sum += i;
		} //end of while
		
		System.out.println("i=" + i);
		System.out.println("sum=" + sum);
	}
}

//앞서 switch문에서 break문에 대해 배운 것 처럼 반복문에서도 break문을 사용할 수 있는데, switch문에서 그랬던 것처럼, break문은 자신이 포함된 가장 가까운 반복문을 벗어난다.
//주로 if문과 함께 사용되어 특정 조건을 만족할 때 반복문을 벗어나게 한다.

//숫자를 1부터 계속 더해 나가서 몇까지 더하면 합이 100을 넘는지 알아내는 예제이다.
//i의 값을 1부터 1씩 계속 증가시켜가며 더해서 sum에 저장한다. sum의 값이 100을 넘으면 if문의 조건식이 참이므로 break문이 수행되어 자신이 속한 반복문을 즉시 벗어난다.
//이처럼 무한 반복문에는 조건문과 break문이 항상 같이 사용된다. 그렇지 않으면 무한이 반복되기 때문에 프로그램이 종료되지 않을 것이다.