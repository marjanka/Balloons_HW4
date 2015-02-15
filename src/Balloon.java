public class Balloon {

	private int colors[];
	
	public int repainBall(int n, int ball[]) {
		

		if (n >= 1 && n <= 100000) {
			colors = new int[9];
			int max = 0;
			for (int i = 0; i < ball.length; i++) {
				if(ball[i]==9){
					colors[0]++;
				}
				else{
				colors[ball[i]] ++;}
			}


			for (int j = 0; j < =colors.length-1; j++) {
				if (colors[j] > max) {
					max = colors[j];
				}
			}
			return n - max;
		} else {
			System.out.println("Incorrect input!");
			return -1;
		}
	}

}
