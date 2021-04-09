package leetcode.codilityTest;

public class Gardener {
    public int solution(int[] treesHeight) {
        int solution = 0;
        boolean alreadyAsthetic = true;
        int flag = 0;
        for (int index=0; index<treesHeight.length; index++) {
            if (alreadyAsthetic
                    && index<treesHeight.length - 2
                    && !checkIfAsthetic(treesHeight[index], treesHeight[index+1], treesHeight[index+2])) {
                alreadyAsthetic = false;
                flag = index;
                continue;
            }
            if (!alreadyAsthetic
                    && index<treesHeight.length - 2
                    && !checkIfAsthetic(treesHeight[index], treesHeight[index+1], treesHeight[index+2])) {
                return -1;
            }
            if (alreadyAsthetic) {
                return 0;
            }
        }

        for(int index=0; index<treesHeight.length; index++) {
            if (!(index>=flag && index<flag + 3)) {
                continue;
            }
            if (index == 0) {
                //查看[(index+1), (index+2)]和[(index+2), (index+3)]之间的关系
                if (checkIfAsthetic(treesHeight[index+1], treesHeight[index+2], treesHeight[index+3])) {
                    solution++;
                }
            } else if (index == treesHeight.length - 2) {
                //查看[(index-2), (index-1)]和[(index-1), (index+1)]之间的关系
                if (checkIfAsthetic(treesHeight[index - 2], treesHeight[index - 1], treesHeight[index + 1])) {
                    solution++;
                }
            } else if (index == treesHeight.length - 1) {
                //查看[(index-3), (index-2)]和[(index-2), (index-1)]之间的关系
                if (checkIfAsthetic(treesHeight[index - 3], treesHeight[index - 2], treesHeight[index - 1])) {
                    solution++;
                }
            } else {
                //查看[(index-1), (index+1)]和[(index+1), (index+2)]之间的关系
                if (checkIfAsthetic(treesHeight[index - 1], treesHeight[index + 1], treesHeight[index + 2])) {
                    solution++;
                }
            }
        }

        return solution;
    }

    private boolean checkIfAsthetic(int first, int second, int third) {
        if ((first - second) * (second - third) > 0) {
            return false;
        } else {
            return true;
        }
    }
}
