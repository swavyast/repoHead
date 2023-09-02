package mL_Responsive.util;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class JdbcUtil {

public static Connection getOracleConnect(){
	Connection con=null;
	try {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:ML", "system", "Delphic92");
	} catch (Exception e) {
		 throw new RuntimeException("unhandled exception", e);
	}
	return con;
}
public static Connection getMysqlConnect() {
	Connection con=null;
	try {
		Class.forName("com.mysql.cj.jdbc.driver");
		con=DriverManager.getConnection("jdbc:mysql://localhost/3306/ml", "root", "Him@nshu@1992");
	} catch (Exception e) {
		throw new RuntimeException("unhandled exception", e);
	}
	return con;
}
public static void cleanup(Statement st, Connection con) {
	try {
	if(st!=null) {
		st.close();
	}
	if(con!=null) {
		con.close();
	}
	} catch(Exception e){
		throw new RuntimeException("unhandled exception", e);
		}
	}
public static void cleanup(ResultSet rs, Statement st, Connection con) {
	try {
	if(rs!=null) {
		rs.close();
	}
	if(st!=null) {
		st.close();
	}
	if(con!=null) {
		con.close();
	}
	} catch(Exception e){
		throw new RuntimeException("unhandled exception", e);
		}
	}


}
