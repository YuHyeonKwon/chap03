package class26.exam05;

public class Calcu01Main { // class s

	public static void main(String[] args) { // main s
		
		int x = 10;
		int y = 20;
		double x1 = 10.5;
		double y1 = 20.0;
		
		// 계산기 객체 생성
		Calcu01 cal = new Calcu01();
		
		// 정수 합산
		int intSum = cal.sum(x, y);
		System.out.println("정수"+x+"와"+y+"의 합산결과는" + intSum);
		
		// 실수 합산
		double doubleSum = cal.sum(x1, y1);
		System.out.println("정수"+x1+"와"+y1+"의 합산결과는" + doubleSum);
	} // main e
 
} // class e
