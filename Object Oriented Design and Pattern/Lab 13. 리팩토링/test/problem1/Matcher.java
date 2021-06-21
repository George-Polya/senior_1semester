package problem1;

/**
 * 중복된 코드
 * for(int i = 0; i< actual.length; i++) 를
 * 하나로 합쳤다
 */

public class Matcher {
    public Matcher() {
    }

    public boolean match(int[] expected, int[] actual, int clipLimit, int delta) {


        if (actual.length != expected.length) {
            return false;
        }


        // 하나로 합친 부분
        for (int i = 0; i < actual.length; i++) {
            if (actual[i] > clipLimit) { // 이곳으로 옮김
                actual[i] = clipLimit;
            } else if (Math.abs(expected[i] - actual[i]) > delta) {
                return false;

            }
        }

        return true;
    }
}
