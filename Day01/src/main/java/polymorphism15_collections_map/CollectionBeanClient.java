package polymorphism15_collections_map;

import java.util.Map;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class CollectionBeanClient {

	public static void main(String[] args) {
	  AbstractApplicationContext factory
	   = new GenericXmlApplicationContext("applicationContext15.xml");
	  
	  //getBean()메소드의 리턴 타입은 Object
	  CollectionBean bean =(CollectionBean) factory.getBean("collectionBean");
	  
	  //주소 출력
	  Map<String,String> addressList = bean.getAddresList();

	  for(String key:addressList.keySet()) {
		   System.out.println(key+":"+addressList.get(key));
	  }
	  
	  //자원해제
	  factory.close();
	}

}
