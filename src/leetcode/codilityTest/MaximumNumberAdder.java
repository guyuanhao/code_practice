package leetcode.codilityTest;

import java.util.LinkedList;
import java.util.List;

public class MaximumNumberAdder {
    public int solution(int n) {
        if (n == 0) {
            return 50;
        }
        boolean negative = false;
        if (n<0) {
            negative = true;
        }
        List<Integer> integerList = new LinkedList<>();
        while(Math.abs(n)> 0) {
            integerList.add(Math.abs(n)%10);
            n = n/10;
        }

        for (int i=integerList.size() -1 ; i>=0 ; i--) {
            if (!negative) {
                if (integerList.get(i) <= 5 ) {
                    integerList.add(i+1, 5);
                    break;
                }
            } else {
                if (integerList.get(i) > 5) {
                    integerList.add(i+1, 5);
                    break;
                }
            }
            if (i == 0) {
                integerList.add(0, 5);
            }

        }
        int result = 0;
        for (int i=0; i<integerList.size(); i++) {
            result += integerList.get(i)*Math.pow(10, i);
        }
        if (negative) {
            result = -1 * result;
        }
        return result;
    }

}
