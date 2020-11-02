package easy._125验证回文串;

import java.util.Stack;

/*给定一个字符串，验证它是否是回文串，只考虑字母和数字字符，可以忽略字母的大小写。

        说明：本题中，我们将空字符串定义为有效的回文串。

        示例 1:

        输入: "A man, a plan, a canal: Panama"
        输出: true
        示例 2:

        输入: "race a car"
        输出: false*/
public class Solution {
    public boolean isPalindrome(String s) {
        s = s.toLowerCase();
        int left = 0;
        int right = s.length() - 1;
        while (left < right) {
            if (!((s.charAt(left) >= 'a' && s.charAt(left) <= 'z') || (s.charAt(left) >= '0' && s.charAt(left) <= '9'))) {
                left++;
            } else if (!((s.charAt(right) >= 'a' && s.charAt(right) <= 'z') || (s.charAt(right) >= '0' && s.charAt(right) <= '9'))) {
                right--;
            } else {
                if (s.charAt(left) == s.charAt(right)) {
                    left++;
                    right--;
                } else {
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        new Solution().isPalindrome("race a car");
    }
}
