package Array;

public class Ex5_7 {
	public static void main(String[] args) {
		System.out.println("매개변수의 개수 : " + args.length);
		for (int i = 0; i < args.length; i++) {
			System.out.println("args[" + i + "] = \"" + args[i] + "\"");
		}
	}
}

//커맨드 라인에 입력된 매개변수는 공백문자로 구분하기 때문에 입력될 값에 공백이 있는 경우 큰따옴표(")로 감싸주어야 한다. 그리고 커맨드 라인에서 숫자를 입력해도 숫자가 아닌 문자열로 처리된다는 것에 주의해야 한다.
//그리고 커맨드 라인에 매개변수를 입력하지 않으면 크기가 0인 배열이 생성되어 args.length의 값은 0이 된다. 앞서 배운 것처럼 이렇게 크기가 0인 배열을 생성하는 것도 가능하다.