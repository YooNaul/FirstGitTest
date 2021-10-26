package ex21jdbc.shopping; 

import java.util.Scanner;

import ex21jdbc.connect.IConnectImpl;


public class InsertShop extends IConnectImpl
{
	public InsertShop() {
		super(ORACLE_DRIVER, "kosmo", "1234");
	}
	@Override
	public void execute()
	{
		try {
			String query = "INSERT INTO sh_goods VALUES (?, ?, ?, ?, ?)";
			
			psmt = con.prepareStatement(query);
			
			psmt.setString(1, scanValue("일련번호:"));
			psmt.setString(2, scanValue("상품명:"));
			psmt.setString(3, scanValue("상품가격:"));
			psmt.setString(4, scanValue("등록일:"));
			psmt.setString(5, scanValue("상품코드:"));
			
			
			int affected = psmt.executeUpdate();
			System.out.println(affected +"행이 입력되었습니다");
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		finally {
			close();
		}
	}
	
	public static void main(String[] args)
	{
		new InsertShop().execute();

	}

}
