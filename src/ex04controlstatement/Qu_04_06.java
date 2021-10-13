package ex04controlstatement;

public class Qu_04_06 {

	public static void main(String[] args) {
		
		int x=0;
		
		while(x<=5) {
			int y=0;
			while(y<=x) {
				System.out.printf("* ");
				y++;
			}
			System.out.println();
			x++;
		}
	}
}

