package class26.exam05;
/**
 * 실행클래스
 * - 배열을 오버로딩 메소드에 인자로 전달하고 있다. 배열의 주소가 복사되는 그림
 */
public class Calcu04Main { // class s

	public static void main(String[] args) { // main s
		
		int[] intArr = new int[5];
		intArr[0] = 15;
		intArr[1] = 25;
		intArr[2] = 35;
		intArr[3] = 45;
		intArr[4] = 55;
		
		double[] dblArr = new double[5];
		dblArr[0] = 15.5;
		dblArr[1] = 25.5;
		dblArr[2] = 35.5;
		dblArr[3] = 45.5;
		dblArr[4] = 55.5;
		
		// 계산기 객체 생성
		Calcu04 cal = new Calcu04();
		
		// 게싼기 객체의 오버로딩 메소드 호출
		int[] arr2 = cal.tenPlus(intArr);
		double[] arr3 =cal.tenPlus(dblArr);
		
		// 두 배열의 값을 출력하세요
		for (int i = 0; i < arr2.length; i++) {
			System.out.println("intArr: " + arr2[i]);
		}
		for (int i = 0; i < arr3.length; i++) {
			System.out.println("dblArr : " + arr3[i]);
		}
		
		// 향상된 for 문
		for (int i : arr2) {
			System.out.println("intArr: " + i);
		}
		for (double d : arr3) {
			System.out.println("dblArr: " + d);
		}
	} // main e

} // class e
