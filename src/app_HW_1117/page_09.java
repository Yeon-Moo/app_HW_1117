package app_HW_1117;

public class page_09 {
	public static void main(String[] args) {
		Car car1;
		car1=new Car();
		car1.num=1234;
		car1.gas=20.5;
	}
}

class Car{
	private int num;
	private double gas;
	private String name;
	

	void show() {
		System.out.println("車號是"+this.num);
		System.out.println("汽油量是"+this.gas);
		
	}
}