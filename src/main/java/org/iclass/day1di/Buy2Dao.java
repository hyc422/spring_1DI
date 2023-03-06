package org.iclass.day1di;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Buy2Dao 
{	
	@Value("마이바티스")
	private String dbFactory;
	
//	public Buy2Dao(String dbFactory) 
//	{
//		System.out.println("::: Buy2Dao custom constructor :::");
//		this.dbFactory = dbFactory;
//	}	// method end

	public Buy2Dao() 
	{
		System.out.println("::: Buy2Dao default constructor :::");
	} 
	
	public void setDbFactory(String dbFactroy)
	{
		System.out.println("--- Buy2Dao String setter ---");
		this.dbFactory = dbFactroy;
	}
	
	public void buy()
	{
		System.out.println("--- Buy2Dao buy() method ---");
		System.out.println();
	}	// method end
}	// Class end
