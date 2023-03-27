package class18;

/**
 * 실행클래스
 */
public class CalculatorMain { // class s

	public static void main(String[] args) { // main s

//		Calculator calc = new Calculator();

		int radius = 10; // 반지름
		double area = Calculator.area(radius); // 객체 생성 없이 접근
		System.out.printf("원의 반지름이 %d 일때 원의 넓이는 %.2f 입니다.", radius, area);
		System.out.println();

//		Calculator calc2 = new Calculator();
		radius = 20;
		area = Calculator.area(radius);
		System.out.printf("원의 반지름이 %d 일때 원의 넓이는 %.2f 입니다.", radius, area);

	} // main e

} // class e