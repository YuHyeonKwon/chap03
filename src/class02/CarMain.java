package class02;

/**
 * 실행 클래스
 * - main 메소드가 있어서 실행할 수 있는 클래스
 * - 라이브러리 클래스를 객체로 만들어서 이용하는 클래스
 */
public class CarMain { // class s

	public static void main(String[] args) { // main s
		// Car 클래스 객체 생성
		Car myCar = new Car();		// new 연산자를 통해서 객체 생성
		
		myCar.color = "빨간색";		// 색상 정보 저장(색상 필드에 값 할당 )
		
		System.out.println("자도차의 색상은: " + myCar.color + "입니다.");		// 도트 연산자  (필드에있는 값을 빼옴)
	} // main e

} // class e
