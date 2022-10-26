package tv;

public class TV {
	// 필드
	private int channel; // 1 ~ 255 값을 가지게 하고 넘어갈 때에는 라운딩 시킬것
	private int volume;  // 0 ~ 100 값을 가지게 하고 넘어갈 때에는 라운딩 시킬것
	private boolean power;
	
	
	// getter setter
	public int getChannel() {
		return channel;
	}

	public int getVolume() {
		return volume;
	}

	public boolean isPower() {
		return power;
	}
	
	
	// 생성자
	public TV() {
	}
	public TV(int channel, int volume, boolean power) {
		this.channel = channel;
		this.volume = volume;
		this.power = power;
	}
	
	
	// 메소드
	public void status() {
		System.out.println("TV[channel = " + channel + ", volume = " + volume + ", power = " + (power ? "On" : "Off") + "]");
	}
	
	public void power(boolean power) {
		this.power = power;
	}
	
	public void volume(int volume) {
		if(volume > 100) {
			volume = 0;
			this.volume = volume;
		} else if(volume < 0) {
			volume = 100;
			this.volume = volume;
		}
		this.volume = volume;
	}
	
	public void volume(boolean up) {
		if(up) {
			if(volume == 100) {
				volume = 0;
			} else {
				volume++;
			}
		}
		else {
			if(volume == 0) {
				volume = 100;
			} else {
				volume--;
			}
		}
	}
	
	public void channel(int channel) {
		if(channel < 1) {
			channel = 255;
			this.channel = channel;
		} else if (channel > 255) {
			channel = 1;
			this.channel = channel;
		}
		this.channel = channel;
	}
	
	public void channel(boolean up) {
		if(up) {
			if(channel == 255) {
				channel = 1;
			} else {
				channel++;
			}
		}
		else {
			if(channel == 1) {
				channel = 255;
			} else {
				channel--;
			}
		}
	}
}
