package cn.itcast.web.request;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import cn.itcast.web.domain.IpCheckBean;

public class LoginServlet extends HttpServlet{
	private Map<String,String> map=new HashMap<String,String>();
	public void init()throws ServletException{
		map.put("192,168,0,1","北京");
		map.put("192,168,0,2","天津");
		map.put("192,168,0,3","广州");
		map.put("0:0:0:0:0:0:0:1","重庆");
	}
	public void doPost(HttpServletRequest request,HttpServletResponse response)throws IOException ,ServletException{
		request.setCharacterEncoding("UTF-8");
		String username=request.getParameter("username");
		String ip=request.getRemoteAddr();
		IpCheckBean ipCheckBean=new IpCheckBean();
		String address=ipCheckBean.check(ip,map);
		ServletContext context=this.getServletContext();
		context.setAttribute("ip",ip);
		context.setAttribute("address",address);
		context.setAttribute("username",username);
		context.getRequestDispatcher("/ShowServlet").forward(request,response);
	}
}