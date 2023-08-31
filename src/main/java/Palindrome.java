public class Palindrome {

    public static boolean isPalindrome(String str) {
        if (str == null)
            return false;

        int n = str.length();

        if (n == 0)
            return true;

        return checkChars(str, 0);
    }

    private static boolean checkChars(String str, int i) {
        if (i > str.length() / 2) {
            return true;
        }
        if (str.charAt(i) != (str.charAt(str.length() - 1 - i))) {
            return false;
        }

        i = i + 1;
        return checkChars(str, i);
    }
}