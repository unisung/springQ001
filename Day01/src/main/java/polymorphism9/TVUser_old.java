package polymorphism9;

/* spring컨테이너에 등록된 bean은 싱글톤이다. */
public class TVUser_old {
	public static void main(String[] args) {
	
	//객체 생성시 생성자(constructor)로 주입
     TV tv = new SamsungTV(new SonySpeaker());
	  tv.turnOn();
	  ((SamsungTV)tv).getSpeaker().volumeUp();
	  ((SamsungTV)tv).getSpeaker().volumeDown();
	  tv.turnOff();
	  
	  //
	  TV tv2 = new SamsungTV();
	  //setter메소드로 주입
	  ((SamsungTV)tv2).setSpeaker(new SonySpeaker());
	  
	  tv2.turnOn();
	  ((SamsungTV)tv2).getSpeaker().volumeUp();
	  ((SamsungTV)tv2).getSpeaker().volumeDown();
	  tv2.turnOff();
	  
	}
}
