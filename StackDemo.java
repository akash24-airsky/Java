import java.util.Stack;
public class StackDemo{
public static void main(String[] args){
	
	Stack<Integer> to = new Stack();
	System.out.println("Hello");
	
	to.add(15);
	to.add(16);
	to.add(17);
	to.add(18);
	to.add(19);
	
	System.out.println(to.pop());
} 
}