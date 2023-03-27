package class22;

/**
 * final : 변하지 않는 값을 저장 - 프로그램 실행 도중에 변경할 수 없다.
 */
public class Person { // class s
	
	final String nation = "Korea";
	final String ssn;
	String name;
	
	// 생성자
	public Person(String ssn, String name) {	// 오버로딩 멤버 변수 초기화
		this.ssn = ssn;
		this.name = name;
	}
} // class e
