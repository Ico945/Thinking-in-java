package three;

import java.util.Random;

public class Coin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random r1 = new Random();
		Random r2 = new Random();
		// System.out.println(r1.nextInt(100)+"-"+r2.nextInt(100));
		System.out.println(r1.nextInt(100)>r2.nextInt(100));
	}

}
