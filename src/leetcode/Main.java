package leetcode;

import leetcode.codilityTest.CoinSequence;
import leetcode.codilityTest.MaximumNumberAdder;

public class Main {
	public static void main(String... s) {

		MaximumNumberAdder maximumNumberAdder = new MaximumNumberAdder();
		int initialNumber1 = -438;
		int initialNumber2 = 638;
		System.out.println(maximumNumberAdder.solution(initialNumber1));
		System.out.println(maximumNumberAdder.solution(initialNumber2));

/*		CoinSequence coinSequence = new CoinSequence();
		int[] coins = new int[]{1,1,0,1,1};
		System.out.println(coinSequence.solution(coins));*/
	}

	
}
