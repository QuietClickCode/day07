package cn.itcast.web.request;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.beanutils.BeanUtils;

import cn.itcast.web.domain.User;

public class Demo2 extends HttpServlet{
	public void doGet(HttpServletRequest request,HttpServletResponse response)throws IOException ,ServletException{
		/*String strUsername=request.getParameter("username");
		String strAge=request.getParameter("age");
		String strSalary=request.getParameter("salary");
		String[] strLikes=request.getParameterValues("likes");*/
		/* User user=new User();
		user.setUsername(strUsername);
		user.setAge(Integer.parseInt(strAge));
		user.setSalary(Double.parseDouble(strSalary));
		user.setLikes(strLikes); */
		BeanUtils bu=new BeanUtils();
		User user=new User();
		Enumeration<String> enums=request.getParameterNames();
		while(enums.hasMoreElements()){
			String key=enums.nextElement();
			String[] values=request.getParameterValues(key);
			try{
				
			bu.setProperty(user,key,values);
			}catch(Exception ex){
				ex.printStackTrace();
			}
			
		}
		response.setContentType("text/html;charset=UTF-8");
		PrintWriter pw=response.getWriter();
		pw.write("用户名:"+user.getUsername()+"<br/>");
		pw.write("年龄:"+user.getAge()+"<br/>");
		pw.write("期望薪水:"+user.getSalary()+"<br/>");
		pw.write("爱好个数:"+user.getLikes().length);
		pw.flush();
		pw.close();
		
	}
}