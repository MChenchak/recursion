public class Palindrome {

    public static boolean isPalindrome(String str) {
        if (str == null)
            return false;

        int n = str.length();

        if (n == 0)
            return true;

        return checkChars(str, 0, n - 1);
    }

    private static boolean checkChars(String str, int s, int e) {
        if (s == e)
            return true;

        if ((str.charAt(s)) != (str.charAt(e)))
            return false;

        if (s < e + 1)
            return checkChars(str, s + 1, e - 1);

        return true;
    }
}
