package polymorphism8;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

/* spring컨테이너에 등록된 bean은 싱글톤이다. */
public class TVUser {
	public static void main(String[] args) {
	 //제어의 역전현상
	 //1. Spring컨테이너 구동.
	AbstractApplicationContext factory=new GenericXmlApplicationContext("applicationContext5.xml");
		
	//2. Spring 컨테이너로 부터 필요한 객체 요청.	
	  TV tv = (TV)factory.getBean("tv");// 객체가 만들어지는 시점은 spring컨테이너가 구동되는 시점
	  tv.turnOn();
	  tv.soundUp();
	  tv.soundDown();
	  tv.turnOff();
	  System.out.println("tv-hashCode: "+tv.hashCode()+","+System.identityHashCode(tv));
	  
	  TV tv2 =(TV)factory.getBean("tv");//
	  tv2.turnOn();
	  tv2.soundUp();
	  tv2.soundDown();
	  tv2.turnOff();
	  System.out.println("tv2-hashCode: "+tv2.hashCode()+","+System.identityHashCode(tv2));
	  
	  //3.Spring 컨테이너 종료.
	  factory.close();
	  
	}
}
