package class26.exam02;

public class ProductMain { // class s

	public static void main(String[] rgs) { // main s

		Product pro = new Product();	// 기본생성자 호출 ( 기본값으로 세팅 )

		pro.id = 202103001;
		pro.name = "냉장고";
		pro.price = 500;
		pro.quantity = 5;
		pro.amount = 2500;

		System.out.println("id: " + pro.id);
		System.out.println("name: " + pro.name);
		System.out.println("price: " + pro.price);
		System.out.println("quantity: " + pro.quantity);
		System.out.println("amount: " + pro.amount);
		System.out.println();

		Product pro1 = new Product(202103001, "세탁기", 250, -15);

		System.out.println("id: " + pro1.id);
		System.out.println("name: " + pro1.name);
		System.out.println("price: " + pro1.price);
		System.out.println("quantity: " + pro1.quantity);
		System.out.println("amount: " + pro1.amount);
		System.out.println();

		pro.showProduct();

		System.out.println();

		pro1.showProduct();

	} // main e

} // class e
