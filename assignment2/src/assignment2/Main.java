package assignment2;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<Integer> s = new Stack<Integer>();
		s.add(10);
		s.add(20);
		s.add(20);
		s.add(23);
		s.add(22);
		s.add(21);
		System.out.println(s.peek());
		System.out.println(s.pop());
		System.out.println(s.peek());
	}

}
