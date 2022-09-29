import java.util.Stack;
public class StackCollections2 {

	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5};
		
		Stack<Integer> stack = new Stack<>();
		for(int i:arr) {
			stack.push(i);
		}
		
		while(!stack.isEmpty()) {
			System.out.println(stack.pop());
		}
	}
}
