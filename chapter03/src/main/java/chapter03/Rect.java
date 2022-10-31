package chapter03;

import java.util.Objects;

public class Rect {
	// 필드
	private int width;
	private int height;
	
	public Rect(int width, int height) {
		this.width = width;
		this.height = height;
	}

	// equals()
	@Override
	public int hashCode() {
		return Objects.hash(height, width);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Rect other = (Rect) obj;
		return height == other.height && width == other.width;
	}

	// toString()
	@Override
	public String toString() {
		return "Rect [width=" + width + ", height=" + height + "]";
	}
}
