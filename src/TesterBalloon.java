
import princeton.lib.StdRandom;


public class TesterBalloon {

	public static void main(String[] args)  {

		int number = 10;
		if (number >= 1 && number <= 100000) {
			int colors[] = new int[number];
			for (int i = 0; i < colors.length; i++) {
				colors[i] = StdRandom.uniform(1, 10);
			}
			Balloon balloon = new Balloon();

			System.out.println(number + "                         "
					+ balloon.repainBall(number, colors));
			if (number <= 2000) {
				for (int c : colors) {
					System.out.print(c + " ");
				}
			} else {
				for (int c : colors) {
					System.out.println(c + " ");
				}
			}
		} else {
			System.out.println("Incorrect input!");

		}
	}

}