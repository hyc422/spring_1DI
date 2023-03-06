package org.iclass.day1;

public class Day1Main 
{
	public static void main(String[] args) 
	{
		// 기존의 Object를 new 연산으로 직접 생성
		// Controller가 가장 앞단에서 요청을 처리하는 경우
		BuyDao dao = new BuyDao("JDBC");
		System.out.println(":::::::: 1. setter method로 의존관계를 설정 :::::::");
		// 1)dao Object를 service가 사용
		// 1) setter method로 전달
		// 2) 생성자로 전달
		BuyService service = new BuyService();
		service.setDao(dao);
		
		// 2)service Object를 controller가 사용하는 방법
		BuyController controller = new BuyController();
		controller.setService(service);
		controller.buy();
		
		BuyDao dao2 = new BuyDao("mybatis");
		System.out.println("\n:::::::: 2. custom constructor로 의존관계를 설정 :::::::");
		BuyService service2 = new BuyService(dao2);
		BuyController controller2 = new BuyController(service2);
		controller2.buy();
	}	// main end
	// spring에서는 1),2)에 해당하는 의존 객체를 자동으로 설정
	// 1) constructor 주입 (custom) 2)setter 주입 3) field 주입
}	// Class end
