import java.util.Iterator;
import java.util.Stack;

public class StackMin {
	Stack<Integer> gen;

	public int stackGenerator(int n, int a, int b, int c, int x0) {

		int minSum = 0;
		gen = new Stack<Integer>();
		Iterator<Integer> iterator = gen.iterator();
		if (n >= 1 && n <= 1000000 && a >= 0 && b >= 0 && c >= 0 && x0 >= 0
				&& a <= 1000 && b <= 1000 && c <= 1000 && x0 <= 1000) {

			for (int i = 0; i < n; i++) {
				x0 = (int) ((a * Math.pow(x0, 2) + b * x0 + c) / 100) % (1000000);
				if (x0 % 5 < 2) {
					if (iterator.hasNext()) {
						gen.pop();
						minSum += minElem(gen);
					} 
				} else {
					gen.push(x0);
					minSum += minElem(gen);
				}
			}

		}

		return minSum;

	}

	private int minElem(Stack<Integer> stack) {
		int min = 0;
		if(!stack.isEmpty()){
			min = stack.pop();
			stack.push(min);
		}
		Iterator<Integer> iterator = stack.iterator();
		
		while (iterator.hasNext()) {
			int next = iterator.next();
			if (next < min) {
				min = next;
			
		}
		}
		return min;

	}
}