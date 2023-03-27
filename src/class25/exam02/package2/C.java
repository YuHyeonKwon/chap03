package class25.exam02.package2;

import class25.exam02.package1.A;

public class C { // class s
	//필드선언
	A a1 = new A(true);		//o		public은 접근가능
	//A a2 = new A(1);		//x		default로 인한 접근제한 ( 같은 패키지가 아니여서 )
	//A a3 = new A("문자열");	//x		private로 인한 접근제한
} // class e
