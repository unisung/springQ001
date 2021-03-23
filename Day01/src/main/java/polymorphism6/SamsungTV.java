package polymorphism6;

public class SamsungTV implements TV{
	public SamsungTV() {
		System.out.println("SamsungTV--객체 생성");
	}
	
//초기화 메소드
	public void initMethod() {
		System.out.println("객체 초기화 작업 처리 ...");
	}
	
	//종료시 메소드
  public void destroyMethod() {
	  System.out.println("객체 삭제 전 처리할 로직....");
  }
	
  public void turnOn() {
	  System.out.println("SamsungTV--전원 켠다.");
  }
public void turnOff() {
	 System.out.println("SamsungTV--전원 끈다.");
  }

public void soundUp() {
	 System.out.println("SamsungTV--소리 올린다.");
}
  
public void soundDown() {
	System.out.println("SamsungTV--소리 내린다.");
}

}
