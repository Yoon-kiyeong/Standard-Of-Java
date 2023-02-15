package chapter_4;

public class Ex4_12 {
	public static void main(String[] args) {
		for(int i=1;i<=10;i++) {
			System.out.println(i);
		}
		
		int i=1;		//초기화
		while(i<=10) {	//조건식
			System.out.println(i);
			i++;		//증감식
		}
//		위의 두 코드는 완전히 동일하다
//		for문은 초기화, 조건식, 증감식을 한 곳에 모아 놓은 것일 뿐, wnile문과 다르지 않다. 그래서 for문과 while문은 항상 서로 변환이 가능하다.
	}
}


//for문에 비해 while문은 구조가 간단하다. if문처럼 조건식과 불럭{}만으로 이루어져 있다.
//다만 if문과 달리 while문은 조건식이 '참(true)인 동안', 즉 조건식이 거짓이 될 때까지 블럭{} 내의 문장을 반복한다.
//while (조건식) {
//	조건식의 연산결과가 참(true)인 동안, 반복될 문장들을 적는다.
//}
//1.조건식이 참(true)이면 블럭{}안으로 들어가고, 거짓(false)이면 while문을 벗어난다. 
//2.블럭{}의 문장을 수행하고 다시 조건식으로 돌아간다.

