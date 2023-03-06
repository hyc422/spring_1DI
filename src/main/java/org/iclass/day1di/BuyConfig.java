package org.iclass.day1di;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

@Component
@ComponentScan(basePackages = "org.iclass.day1di")
public class BuyConfig 
{
	
}
// @Configuration annotation : 설정 정보를 갖는 Class
// @ComponentScan(basePackages = "org.iclass.day1di") : basePackages로 
// 지정된 package의 모든 Class를 Scan - @Component를 찾아서 bean을 만들기 위한 Scan
// 배열 형식으로 여러 package 설정 가능
// bean(Object)을 만들어서 spring container에 저장하고 관리