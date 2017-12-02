package cn.itcast.web.request;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
 
public class Demo7 extends HttpServlet {
	public void doGet(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException {
		
		String username = request.getParameter("username");
		
		//中文解码
		byte[] buf = username.getBytes("ISO8859-1");
		username = new String(buf,"UTF-8");
		
		if(username!=null || username.trim().length()>0){
			response.setContentType("text/html;charset=UTF-8");
			response.getWriter().write("用户名" + username);
		}
	}
}
