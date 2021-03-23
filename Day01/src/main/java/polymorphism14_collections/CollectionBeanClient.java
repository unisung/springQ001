package polymorphism14_collections;

import java.util.List;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class CollectionBeanClient {

	public static void main(String[] args) {
	  AbstractApplicationContext factory
	   = new GenericXmlApplicationContext("applicationContext14.xml");
	  
	  //getBean()메소드의 리턴 타입은 Object
	  CollectionBean bean =(CollectionBean) factory.getBean("collectionBean");
	  
	  //주소 출력
	  List<String> addressList = bean.getAddresList();
	  for(String address:addressList) {
		    System.out.println(address);
	  }
	  
	  //자원해제
	  factory.close();
	}

}
