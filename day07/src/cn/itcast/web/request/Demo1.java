package cn.itcast.web.request;

import java.io.IOException;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Demo1 extends HttpServlet{
	public void doGet(HttpServletRequest request,HttpServletResponse response)throws IOException,ServletException{
		String acceptLanguage=request.getHeader("Accept-Language");
		String userAgent=request.getHeader("User-Agent");
		String host=request.getHeader("Host");
		response.setContentType("text/html;charset=UTF-8");
		response.getWriter().write("Accept-Language:"+acceptLanguage+"<br/>");
		response.getWriter().write("User-Agent:"+userAgent+"<br/>");
		response.getWriter().write("Host:"+host+"<br/>");
		response.getWriter().write("<hr/>");
		Enumeration<String> enums1=request.getHeaderNames();
		while(enums1.hasMoreElements()){
			String key=enums1.nextElement();
			Enumeration<String> enums2=request.getHeaders(key);
			while(enums2.hasMoreElements()){
				String value=enums2.nextElement();
				response.getWriter().write(key+":"+value+"<br/>");
			}
		}
		
	}
}