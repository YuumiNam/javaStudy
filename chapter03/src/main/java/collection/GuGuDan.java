package collection;

import java.util.Objects;

public class GuGuDan {
	// 필드
	private int left;
	private int right;
		
	// 생성자
	public GuGuDan(int left, int right) {
		this.left = left;
		this.right = right;
	}
	
	// toString
	@Override
	public String toString() {
		return "GuGuDan [left=" + left + ", right=" + right + "]";
	}

	// equals (중복제거)
	@Override
	public int hashCode() {
//		return Objects.hash(left, right);
		return Objects.hash(left * right); // 2x3과 3x2를 같은걸로 판단하도록
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		GuGuDan other = (GuGuDan) obj;
//		return left == other.left && right == other.right;
		return left*right == other.left * other.right; // 2x3과 3x2를 같은걸로 판단하도록
	}
}
