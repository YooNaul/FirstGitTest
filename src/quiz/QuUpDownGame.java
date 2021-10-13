package quiz;

import java.util.Random;
import java.util.Scanner;

/*
컴퓨터는 1~100사이의 숫자 하나를 생성한다.
총 시도횟수는 7번을 부여한다.
사용자는 7번의 시도안에 숫자를 맞춰야 한다.
사용자가 숫자를 입력했을때 컴퓨터는 높은지/낮은지 알려준다.
7번안에 맞추면 성공, 맞추지 못하면 실패라고 출력한다.
성공/실패 후 계속 할지를 물어보고 1이면 게임 재시작, 0이면 프로그램을 종료한다.
함수를 사용하여 구현한다.
무한루프에 빠지게 된다면 scan.nextLine()을 활용하여 
버퍼에 남아있는 Enter키를 제거해주도록 하자.

 */
class NumberRangeException {
	
}
public class QuUpDownGame
{

	public static void main(String[] args)
	{
		while(true) {
			Random random = new Random();
			Scanner scanner = new Scanner(System.in);
			int restart;
			int user = 0;
			int com = (int)(Math.random()*100)+1;
			
			for(int i=1 ; i<=7 ; i++) {
				try {
					System.out.println("1부터 100까지 숫자를 입력하세요");
					user = scanner.nextInt();
				}
				catch(Exception e) {
					scanner.nextLine();
					System.out.println("[예외처리]문자는 입력하면 안돼요");
				}
				if(user>com) {
					System.out.println("다운");
				}
				else if(user<com) {
					System.out.println("업");
				}
				else {
					System.out.println("정답");
					
					break;
				}
			}
			while(true) {
				System.out.print("게임재시작(1), 종료(0):");
				restart = scanner.nextInt();
				if(restart==0) {
					return;
				}
				else if(restart==1) {
					System.out.println("재시작");
					break;
				}
				else {
					System.out.println("잘못입력해씸ㅜㅜ\n");
				}
			}
		}
	}

}
