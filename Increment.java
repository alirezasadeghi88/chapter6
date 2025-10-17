public class Increment {
	public static void main(String[] args) {
		int x =1;
		System.out.println("Befor the call, x is " + x);
		x = incremet(x);
		System.out.println("After the call, x is " + x);
		
	}
	public static int incremet(int n) {
		n++;
		System.out.println("n inside the method is " + n);
		return n;
		
	}
}