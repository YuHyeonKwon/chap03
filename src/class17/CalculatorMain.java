package class17;

/**
 * 실행클래스
 */
public class CalculatorMain { // class s

	public static void main(String[] args) { // main s

		Calculator calc = new Calculator();

		int radius = 10; // 반지름
		double area = calc.area(radius); // 인스턴스 메소드에 접근
		System.out.printf("원의 반지름이 %d 일때 원의 넓이는 %.2f 입니다.", radius, area);
		System.out.println();

		Calculator calc2 = new Calculator();
		radius = 20;
		area = calc2.area(radius);
		System.out.printf("원의 반지름이 %d 일때 원의 넓이는 %.2f 입니다.", radius, area);

	} // main e

} // class e
