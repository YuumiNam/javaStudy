package paint;

public class GraphicText implements Drawable {
	// 필드
	private String text;
	
	// 생성자
	public GraphicText() {
	}
	
	public GraphicText(String text) {
		this.text = text;
	}
	
	@Override
	public void draw() {
		System.out.println(text + " 를 그렸습니다.");
		
	}
}
