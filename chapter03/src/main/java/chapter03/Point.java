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

//	동질성 개념에서
//	동일한 객체는 동일한 메모리 주소를 갖는다는 것을 의미하므로
//	동일한 객체는 동일한 해시코드를 가져야 한다.
//	그렇기 때문에 만약 우리가 equals() 메소드를 오버라이드 한다면, hashCode() 메소드도 오버라이드 되어야 한다.
//  순서상으로 봤을때 해시코드값이 다르면 다른 객체로 판단하고, 해시 코드값이 같으면 그때 equals()메소드로 다시 비교해서 레퍼런스 값도 같다면 동등 객체로 판단함
	
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
