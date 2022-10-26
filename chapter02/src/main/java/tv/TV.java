package tv;

public class TV {
	// 필드
	private int channel; // 1 ~ 255 값을 가지게 하고 넘어갈 때에는 라운딩 시킬것
	private int volume;  // 0 ~ 100 값을 가지게 하고 넘어갈 때에는 라운딩 시킬것
	private boolean power;
	
	public void status() {
		System.out.println("TV[channel=" + channel + ", volume =" + volume + ", power =" + (power ? "On" : "Off") + "]");
	}
	
}
