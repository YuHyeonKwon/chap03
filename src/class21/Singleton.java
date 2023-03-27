package class21;

public class Singleton { // class s
	// private 접근 권한을 갖는 정적 필드 선언과 초기화
	private static Singleton singleton = new Singleton();	// static이 붙으면 정적 필드

	// private 접근 권한을 갖는 생성자 선언
	private Singleton() {

	}

	// private 접근 권한을 갖는 정적 메소드 선언
	public static Singleton getInstance() {		// static이 붙으면 정적 메소드
		return singleton;
	}
} // class e
