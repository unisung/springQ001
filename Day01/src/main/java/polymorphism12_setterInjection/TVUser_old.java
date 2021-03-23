package polymorphism12_setterInjection;

/* spring컨테이너에 등록된 bean은 싱글톤이다. */
public class TVUser_old {
	public static void main(String[] args) {
	
	//객체 생성시 생성자(constructor)로 주입
     TV tv = new SamsungTV(new SonySpeaker(),270000);
      System.out.println(((SamsungTV)tv).getPrice());
	  tv.turnOn();
	  tv.soundUp();
	  tv.soundDown();
	  tv.turnOff();
	  
	  //
	  TV tv2 = new SamsungTV();
	  //setter메소드로 주입
	  ((SamsungTV)tv2).setSpeaker(new SonySpeaker());
	  ((SamsungTV)tv2).setPrice(2700000);
	  
	  System.out.println(((SamsungTV)tv2).getPrice());
	  tv2.turnOn();
	  tv2.soundUp();
	  tv2.soundDown();
	  tv2.turnOff();
	  
	}
}
