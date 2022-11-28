package Servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dto.User_1;


//注册验证
/**
 * Servlet implementation class Servlet01
 */


@WebServlet("/Servlet_yz")
public class Servlet_yz extends HttpServlet {

       
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		response.setContentType("text/html; charset=UTF-8");
		
		String username = request.getParameter("username");
		String password1 = request.getParameter("password");
		String email = request.getParameter("email");
		String name = request.getParameter("name");
		String phone = request.getParameter("tel");
		PrintWriter out = response.getWriter();
		System.out.print(username);
		
		//存值到user
		User_1 use = new User_1(username,password1,email,name,phone);
		
		Connection con = null;
		Statement sta = null;
        try {
			Class.forName("com.mysql.jdbc.Driver");
			 String url = "jdbc:mysql://localhost:3306/user?CharacterEncoding=UTF-8";
		        //user
		        String user = "root";
		        //passwrod
		        String password = "a123456";
		        //创建连接
		         con = DriverManager.getConnection(url,user,password);
		         sta = con.createStatement();
		         
		         
//		         String sql = "insert into user_1(user,password,email,name,phone)values("+"'"+username+"',"+"'"+password1+"',"+"'"+email+"',"+"'"+name+",'"+"'"+phone+"'"+");" ;
		         String sql = "insert into user_1(user,password,email,name,phone)values('"+use.getUsername()+"','"+use.getPossword()+"','"+use.getEmail()+"','"+use.getName()+"','"+use.getPhone()+"');";
//		         out.print(sql);
		         
		         int rs = sta.executeUpdate(sql);
		         
		        if(rs>0) {
		        	out.print("<center><h2><font color=\"red\">恭喜注册成功</font></h2>"+"<a href='login.jsp'><返回登录页面></a></center>");
		        	out.print("<br/>");
		        	out.print("<center>5秒后自动返回登入页面......</center>");
		        	out.print("<br/>");
		        	response.setHeader("refresh", "5;url=login.jsp");
		        }else {
		        	out.print("注册有误，请重新注册(三秒后返回注册页面)......");
		        	out.print("<br/>");
		        	response.setHeader("refresh", "3;url=zhuCe.jsp");
		        }
		        
				sta.close();
				con.close();
        }catch(Exception e) {
        	out.print("注册有误，请重新注册(三秒后返回注册页面)......");
//        	response.setHeader("refresh", "3;url=zhuCe.jsp");
		         }
       
			
			
			
			
		
		     
		
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
