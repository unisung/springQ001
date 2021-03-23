package polymorphism9;

public class SamsungTV implements TV{
	//속성 
	private SonySpeaker speaker;
	
	public SamsungTV() {
		System.out.println("SamsungTV--객체 생성");
	}
	
	//생성자 의존성 주입
	public SamsungTV(SonySpeaker speaker) {
		System.out.println("SamsungTV--객체 생성");
		this.speaker=speaker;
	}
	
	//setter메소드로 의존성 주입
   public void setSpeaker(SonySpeaker speaker) {
		this.speaker = speaker;
	}

	public SonySpeaker getSpeaker() {
	return speaker;
}

	//applicationContext에 Bean으로 등록시 init-method, destroy-method 지정안하면 실행 안됨	
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
	 //System.out.println("SamsungTV--소리 올린다.");
	speaker.volumeUp();
}
  
public void soundDown() {
	//System.out.println("SamsungTV--소리 내린다.");
	speaker.volumeDown();
}

}
