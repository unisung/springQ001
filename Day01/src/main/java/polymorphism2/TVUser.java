package polymorphism2;

public class TVUser {
	public static void main(String[] args) {
	 //정상적인 제어
	  TV tv = new LgTV();//인터페이스를 구현한 실체를 대입
	  tv.turnOn();
	  tv.soundUp();
	  tv.soundDown();
	  tv.turnOff();
	  
	}
}
