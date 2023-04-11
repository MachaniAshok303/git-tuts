package encapsulation;

class Sample {
	private int accNumber;
	
	private void method1() {
		System.out.println("Sample: private method method1()");
	}
}


class Child extends Sample {
	Child(){
		//super.method1(); we can't access private member in the child class as well
	}
}
public class Encapsulation1 {
	public static void main(String[] args) {
		Sample s1 = new Sample();
		//s1.method1(); private members can't be accessed in the independent class as well
	}
}
