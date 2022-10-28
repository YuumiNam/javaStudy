package prob3;

public abstract class Bird {
	// 필드
	protected String name;
	
	// getter setter
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	// 메소드
	public abstract void fly();
	public abstract void sing();
	public abstract String toString();
}