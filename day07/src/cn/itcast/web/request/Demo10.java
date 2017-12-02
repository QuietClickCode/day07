package cn.itcast.web.request;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Demo10 extends HttpServlet{
	public void doGet(HttpServletRequest request,HttpServletResponse response)throws IOException,ServletException{
		String method=request.getMethod();
		System.out.println("method:"+method);
		request.getRequestDispatcher("/head.html").include(request,response);
		response.getOutputStream().write("<hr/>".getBytes());
		response.getOutputStream().write("login.html".getBytes());
		response.getOutputStream().write("<hr/>".getBytes());
		request.getRequestDispatcher("foot.html").include(request, response);
		
		
	}
	

}
