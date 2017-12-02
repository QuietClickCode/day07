package cn.itcast.web.request;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Demo5 extends HttpServlet{
	public void doPost(HttpServletRequest request,HttpServletResponse response)throws IOException,ServletException{
		request.setCharacterEncoding("UTF-8");
		String username=request.getParameter("username");
		String password=request.getParameter("password");
		String gender=request.getParameter("sex");
		String[] likes=request.getParameterValues("likes");
		String upfile=request.getParameter("upfile");
		String city=request.getParameter("city");
		String message=request.getParameter("message");
		String id=request.getParameter("id");
		
		
		
		System.out.println("username:"+username);
		System.out.println("password:"+password);
		System.out.println("gender:"+gender);
		System.out.println("likes:"+likes.length);
		System.out.println("upfile:"+upfile);
		System.out.println("city:"+city);
		System.out.println("message:"+message);
		System.out.println("id:"+id);
	}
}
