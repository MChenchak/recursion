public class Digits {

    public static int sumOfDigits(int val) {
        int absVal = abs(val);
        if (absVal < 10) return absVal;
        return absVal % 10 + sumOfDigits(absVal / 10);
    }

    private static int abs(int val) {
        return val < 0 ? -1 * val : val;
    }
}
