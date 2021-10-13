package ex04controlstatement;

/*
for문 : while문과 같은 반복문으로 초기값, 조건식, 증김삭이
	한줄에 있어 반복의 획수를 명시적으로 알수있는 반복문이다.
	형식]
		for(초기값 ; 조건식 ; 증감식) {
			실행문;
		}
	실행순서]
		초기값 -> 조건식 확인 -> 참일때 실행 -> 증감식
			-> 조건식 확인 -> 반복실행
			-> 조건이 거짓일때 for문 탈출
 */
public class E05For {

	public static void main(String[] args) {
		
		
		/*
		for문의 실행순서
		1. 반복을 위한 변수 i를 1로 초기화
		2. 조건을 검사.
		3. 조건이 참일때 실행문을 실행한다.
		4. 증가(감소)식 실행
		5. 조건을 검사(3,4,5번을 반복횟수만큼 실행)
		6. 조건이 false면 탈출
		 */
		for(int i=1 ; i<=5 ; i++) {
			System.out.println("i="+ i);
		}
		
		/*
		시나리오] 1~100까지의 합을 구하는 프로그램을 for문을 이용하여 작성하시오.
		 */
		int sum=0;
		for(int j=1 ; j<=100 ; j++) { //1~100까지 반복
			sum += j; //증가하는 j의 값은 sum에 누적해서 더함.
		}
		System.out.println("1~100까지의 합:"+ sum);
		
		/*
		시나리오] for문을 이용하여 1~10사이의 정수중 2의배수 합을 구하는 프로그램을 작성하시오.
		 */
		//방법1 : 10번 반복해서 if문을 통해 2의배수를 찾은 후 누적합
		int total = 0;
		for(int i=1 ; i<=10 ; i++) {
			if(i%2==0) {
				total += i;
			}
		}
		System.out.println("1~10사이 2의배수의합:"+ total);
		
//		for문으로 무한루프를 만들때 사용. 일반적으로 while문을 사용함
//		int a = 1;
//		for(;;) {
//			System.out.println("나는 for문으로 만든 무한루프입니다"+ a);
//			a++;
//		}
		
		/*
		for문의 초기값은 외부(넓은지역)에서 선언하면 해당변수는 for문의
		안쪽(좁은지역)에서 사용할 수 있다. 즉 아래에 선언한 변수 i는
		main 메소드의 지역변수가 된다.
		 */
		int i=0;
		for(; i<=5 ; i++) {
			System.out.println("for문 안에서의 i값="+ i);
		}
		System.out.println("for문 밖에서의 i값="+ i);
		
		/*
		연습문제1] 구구단을 출력하는 프로그램을 for문으로 작성하시오.
		 */
		
		for(int dan=2 ; dan<=9 ; dan++) {
			for(int su=1 ; su<=9 ; su++) {
				System.out.printf("%2d*%2d=%2d ",dan,su,(dan*su));
			}
			System.out.println();
		}
		
		/*
		연습문제2] 다음의 출력결과를 보이는 for문을 작성하시오
		출력결과
			0 0 0 1
			0 0 1 0
			0 1 0 0 
			1 0 0 0
		해법 : x와 y를 더해서 5가될때 1을 출력한다
		 */
		
		for(int x=1 ; x<=4 ; x++) {
			for(int y=1 ; y<=4 ; y++) {
				if(x+y==5) {
					System.out.println("1 ");
				}
				else {
					System.out.println("0 ");
				}
			}
			System.out.println();
		}
 

	}

}
