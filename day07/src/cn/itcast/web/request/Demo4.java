package cn.itcast.web.request;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Demo4 extends HttpServlet{
	public void doGet(HttpServletRequest request,HttpServletResponse response)throws IOException,ServletException{
		String referer=request.getHeader("referer");
		if(referer!=null&&referer.equals("http://localhost/day07/index.html")){
			this.getServletContext().getRequestDispatcher("/download.html").forward(request,response);
		}else{
			this.getServletContext().getRequestDispatcher("/ad.html").forward(request,response);
		}
	}
}