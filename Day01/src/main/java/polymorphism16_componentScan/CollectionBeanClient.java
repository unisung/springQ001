package polymorphism16_componentScan;

import java.util.Iterator;
import java.util.Set;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class CollectionBeanClient {

	public static void main(String[] args) {
	  AbstractApplicationContext factory
	   = new GenericXmlApplicationContext("applicationContext16.xml");
	  
	  //getBean()메소드의 리턴 타입은 Object
	  CollectionBean bean =(CollectionBean) factory.getBean("collectionBean");
	  
	  //주소 출력
	  Set<String> addressList = bean.getAddresList();
	  Iterator<String> itor = addressList.iterator();
	  while(itor.hasNext()) {
		   System.out.println(itor.next());
	  }
	  
	  //자원해제
	  factory.close();
	}

}
