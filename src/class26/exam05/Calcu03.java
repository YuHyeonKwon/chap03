package class26.exam05;
/**
 * [메소드 오버로딩] 계산기 라이브러리 클래스
 * 매개변수의 형태에 따라서 알맞은 메소드가 자동으로 호출된다.
 * 외부에서 execute() 메서드가 호출되고 execute() 에서 내부 연산 메소드 호출함 
 */
public class Calcu03 { // class s
	
	// 덧셈(정수) 메소드
	public int sum (int x, int y) {
		return x + y;
	}
	// 덧셈(실수) 메소드
	public double sum (double x, double y) {
		return x + y;
	}
	
	// 정수 평균 구하는 메소드
	public double avg(int x, int y) {
		double avg = 0.0;
		//// sum 메소드 호출
		int sum = sum(x,y);
		avg = (double) sum / 2;
		return avg;
	}
	
	// 실수 평균 구하는 메소드
	public double avg(double x, double y) {
		double avg = 0.0;
		////sum 메소드 호출
		double sum = sum(x, y);
		avg = (double) sum / 2;
		return avg;
	}
	
	// 정수 평균 구하기 위해서 외부에서 호출되는 메서드
	public void execute(int x, int y) {
		double avg = 0.0;
		avg = avg(x, y);
		println(x + " + " + y + " 평균은 " + avg);
	}
	
	// 실수 평균을 구하기 위해서 외부에서 호출되는 메소드
	public void execute(double x, double y) {
		double avg = 0.0;
		avg = avg(x, y);
		println(x + " + " + y + " 평균은 " + avg);
	}
	
	// 계산된 평균을 출력해주는 메소드
	private void println(String message) {
	}

} // class e
