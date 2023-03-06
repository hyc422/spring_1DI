package org.iclass.day1di;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Buy2Service 
{
	@Autowired
	private Buy2Dao dao;
	
//	public Buy2Service(Buy2Dao dao) 
//	{
//		System.out.println("::: Buy2Service custom constructor :::");
//		this.dao = dao;
//	}	// method end
	
	public Buy2Service() 
	{
		System.out.println("::: Buy2Service default constructor :::");
	}	// method end
	
	public void setDao(Buy2Dao dao) 
	{
		System.out.println("::: Buy2Service dao setter :::");
		this.dao = dao;
	}
	
	public void buy()
	{
		System.out.println("--- Buy2Service buy() method ---");
	}	// method end
}	// Class end
