package Array;

import java.util.Arrays;

public class Ex5_4 {
	public static void main(String[] args) {
		int[] numArr = {0,1,2,3,4,5,6,7,8,9};
		System.out.println(Arrays.toString(numArr));
		
		for (int i = 0; i < 100; i++) {
			int n = (int)(Math.random() * 10);		//0 ~ 9 중의 한 값을 임의로 얻는다.
			int tmp = numArr[0];
			numArr[0] = numArr[n];
			numArr[n] = tmp;
		}
		System.out.println(Arrays.toString(numArr));
	}
}

//길이가 10인 배열 numArr을 생성하고 0 ~ 9의 숫자로 차례대로 초기화하여 출력한다. 그 당므 random()을 이용해서 배열의 임의의 위치에 있는 값과 배열의 첫 번째 요소 'numArr[0]'의 값을 교환하는 일을 100번 반복해서 배열의 요소가 뒤섞이게 한다.
