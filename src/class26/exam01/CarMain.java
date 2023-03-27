package class26.exam01;

public class CarMain { // class s

	public static void main(String[] args) { // main s
		
		Car car = new Car();
		
		Car car2 = new Car();

		Car myCar1 = new Car("현대차","그렌져",2000,"white",2800,250,120);
		
		Car myCar2 = new Car("기아차","K9",3000,"black",2800,300,150);
		
		System.out.println(myCar1.maker+"\n"+myCar1.model+"\n"+myCar1.cc+"\n"+myCar1.color+"\n"+myCar1.price+"\n"+myCar1.maxSpeed+"\n"+myCar1.speed);
		
		System.out.println("회사: "+ myCar2.maker);
		System.out.println("차종: " + myCar2.model);
		System.out.println("cc: " + myCar2.cc);
		System.out.println("색상: " + myCar2.color);
		System.out.println("가겨: " + myCar2.price);
		System.out.println("최고속도: " + myCar2.maxSpeed);
		System.out.println("속도: " + myCar2.speed);
		
		// 자동차 객체의 값출력하는 또다른 방법(showCarInfo 메소드)
		// 첫번쨰 자동차 객체의 값출력
		
		car.showCarInfo();
		System.out.println();
		
		// 두번째 자동차 객체의 값출력
		car2.showCarInfo();
		
	} // main e

} // class e
