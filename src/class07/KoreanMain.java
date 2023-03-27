package class07;
/**
 * [Alt + Shift + R] 변수명 일괄 변경 완료 후 esc
 */
public class KoreanMain { // class s

	public static void main(String[] args) { // main s
		Korean kor1 = new Korean("대한민국","홍길동","123456-7892837");
		
		System.out.println("국적 : " + kor1.nation);
		System.out.println("성명 : " + kor1.name);
		System.out.println("주민번호 : " + kor1.ssn);
		System.out.println();
		
		Korean kor2 = new Korean("대한민국","김철수","951206-4687248");
		System.out.println("국적 : " + kor2.nation);
		System.out.println("성명 : " + kor2.name);
		System.out.println("주민번호 : " + kor2.ssn);
		System.out.println();
		
		Korean kor3 = new Korean("김길동", "123123-4564567");
		System.out.println("성명: " + kor3.name);
		System.out.println("주민번호: " + kor3.ssn);
	} // main e

} // class e
