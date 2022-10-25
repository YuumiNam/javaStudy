package chapter01;

public class Ex04Typecast {
	public static void main(String[] args) {
		// int i1 = 10;
		// long l1 = 1000L;
		// float f1 = 3.14f;
		// double d1 = 3.14;
		
		
		// 명시적(explicit) 캐스팅
		// int i2 = l1; // 할당된 값이 큰곳에서 작은곳으로 바꿔줄때는 원칙적으로 에러남(long이 int보다 값이 큼)
		// int i2 = (int)l1; // 명시적캐스팅을 해준모습(double이 float보다 큼)
		// float f2 = (float)d1;
		// int i3 = (int)f1;
		
		// 암시적(implicit) 캐스팅
		// long l2 = i1; // 할당된 값이 작은곳에서 큰곳으로 바뀔때는 에러가 안남
		// double d2 = f1;
		// double d3 = i1;
		
		
		// 데이터의 의미가 다르면 캐스팅 자체가 안된다.
		// boolean b = (boolean)i1;

	}
}
