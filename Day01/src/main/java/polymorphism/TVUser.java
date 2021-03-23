package polymorphism;

public class TVUser {
	public static void main(String[] args) {
	 //정상적인 제어
	  SamsungTV tv = new SamsungTV();
	  tv.turnOn();
	  tv.soundUp();
	  tv.soundDown();
	  tv.turnOff();
	  
	  
	  LgTV lgtv = new LgTV();
	  lgtv.turnOn();
	  lgtv.soundUp();
	  lgtv.soundDown();
	  lgtv.turnOff();
	}

}
