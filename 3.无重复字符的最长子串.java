/*
 * @lc app=leetcode.cn id=3 lang=java
 *
 * [3] 无重复字符的最长子串
 */

// @lc code=start
class Solution {
    public int lengthOfLongestSubstring(String s) {

        if (s.length() <= 1) {
            return s.length();
        }
        // 声明hash字典
        int[] dict = new int[256];
        // 字典赋初始值
        Arrays.fill(dict, -1);
        int max = 0;
        int slide = -1;
        for (int i = 0; i < s.length(); i++) {
            if (dict[s.charAt(i)] > slide) {
                slide = dict[s.charAt(i)];
            }
            int tmp = i - slide;
            max = Math.max(tmp, max);
            // 标记每个字符出现的位置
            dict[s.charAt(i)] = i;
        }
        return max;

    }
}
// @lc code=end
