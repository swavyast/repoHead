package mL_Responsive;


import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import mL_Responsive.util.JdbcUtil;


@WebServlet(name = "logIn", urlPatterns = "/login")
public class Login extends HttpServlet{
	Connection con=null;
	Statement st=null;
	ResultSet rs = null;
	int uid;
	String uname;
	String email;
	String concode;
	long phone;
	String pass;
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		try {
		email=req.getParameter("uname");
		pass=req.getParameter("pwd");
		con=JdbcUtil.getOracleConnect();
		st=con.createStatement();
//		try {
		String query="select * from useml where mumail='"+email+"'";
		rs= st.executeQuery(query);
		while(rs.next()) {
			uid=rs.getInt(1);
			uname=rs.getString(2);
			email=rs.getString(3);
			concode=rs.getString(4);
			phone=rs.getLong(5);
		}
		System.out.println("Hello "+uname+" Welcome to marketListing...\n");
		System.out.println("UID\t: "+uid);
		System.out.println("Name\t: "+uname);
		System.out.println("Email-ID\t: "+email);
		System.out.println("Contact No.\t: "+concode+"-"+phone);
		}catch(NullPointerException e) {e.printStackTrace();//}
		}catch (SQLException e) {
			e.printStackTrace();
		}catch (Exception e) {
			throw new RuntimeException("Unhandled Exception!");
		}finally {
			JdbcUtil.cleanup(rs, st, con);
		}
	}

	@Override
	public void destroy() {

	}

	@Override
	public void init(ServletConfig config) throws ServletException {

	}

}

