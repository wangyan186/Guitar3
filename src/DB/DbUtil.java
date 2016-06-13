package DB;



import java.sql.*;

public class DbUtil {

	public static Connection getSqliteConnection(){ 
		String driver="org.sqlite.JDBC";
		String conStr="jdbc:sqlite://d:/Guitar.db";
		Connection conn=null;
		try{
			Class.forName(driver);
			conn = DriverManager.getConnection(conStr);
		}catch(Exception e){
			e.printStackTrace();
		}
		return conn;			
	}

	
	public static Connection getMySqlConnection(){
		String driver="com.mysql.jdbc.Driver";
		String conStr="jdbc:mysql://localhost:3306/Guitars";
		Connection conn=null;
		try{
			Class.forName(driver);
			conn = DriverManager.getConnection(conStr,"admin","123456");
		}catch(Exception e){
			e.printStackTrace();
		}
		return conn;			
	}
	
}
