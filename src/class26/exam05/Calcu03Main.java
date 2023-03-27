package class26.exam05;
/**
 * 메소드 오버로딩 실행 클래스
 */
public class Calcu03Main { // class s

	public static void main(String[] args) { // main s
		
		// 게싼기 클래스 객체 생성
		Calcu03 cal = new Calcu03();		//객체생성
		
		System.out.println("========== 정수 평균 구하는 메소드 호출 ==========");
		cal.execute(20, 30);
		
		
		System.out.println("========== 실수 평균 구하는 메소드 호출 ==========");
		cal.execute(20.5, 30.5);
		
	} // main e

} // class e
