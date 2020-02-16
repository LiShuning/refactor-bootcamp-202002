package cc.xpbootcamp.warmup.fibonacci;

public class Fibonacci {
    public static long calculate(int position) {
        long value = 0;

        if (position > 0 && position < 3) {
            value = 1;
        }

        if (position >= 3){
            value = calculate(position - 1) + calculate(position - 2);
        }

        return value;
    }
}
