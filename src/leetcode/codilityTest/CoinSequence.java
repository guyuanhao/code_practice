package leetcode.codilityTest;

public class CoinSequence {
    public int solution(int[] arrayCoins) {
        Integer reverseFirst=0;
        Integer keepFirst=0;
        int reverseFirstPreviousCoin = reverseCoin(arrayCoins[0]);
        reverseFirst++;
        int keepFirstPreviousCoin = arrayCoins[0];
        for (int i=1; i<arrayCoins.length; i++) {
            if (reverseFirstPreviousCoin == arrayCoins[i]) {
                reverseFirstPreviousCoin = reverseCoin(arrayCoins[i]);
                reverseFirst++;
            } else {
                reverseFirstPreviousCoin = arrayCoins[i];
            }
            if (keepFirstPreviousCoin == arrayCoins[i]) {
                keepFirstPreviousCoin = reverseCoin(arrayCoins[i]);
                keepFirst++;
            } else {
                keepFirstPreviousCoin = arrayCoins[i];
            }
        }
//        log.info("reverseFirst: {}, keepFirst: {}", reverseFirst, keepFirst);
        return reverseFirst < keepFirst ? reverseFirst : keepFirst;
    }

    public int reverseCoin(int coin) {
        if (coin == 0) {
            return 1;
        } else {
            return 0;
        }
    }

}
