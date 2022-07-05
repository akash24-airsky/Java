public class Test8{
	static{
		System.out.println("I Am Static Block");
	}
	{
		Test8 p = new Test8();
		System.out.println("Hello");
	}
	public static void main(String[] args){
		Test8 p1 = new Test8();
	}
	
}