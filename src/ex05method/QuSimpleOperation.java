package ex05method;
/*
두개의 정수를 입력받아서 사칙연산의 결과를 출력하는
 메소드와 main메소드를 작성해보자.
 단 나눗셈은 몫과 나머지를 각각 출력해야 한다.
파라메타로 전달되는 두 숫자는 모두 0 이상의 양의 정수이다.
*/
import java.util.Scanner;

public class QuSimpleOperation {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("첫번째 숫자:");
		int x = scanner.nextInt();
		System.out.print("두번째 숫자:");
		int y = scanner.nextInt();
		arithmetic(x, y);
	}
	//반환값은 없고, 매개변수만 있는 메소드
	static void arithmetic(int x,int y) {
		System.out.println("덧셈:"+(x+y));
		System.out.println("뺄셈:"+(x-y));
		System.out.println("곱셈:"+x*y);
		System.out.println("나눗셈:"+x/y);
		System.out.println("나머지:"+x%y);
	}

}
