
public class HelloWorld {

	public static void main(String[] args) {
		System.out.println(totalPrice(300)+"<br>");
		System.out.println(totalPrice(450)+"<br>");
		System.out.println(totalPrice(400)+"<br>");
		System.out.println(totalPrice(350)+"<br>");
	}

	public static int totalPrice(int fruitprice, double tax, int haiso) {
//		double tax = 1.08;
//		int haiso = 350;
		return (int)(fruitprice*tax)+haiso;
	}
	public static int totalPrice(int fruitprice) {
		return totalPrice(fruitprice, 1.08, 350);
	}
}