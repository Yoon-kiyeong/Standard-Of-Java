package Array;

public class Ex5_8 {
	public static void main(String[] args) {
		int[][] score = {
				{ 100, 100, 100},
				{ 20, 20, 20 },
				{ 30, 30, 30 },
				{ 40, 40, 40 }
		};
		int sum = 0;
		
		for (int i = 0; i < score.length; i++) {
			for (int j = 0; j < score[i].length; j++) {
				System.out.printf("score[%d][%d]=%d%n", i , j , score[i][j]);
				
				sum += score[i][j];
			}
		}
		
		System.out.println("sum = " + sum);
	}
}

//2차원 배열 score의 모든 요소의 합을 구하고, 출력하는 예제이다.
//2차원 배열은 '배열의 배열'로 구성되어 있다. 즉, 여러 개의 1차원 배열을 묶어서 또 하나의 배열로 만든 것이다.
//배열 참좁녀수 score가 참조하고 있는 배열의 길이가 얼마인가를 세어보면 될 것이다.
//정답은 4이다. 그리고 score[0].length은 배열 참조변수 score[0]이 참조하고 있는 배열의 길이이므로 3이다.
//같은 이유로 score[1].legnth, score[2].length, score[3].length의 값 역시 모두 3이다.