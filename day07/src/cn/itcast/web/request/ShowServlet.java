package cn.itcast.web.request;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ShowServlet extends HttpServlet{
	public void doPost(HttpServletRequest request,HttpServletResponse response)throws IOException,ServletException{
		ServletContext context=this.getServletContext();
		response.setContentType("text/html;charset=UTF-8");
		PrintWriter pw=response.getWriter();
		pw.write("欢迎:"+context.getAttribute("username")+"光临"+"<br/>");
		pw.write("你的IP是:"+context.getAttribute("ip")+"<br/>");
		pw.write("归宿地:"+context.getAttribute("address")+"<br/>");
		
	}
}