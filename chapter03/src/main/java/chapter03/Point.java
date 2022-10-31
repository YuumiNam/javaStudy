package chapter03;

import java.util.Objects;

public class Point {
	// 필드
	private int x;
	private int y;
	
	
	// 생성자
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}

	
	// equals()
//	"equals()를 오버라이드할때에는 해시코드도 같이 오버라이드해야함"  <<<  성능문제
//	객체의 내용을 비교하기 전 (동질성 비교)
//	해싱 값이 같은지 먼저 비교해야한다.
//	결론 : equals() 단독으로쓰지말고 꼭 해시코드랑 같이 오버라이드를 하자
	@Override
	public int hashCode() {
		return Objects.hash(x, y);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Point other = (Point) obj;
		return x == other.x && y == other.y;
	}
	
	
	// toString()
	@Override
	public String toString() {
		return "Point [x=" + x + ", y=" + y +"]";
	}
}
