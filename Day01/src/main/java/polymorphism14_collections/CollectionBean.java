package polymorphism14_collections;

import java.util.Arrays;
import java.util.List;

public class CollectionBean {
 
	/*
	 * public CollectionBean() { addresList=Arrays.asList("서울시","수원시","광명시"); }
	 */
	
	//속성
 private List<String> addresList;
 
 

 //getters/setters
public List<String> getAddresList() {
	return addresList;
}

public void setAddresList(List<String> addresList) {
	this.addresList = addresList;
}
 
 
 
}
