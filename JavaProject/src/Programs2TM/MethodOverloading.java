package Programs2TM;

public class MethodOverloading {

//	int a = 10;
//	int b = 20;
//	int c = 30;
//	int d = 40;
//	float f = 1.2f;

	public void add(int a) {
		System.out.println(a + a);
	}

	public void add(int c, int b) {
		System.out.println(c + b);
	}

	public void add(float e, int d) {
		System.out.println(e + d);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodOverloading a = new MethodOverloading();
		a.add(10);
		a.add(10,20);
		a.add(10.10f, 20);
	}
}
