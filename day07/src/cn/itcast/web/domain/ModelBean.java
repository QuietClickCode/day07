package cn.itcast.web.domain;

public class ModelBean {
	public boolean validate(String username){
		boolean flag=false;
		if(username!=null&&username.matches("[a-zA-Z0-9]+")){
			flag=true;
		}
		return flag;
	}
}
