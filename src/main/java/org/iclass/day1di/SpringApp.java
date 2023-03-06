package org.iclass.day1di;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SpringApp 
{
	public static void main(String[] args) 
	{	// spring-context : bean에 접근하기 위해 사용. bean => spring container에 저장
		ApplicationContext context = new AnnotationConfigApplicationContext(BuyConfig.class);
		// 실행시키면 Object 생성 확인
		// 생성된 bean 가져오기
		Buy2Controller controller = context.getBean(Buy2Controller.class);
		// instance method buy() 실행
		controller.buy();
	}	// main end
}	// Class end
// 1) constructor 주입 (custom) 
// 2)setter 주입 
// 3) default constructor와 field 주입
// field 주입할 때에는 final로 선언

// 정의된 constructor로 Object를 생성, 여러개의 constructor 중 default constructor 우선
// property 변수에 @Autowired로 bean 자동 주입 (field 주입)
// bean 정의하는 다른 방법 1)xml 2) java class에 @Bean 사용