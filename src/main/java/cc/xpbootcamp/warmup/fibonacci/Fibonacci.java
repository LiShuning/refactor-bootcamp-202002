package cc.xpbootcamp.warmup.fibonacci;

public class Fibonacci {
    public static long calculate(int position) {
        long result = 0;

        if (isTheFirstTwoPosition(position)) {
            result = 1;
        }
        if (position >= 3) {
            result = getResult(position);
        }
        return result;
    }

    private static long getResult(int position) {
        long f1 = 1;
        long f2 = 1;
        long prePreFib = f1;
        long preFib = f2;
        long flag = 2;
        long result = 0;

        while (flag < position) {
            result = preFib + prePreFib;
            prePreFib = preFib;
            preFib = result;
            flag++;
        }
        return result;
    }

    private static boolean isTheFirstTwoPosition(int position) {
        return position > 0 && position < 3;
    }
}
