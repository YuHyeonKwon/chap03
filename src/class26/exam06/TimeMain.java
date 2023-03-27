package class26.exam06;

public class TimeMain { // class s

	public static void main(String[] args) { // main s
		
		// Time 객체 생성
		Time t = new Time();
		
		t.hour = 24;		// 잘못된 값 입력
		t.minute = 59;
		t.second = 30;
		t.showTime();
	} // main e

} // class e
