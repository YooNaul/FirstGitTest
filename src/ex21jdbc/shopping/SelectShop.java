package ex21jdbc.shopping;

import java.sql.SQLException;
import java.sql.Statement;

import ex21jdbc.connect.IConnectImpl;
import ex21jdbc.statement.SelectQuery;


public class SelectShop extends IConnectImpl
{
	protected Statement stmt;
	public SelectShop() {
		super(ORACLE_DRIVER, "kosmo", "1234");
	}
	@Override
	public void execute()
	{
		try {
			stmt = con.createStatement();
			
			String query = "SELECT g_idx, goods_name, goods_price, "
					+ " to_char(regidate, 'yyyy.mm.dd hh24:mi'), p_code "
					+ " FROM sh_goods ";
			
			rs = stmt.executeQuery(query);
			
			while(rs.next()) {
				String g_idx = rs.getString(1);
				String goods_name = rs.getString("goods_name");
				String goods_price = rs.getString("goods_price");
				java.sql.Date regidate = rs.getDate("regidate");
				String p_code = rs.getString("p_code");
				
				
				System.out.printf("%s %s %s %s %s\n",
						g_idx, goods_name, goods_price, regidate,
						p_code);
			}
		}
		catch(SQLException e) {
			System.out.println("쿼리오류발생");
			e.printStackTrace();
		}
		finally {
			close();
		}
	}

	public static void main(String[] args)
	{
		SelectShop selectShop = new SelectShop();
		selectShop.execute();

	}

}
