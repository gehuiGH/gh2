package Filter;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet Filter implementation class Filter01
 */
@WebFilter("/*")
public class Filter01 extends HttpFilter implements Filter {
       
   
   
	public void destroy() {
		// TODO Auto-generated method stub
	}

	/**
	 * @see Filter#doFilter(ServletRequest, ServletResponse, FilterChain)
	 */
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		response.setContentType("text/html; charset=UTF-8");
		request.setCharacterEncoding("UTF-8");
		PrintWriter out = response.getWriter();
		HttpServletRequest request1 = (HttpServletRequest)request;  //向下转型
		HttpServletResponse response1 = (HttpServletResponse)response;
		String Path = request1.getServletPath();

//		System.out.print(past);
		
		if("/LoginServlet".equals(Path) || "/login.jsp".equals(Path) || "/zhuCe.jsp".equals(Path) || "/Servlet_yz".equals(Path) || Path.contains("/img")) {
		chain.doFilter(request, response);
	}else {
		HttpSession session = request1.getSession();
		Object st = session.getAttribute("use");
		if(st!=null) {
			chain.doFilter(request, response);
		}else {
			out.print("你还未登入，请登入后再访问该网页哦~~");
			out.print("<br/>");
			out.print("3秒后自动返回登入页面......");
        	out.print("<br/>");
        	response1.setHeader("refresh", "3;url=login.jsp");
		}
	}
	}

	/**
	 * @see Filter#init(FilterConfig)
	 */
	public void init(FilterConfig fConfig) throws ServletException {
		// TODO Auto-generated method stub
	}

}
