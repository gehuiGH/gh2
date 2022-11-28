package Servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class loginServlet
 */
@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String use = request.getParameter("use");
		String pwd = request.getParameter("pwd");
		PrintWriter out = response.getWriter();
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
		         String sql = "select * from user_1 where password="+"'"+pwd+"';";
				int flag=0;
				ResultSet eq= sta.executeQuery(sql);  // 查询结果返回字符集
				if(use == null) {
					out.print("你还未登入，请登入后再访问该网页哦~~");
					out.print("<br/>");
					out.print("5秒后自动返回登入页面......");
		        	out.print("<br/>");
		        	response.setHeader("refresh", "5;url=login.jsp");
				}
				while(eq.next()){
					if(use.equals(eq.getString("user"))  || use.equals(eq.getString("phone")) ) {
					request.getSession().setAttribute("use",use);
					response.setHeader("refresh", "0.1;url=index2.jsp");
					flag=1;
					}
				}
				//如果账号密码不匹配则
				if(flag ==  0)	{
				out.print("<center><h2><font color=\"red\">账号密码不匹配，请稍后再试~~~</font></h2>"+"<a href='login.jsp'><返回登录页面></a></center>");
				out.print("<br/>");
				out.print("<center>5秒后自动返回登入页面......</center>");
	        	out.print("<br/>");
	        	response.setHeader("refresh", "5;url=login.jsp");
				}
							
					eq.close();
					sta.close();
					con.close();		
        }catch(Exception e) {
        	
        	
        }
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
