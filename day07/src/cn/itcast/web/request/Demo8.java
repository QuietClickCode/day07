package cn.itcast.web.request;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import cn.itcast.web.domain.ModelBean;

public class Demo8 extends HttpServlet {
	public void doGet(HttpServletRequest request,HttpServletResponse response)throws IOException,ServletException{
		request.getRequestDispatcher("/WEB-INF/view.html").forward(request, response);
	}
	public void doPost(HttpServletRequest request,HttpServletResponse response)throws IOException,ServletException{
		request.setCharacterEncoding("UTF-8");
		String username=request.getParameter("username");
		ModelBean modelBean=new ModelBean();
		boolean flag=modelBean.validate(username);
		if(flag){
			request.getRequestDispatcher("/WEB-INF/success.html").forward(request,response);
		}else{
			
			request.getRequestDispatcher("/WEB-INF/fail.html").forward(request,response);
		}
	}

}
