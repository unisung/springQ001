package polymorphism6;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class TVUser {
	public static void main(String[] args) {
	 //제어의 역전현상
	 //1. Spring컨테이너 구동.
	AbstractApplicationContext factory=new GenericXmlApplicationContext("applicationContext3.xml");
		
	//2. Spring 컨테이너로 부터 필요한 객체 요청.	
	  TV tv = (TV)factory.getBean("tv");
	  tv.turnOn();
	  tv.soundUp();
	  tv.soundDown();
	  tv.turnOff();
	  
	  //3.Spring 컨테이너 종료.
	  factory.close();
	  
	}
}
