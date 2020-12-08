package basics;

public class VariableTypes {

	int b = 20;//instance variable
	final int c = 30;//final variable
	static int d = 40;//static variable
	volatile int e = 50;//volatile variable
	transient int f = 60;//Transient Variable
	public static void main(String[] args) {
		VariableTypes obj = new VariableTypes();//instance or object
		int a = 10;//local variable
		System.out.println("A = "+a);
		System.out.println("B = "+obj.b);
		System.out.println("C = "+obj.c);
		System.out.println("D = "+d);
		System.out.println("E = "+obj.e);
		System.out.println("F = "+obj.f);

	}
	

}
