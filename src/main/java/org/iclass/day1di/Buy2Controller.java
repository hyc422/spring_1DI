package org.iclass.day1di;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Buy2Controller 
{
	@Autowired		// 이미 만들어진 Buy2Service Object(bean) 자동 주입
	private Buy2Service service;
	
//	public Buy2Controller(Buy2Service service)
//	{
//		System.out.println("::: Buy2Controller custom constructor :::");
//		this.service = service;
//	}	// method end
	
	public Buy2Controller() 
	{
		System.out.println("::: Buy2Controller default constructor :::");
	}
	
	public void setService(Buy2Service service) 
	{
		System.out.println("--- Buy2Controller service setter ---");
		this.service = service;
	}
	public void buy()
	{
		System.out.println("--- Buy2Controller buy() method ---");
		service.buy();
	}
}	// Class end
// @ annotation ㅣ baen으로 만들어진 Class 위에 설정