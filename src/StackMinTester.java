
public class StackMinTester {
	public static void main(String[] args) {
		int n = 3;
		int a = 1;
		int b = 1;
		int c = 1;
		int x0 = 100;
		StackMin stack = new StackMin();
		int res=stack.stackGenerator(n, a, b, c, x0);
		System.out.print(n+" "+a+" "+b+" "+c+" "+x0+" "+"                    ");
		System.out.println(res);
	}

}
