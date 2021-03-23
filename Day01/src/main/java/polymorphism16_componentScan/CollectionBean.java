package polymorphism16_componentScan;

import java.util.HashSet;
import java.util.Set;

import org.springframework.stereotype.Component;

//Bean등록 annotation
@Component("collectionBean")
public class CollectionBean {
	
public CollectionBean() {
	addresList = new HashSet<String>();
	addresList.add("서울시 강남구");
	addresList.add("서울시 마포구");
	addresList.add("수원시 영통구");
	}
	//속성
 private Set<String> addresList;
  
public Set<String> getAddresList() {
	return addresList;
}

public void setAddresList(Set<String> addresList) {
	
	this.addresList = addresList;
}
 
 
 
 
 
 
}
