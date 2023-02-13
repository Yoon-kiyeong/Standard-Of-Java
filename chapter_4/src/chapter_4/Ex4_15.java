package chapter_4;

import java.util.Scanner;

public class Ex4_15 {
	public static void main(String[] args) {
		int num = 0 , sum = 0;
		System.out.println("숫자를 입력하세요.(예:12345)> ");
		
		Scanner scanner = new Scanner(System.in);		
		String tmp = scanner.nextLine();				//화면을 통해 입력받은 내용을 tmp에 저장
		num = Integer.parseInt(tmp);					//입력받은 문자열(tmp)을 숫자로 변환
		
		while(num!=0) {
			//num을 10으로 나눈 나머지를 sum에 더함
			sum += num % 10;							//sum = sum + num%10;
			System.out.printf("sum=%3d num=%d%n", sum,num);
			
			num /= 10;									//num = njum / 10;	num을 10으로 나눈 값을 다시 num에 저장
		}
		 System.out.println("각 자리수의 합: " + sum);
	}
}

//사용자로부터 숫자를 입력받고, 이 숫자의 각 자리의 합을 구하는 예제이다.
//실행 결과에서 알 수 있듯이 12345를 입력하면, 결과는 15(1+2+3+4+5=15)이다.
//어떤 수를 10으로 나눈 나머지 연산하면 마지막 자리를 얻을 수 있다. 그리고 10으로 나누면 마지막 한 자리가 제거된다.
//12345 % 10 -> 5
//12345 / 10 -> 1234
//그래서 입력 받은 숫자 num을 0이 될 때까지 반복해서 10으로 나누어 가면서, 10으로 나머지 연산을 하면 num의 모든 자리를 얻을 수 있다.
//num의 값은 'num/=10'에 의해 한자리씩 줄어들다가 0이 되면, while문의 조건식이 거짓이 되어 반복을 멈춘다.