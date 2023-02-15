package Array;

public class Ex5_2 {
	public static void main(String[] args) {
		int sum = 0;		//총합을 저장하기 위한 변수
		float average = 0f;	//평균을 저장하기 위한 변수
		
		int[] score = {100,80,100,100,90};
		
		for (int i = 0; i< score.length; i++) {
			sum += score[i];		//반복문을 이용해서 배열에 저장되어 있는 값들을 모두 더한다.
		}
		average = sum / (float)score.length;		//계산결과를 float타입으로 얻으려 형변환
		
		System.out.println("총합 : " + sum);
		System.out.println("평군 : " + average);
	}
}

//for문을 이용해서 배열에 저장된 값을 모두 더한 결과를 배ㅕㅇㄹ의 개수로 나누어서 평균을 구하는 예제이다.
//평균을 구하기 위해 배열의 길이인 score.length로 나누었다.
//이때 int타입과 int타입 간의 연산은 int타입으로 결과로 얻기 때문에 정확한 평균값을 얻지 못하므로 score.length를 float타입으로 변환하여 나눗셈을 하였다.