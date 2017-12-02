package cn.itcast.web.domain;

import java.util.Map;

public class IpCheckBean{
	public String check(String ip,Map<String,String> map){
		String address=map.get(ip);
		if(address!=null){
			return address;
		}else{
			return "暂不知";
		}
	}
}