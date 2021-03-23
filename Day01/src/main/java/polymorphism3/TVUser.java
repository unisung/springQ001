package polymorphism3;

public class TVUser {
	public static void main(String[] args) {
	 //제어의 역전현상
	BeanFactory factory = new BeanFactory();
	  TV tv = (TV)factory.getBean(args[0]);
	  tv.turnOn();
	  tv.soundUp();
	  tv.soundDown();
	  tv.turnOff();
	  
    //자신이 상속받은 클래스 대입
	  tv = new SamsungTV();
	//다른패지키(다른 부모)에서 상속받은 클래스 대입 - 안됨  
	 // tv = new polymorphism2.SamsungTV();
	  
	}
}
