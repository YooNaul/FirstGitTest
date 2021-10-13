//주석 : 컴파일러가 코드를 컴파일할때 대상에서 제외하는 문구를 말한다.
package ex01start;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class E01Javastuct {

	public static void main(String[] args) {
		
		//오늘 날짜를 Date클래스를 통해 출력하기
		Date ToDayOfDate = new Date();
		System.out.println("오늘날짜:"+ ToDayOfDate);
		/*
		SimpleDateFormat 클래스를 이용하여 우리가 흔히 사용하는
		날짜포맷인 년-월-일 시:분:초 형태로 변환한후 출력한다.
		 */
		SimpleDateFormat simple =
				new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String toDayString = simple.format(ToDayOfDate);
		System.out.println("변형된 날짜:"+ toDayString);

	}

}
