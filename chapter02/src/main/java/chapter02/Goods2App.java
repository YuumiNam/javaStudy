package chapter02;

import mypackage.Goods2;

public class Goods2App {
	public static void main(String[] args) {
		Goods2 g = new Goods2();
		
		// public은 접근 제한이 없다
		g.name = "camara";
		
		// protected는 같은 패키지에서만 접근이 가능
		// 더 중요한것은 상속개념에서 자식에서도 접근이 가능하다.
//		g.price = 1000;
	}
}
