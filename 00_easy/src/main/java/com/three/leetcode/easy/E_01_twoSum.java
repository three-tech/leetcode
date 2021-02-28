package com.three.leetcode.easy;

import java.util.HashMap;

/**
 * @author three
 * @since 2021/2/25 下午5:55
 * <p>
 * 给定一个整数数组 nums 和一个整数目标值 target，请你在该数组中找出 和为目标值 的那 两个 整数，并返回它们的数组下标。
 * <p>
 * 你可以假设每种输入只会对应一个答案。但是，数组中同一个元素不能使用两遍。
 * <p>
 * 你可以按任意顺序返回答案。
 * <p>
 *  
 * <p>
 * 示例 1：
 * <p>
 * 输入：nums = [2,7,11,15], target = 9
 * 输出：[0,1]
 * 解释：因为 nums[0] + nums[1] == 9 ，返回 [0, 1] 。
 * 示例 2：
 * <p>
 * 输入：nums = [3,2,4], target = 6
 * 输出：[1,2]
 * 示例 3：
 * <p>
 * 输入：nums = [3,3], target = 6
 * 输出：[0,1]
 *  
 * <p>
 * 提示：
 * <p>
 * 2 <= nums.length <= 103
 * -109 <= nums[i] <= 109
 * -109 <= target <= 109
 * 只会存在一个有效答案
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/two-sum
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 * </p>
 */
public class E_01_twoSum {
	public static int[] twoSum(int[] nums, int target) {
		// for (int i = 0; i < nums.length; i++) {
		// 	for (int j = i + 1; j < nums.length; j++) {
		// 		if (nums[i] + nums[j] == target) {
		// 			return new int[]{i, j};
		// 		}
		// 	}
		// }
		// return null;
		//	上面是双循环解法
		int[] indexs = new int[2];

		// 建立k-v ，一一对应的哈希表
		HashMap<Integer, Integer> hash = new HashMap<>();
		for (int i = 0; i < nums.length; i++) {
			if (hash.containsKey(nums[i])) {
				indexs[0] = i;
				indexs[1] = hash.get(nums[i]);
				return indexs;
			}
			// 将数据存入 key为补数 ，value为下标
			hash.put(target - nums[i], i);
		}
		return indexs;
	}
}
