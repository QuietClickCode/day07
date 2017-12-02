package cn.itcast.web.cookie;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Demo11 extends HttpServlet {
	public void doGet(HttpServletRequest request,HttpServletResponse response)throws IOException ,ServletException{
		/*Cookie cookie=new Cookie("username","haha");
		cookie.setMaxAge(86400);
		response.addCookie(cookie);*/
		Cookie[] cookies=request.getCookies();
		Cookie usernameCookie=null;
		if(cookies!=null){
			for(Cookie c:cookies){
				if(c.getName().equals("username")){
					usernameCookie=c;
					break;
				}
			}
			if(usernameCookie!=null){
				System.out.println("Cookie的名字:"+usernameCookie.getName());
				System.out.println("Cookie的值:"+usernameCookie.getValue());
				System.out.println("Cookie的生命:"+usernameCookie.getMaxAge());
				System.out.println("Cookie的路径:"+usernameCookie.getPath());
				
			}
		}
	}

}
