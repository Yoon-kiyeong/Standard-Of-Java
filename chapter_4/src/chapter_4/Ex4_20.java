package chapter_4;

public class Ex4_20 {
	public static void main(String[] args) {
		//for문에 Loop1이라는 이름을 붙였다.
		Loop1 : for(int i=2; i<=9; i++) {
			for(int j=1;j<=9;j++) {
				if(j==5)
					break Loop1;
				System.out.println(i + "*" + j + "=" + i * j);
			}
			System.out.println();
		}	//end of Loop1 
	}
}

//구구단을 출력하는 예제이다. 제일 바깥에 있는 for문에 Loop1이라는 이름을 붙였다.
//그리고 j가 5일 때 break문을 수행하도록 했다. 반복문의 이름이 지정되지 않은 break문은 자신이 속한 하나의 반복문만 벗어날 수 있지만, 지금처럼 반복문에 이름을 붙여 주고 break문에 반복문 이름을 지정해주면 하나 이상의 반복문도 벗어날 수 있다.
//j가 5일 때 반복문 Loop1을 벗어나도록 했으므로 2단의 4번째 줄까지 밖에 출력되지 않았다. 만일 반복문의 이름이 지정되지 않은 break문이었다면 2단부터 9단까지 모두 네 줄씩 출력되었을 것이다.