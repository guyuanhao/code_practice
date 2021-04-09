package leetcode;

import leetcode.codilityTest.CoinSequence;
import leetcode.codilityTest.Gardener;
import leetcode.codilityTest.MaximumNumberAdder;

public class Main {
	public static void main(String... s) {

		Gardener gardener = new Gardener();
//		int[] treeHeights = new int[]{3,4,5,3,7};
//		int[] treeHeights = new int[]{1,2,3,4};
		int[] treeHeights = new int[]{1,3,1,2};
		System.out.println(gardener.solution(treeHeights));

/*		MaximumNumberAdder maximumNumberAdder = new MaximumNumberAdder();
		int initialNumber1 = -438;
		int initialNumber2 = 638;
		System.out.println(maximumNumberAdder.solution(initialNumber1));
		System.out.println(maximumNumberAdder.solution(initialNumber2));*/

/*		CoinSequence coinSequence = new CoinSequence();
		int[] coins = new int[]{1,1,0,1,1};
		System.out.println(coinSequence.solution(coins));*/
	}

	
}
