package chapter_4;

import java.util.Scanner;

public class Ex4_6 {
	public static void main(String[] args) {
		System.out.println("���� ���� �Է��ϼ��� .> ");

		Scanner sc = new Scanner(System.in);
		int month = sc.nextInt(); // 화면을 통해 입력받은 숫자를 input에 저장

		switch (month) {
		case 3:
		case 4:
		case 5:
			System.out.println("현재의 계절은 봄입니다");
			break;
		case 6:
		case 7:
		case 8:
			System.out.println("현재의 계절은 여름입니다");
			break;
		case 9:
		case 10:
		case 11:
			System.out.println("현재의 계절은 가을입니다");
			break;
		case 12:
		case 1:
		case 2:
			System.out.println("현재의 계절은 겨울입니다");
			break;
		}
	}	
}
