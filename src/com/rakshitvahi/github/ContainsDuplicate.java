package com.rakshitvahi.github;

import java.util.HashSet;

public class ContainsDuplicate {

	public static void main(String[] args) {

		int[] nums = { 1, 2, 3, 4 };
		System.out.print(solution(nums));
	}

	static boolean solution(int[] nums) {
		HashSet<Integer> hs = new HashSet<>();

		for (int i = 0; i < nums.length; i++) {
			if (!hs.add(nums[i])) {
				return true;
			}
		}

		return false;
	}

}
