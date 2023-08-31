import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PalindromeTest {

    @Test
    @DisplayName("Not empty is palindrome")
    void isPalindrome() {
        String palindrome = "шалаш";
        assertTrue(Palindrome.isPalindrome(palindrome));
    }

    @Test
    @DisplayName("Empty is palindrome")
    void emptyIsPalindrome() {
        String palindrome = "";
        assertTrue(Palindrome.isPalindrome(palindrome));
    }

    @Test
    @DisplayName("Null is not palindrome")
    void nullIsNotPalinddrome() {
        String palindrome = null;
        assertFalse(Palindrome.isPalindrome(palindrome));
    }

    @Test
    @DisplayName("is not palindrome")
    void isNotPalindrome() {
        String palindrome = "не палиндром";
        assertFalse(Palindrome.isPalindrome(palindrome));
    }

}