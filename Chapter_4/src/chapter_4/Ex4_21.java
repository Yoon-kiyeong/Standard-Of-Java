package chapter_4;

import java.util.Scanner;

public class Ex4_21 {
	public static void main(String[] args) {
		int menu = 0, num = 0;
		Scanner scanner = new Scanner(System.in);
		
		outer:		//while문에 outer라는 이름을 붙인다.
		while(true) {
			System.out.println("(1) square");
			System.out.println("(2) square root");
			System.out.println("(3) log");
			System.out.print("원하는 메뉴 (1~3)를 선택하세요. (종료:0)> ");
			
			String tmp = scanner.nextLine();		//화면에서 입력받은 내용을 tmp에 저장
			menu = Integer.parseInt(tmp);			//입력받은 문자열(tmp)을 숫자로 변환
			
			if(menu==0) {
				System.out.println("프로그램을 종료합니다");
				break;
			} else if(!(1<=menu && menu <=3 )) {
				System.out.println("메뉴를 잘못 선택하셨습니다. (종료는 0)");
				continue;
			}
			for (;;) {
				System.out.println("계산할 값을 입력하세요 (계산 종료:0, 전체 종료:99)>");
				tmp = scanner.nextLine();			//화면에서 입력받은 내용을 tmp에 저장
				num = Integer.parseInt(tmp);		//입력받은 문자열(tmp)을 숫자로 변환
				
				if (num == 0)
					break;							//계산 종료. for문을 벗어난다.
				
				if (num == 99)
					break outer;					//전체 종료. for문과 while문을 모두 벗어난다.
				
				switch(menu) {
					case 1:
						System.out.println("resut = " + num*num);
						break;
					case 2:
						System.out.println("result = " + Math.sqrt(num));
						break;
					case 3:
						System.out.println("result = " + Math.log(num));
				}
			}//for(;;)
		}//while의 끝
	}//main의 끝
}

//이 예제는 예제 4-19를 발전시킨 것으로 메뉴를 선택하면 해당 연산을 반복적으로 수행할 수 있게 for문을 추가하였다.
//이 예제를 실행해서 다양하게 테스트한 후에 분석하면 더 이해하기 쉬울 것이다.
//아래와 같이 반복문ㅁ나 떼어놓고 보면, 무한 반복문인 while문 안에 또 다른 무한 반복문인 for문이 중첩된 구조라는 것을 알 수 있다.
//while문은 메뉴를 반복해서 선택할 수 있게 해주고, for문은 선택된 메뉴의 작업을 반복해서 할 수 있게 해준다.
//
//outer :
//	while(true) { //무한 반복문
//		...
//		for(;;) { //무한 반복문
//			...
//			if(num == 0) //계산 종료. for문을 벗어난다.
//				break;
//			if(num == 99) //전체 종료. while문을 모두 벗어난다
//				break outer;
//			...
//		} //for (;;)
//	} //while(true)

//선택된 메뉴에서 0을 입력하면 break문으로 for문을 벗어나서 다른 메뉴를 선태할 수 있게되고, 99를 입력하면 'break outer;'에 의해 for문과 while문 모두를 벗어나 프로그램이 종료된다.