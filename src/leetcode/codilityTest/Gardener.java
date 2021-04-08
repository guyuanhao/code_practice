package leetcode.codilityTest;

public class Gardener {
    public int solution(int[] treesHeight) {
        int solution = 0;
        for(int index=0; index<treesHeight.length; index++) {
            if (index == 0) {
                //查看[(index+1), (index+2)]和[(index+2), (index+3)]之间的关系
                if (checkIfAsthetic(treesHeight[index+1], treesHeight[index+2], treesHeight[index+3])) {
                    solution++;
                }
            }
        }
        return 0;
    }

    private boolean checkIfAsthetic(int first, int second, int third) {
        if ((first - second) * (second - third) > 0) {
            return false;
        } else {
            return true;
        }
    }
}
