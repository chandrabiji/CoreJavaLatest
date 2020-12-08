package basics;

public class MethodTypes {
	//instance method
	public void display()
	{
		System.out.println("Hello");
	}
	
	public int add(int i, int j){
		return i+j;
	}
	//static methods
	public static void methodA()
	{
		System.out.println("From Static Method");
	}
	//final method
	public final void methodB()
	{
		System.out.println("From final Method");
	}
	//abstract method
	//public abstract void methodC();
	//synchronized method
	public synchronized void methodC(){
		System.out.println("From synchronized Method");
	}

	public static void main(String[] args) {
		MethodTypes obj = new MethodTypes();//instance or object
		obj.display();
		System.out.println(obj.add(10, 5));
		methodA();
		obj.methodB();
		obj.methodC();

	}

}
