package Variable;

//덧셈 뺄셈 계산하기
//사칙연산(+,-,*,/)이 포함된 식(Expression)의 결과를 화면에 출력하려면, 앞서 배운 것과 같이 괄호 안에 식을 넣기만 하면 된다.

//System.out.println(5+3);		//5+3의 결과인 8이 화면에 출력된다.

//덧셈(+) 외에도 뺄셈(-), 곱셈(*), 나눗셈(/)과 같은 연산자(operator)가 있으며, 자바는 이 외에도 다양한 종류의 연산자를 제공한다.
//한 번에 다 소개하기보다 자주 사용되는 것들을 중심으로 조금씩 소개할 것이다.

public class Ex2_3 {
	public static void main(String[] args) {
		System.out.println(5+3);	//화면에 5+3의 결과인 8을 출력된다.
		System.out.println(5-3);	//화면에 5-3의 결과인 2가 출력된다.
		System.out.println(5*3);	//화면에 5*3의 결과인 15가 출력된다.
		System.out.println(5/3);	//화면에 5/3의 결과인 1이 출력된다.
		
		//변수를 이용하면 각 변수에 다른 값만 저장하고 나머지 부분은 바꾸지 않아도 된다.
		int x = 5;	//변수에 다른 값을 저장하기만 하면 된다.
		int y = 3;	//변수에 다른 값을 저장하기만 하면 된다.
		System.out.println(x + y);
		System.out.println(x - y);
		System.out.println(x * y);
		System.out.println(x / y);
		
		//변수를 사용하지 않았을 때 보다 한결 편리하다. 이것만으로도 변수가 왜 필요한지 충분히 이해할 수 있을 것이다.
	}
}
