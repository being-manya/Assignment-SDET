package tests;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class LongestSubstringTest {

    public int lengthOfLongestSubstring(String s) {
        int[] last = new int[256];
        for (int i = 0; i < 256; i++) last[i] = -1;
        int maxLen = 0, start = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (last[c] >= start) {
                start = last[c] + 1;
            }
            last[c] = i;
            maxLen = Math.max(maxLen, i - start + 1);
        }
        return maxLen;
    }

    @Test
    public void sampleTests() {
        assertEquals(3, lengthOfLongestSubstring("abcabcbb"));
        assertEquals(1, lengthOfLongestSubstring("bbbbb"));
        assertEquals(3, lengthOfLongestSubstring("pwwkew"));
        assertEquals(0, lengthOfLongestSubstring(""));
    }
}
