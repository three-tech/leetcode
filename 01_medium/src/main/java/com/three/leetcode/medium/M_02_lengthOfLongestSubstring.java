package com.three.leetcode.medium;

import java.util.HashMap;
import java.util.Map;

/**
 * @author three
 * @since 2021/2/25 下午6:59
 * <p>
 * 给定一个字符串，请你找出其中不含有重复字符的 最长子串 的长度。
 * <p>
 *  
 * <p>
 * 示例 1:
 * <p>
 * 输入: s = "abcabcbb"
 * 输出: 3
 * 解释: 因为无重复字符的最长子串是 "abc"，所以其长度为 3。
 * 示例 2:
 * <p>
 * 输入: s = "bbbbb"
 * 输出: 1
 * 解释: 因为无重复字符的最长子串是 "b"，所以其长度为 1。
 * 示例 3:
 * <p>
 * 输入: s = "pwwkew"
 * 输出: 3
 * 解释: 因为无重复字符的最长子串是 "wke"，所以其长度为 3。
 *      请注意，你的答案必须是 子串 的长度，"pwke" 是一个子序列，不是子串。
 * 示例 4:
 * <p>
 * 输入: s = ""
 * 输出: 0
 *  
 * <p>
 * 提示：
 * <p>
 * 0 <= s.length <= 5 * 104
 * s 由英文字母、数字、符号和空格组成
 * <p>
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/longest-substring-without-repeating-characters
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 *
 * </p>
 */
public class M_02_lengthOfLongestSubstring {
	public int lengthOfLongestSubstring(String s) {

		int result = 0;
		//记录上一次出现的位置
		Map<Character, Integer> lastPosition = new HashMap<>();
		//开始窗口的位置
		int start = 0;


		for (int i = 0; i < s.length(); i++) {
			start = Math.max(start, lastPosition.getOrDefault(s.charAt(i), 0) + 1);
			result = Math.max(result, i + 1 - start);
			lastPosition.put(s.charAt(i), i);
		}

		return result;
	}
}
