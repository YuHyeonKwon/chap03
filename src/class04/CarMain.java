package class04;

/**
 * 실행 클래스 기본 생성자를 통한 객체 생성
 */
public class CarMain { // class s

	public static void main(String[] args) { // main s

		// 1. Car 객체 생성
		Car myCar = new Car(); // 기본 생성자 호출
		Car myCar2 = new Car(); // 기본 생성자 호출

		System.out.println("객체의 주소: " + myCar + "\n" + "객체의 주소: " + myCar2);
	} // main e

} // class e
