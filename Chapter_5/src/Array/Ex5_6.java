package Array;

public class Ex5_6 {
	public static void main(String[] args) {
		String[] name = { "Kim", "Park", "Yi" };

		for (int i = 0; i < name.length; i++) 
			System.out.println("names[" + i + "]:" + name[i]);
			
		String tmp = name[2];	//배열 name의 세 번재요소를 tmp에 저장
		System.out.println("tmp : " + tmp);
		name[0] = "Yu";			//배열 name의 첫 번재 요소를 "Yu"로 변경
		
		for (int i = 0; i < name.length; i++) {
			System.out.println(name[i]);
		}
		
	}
}
