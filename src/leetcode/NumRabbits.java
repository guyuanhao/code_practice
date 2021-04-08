package leetcode;

import java.util.HashMap;
import java.util.Map;

public class NumRabbits {
	
    public int numRabbits(int[] answers) {
    	Map<Integer, Integer> colorNumMap = new HashMap();
    	for(int i : answers) {
    		if (colorNumMap.containsKey(i)) {
    			colorNumMap.put(i, colorNumMap.get(i) + 1);
    		} else {
    			colorNumMap.put(i, 1);
    		}
    	}
    	
    	int result = 0;
    	for (Map.Entry<Integer, Integer> entrySet : colorNumMap.entrySet()) {
    		Integer x = entrySet.getValue();
    		Integer y = entrySet.getKey();
    		int currentResult = (x/(y+1) + (x%(y+1) > 0 ? 1 : 0)) * (y+1);
    		result += currentResult;
    	}
    	return result;
    }
}
