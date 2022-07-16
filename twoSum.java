// https://leetcode.com/problems/two-sum/

import java.util.*;

class twoSum {
    public int[] twoSumMethod(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i : nums) {
            if (map.get(i) == null) {
                map.put(i,1);
            } else {
                map.put(i,2);
            }
        }
        
        int rem = 0;
        int[] ans = new int[2];
        
        for (int i = 0; i < nums.length; i++) {
            rem = target - nums[i];
            if (rem == nums[i]) {
                if (map.get(rem) >= 2) {
                    ans[0] = rem;
                    ans[1] = rem;
                    break;
                }
            } 
            else {
                if (map.get(rem) != null) {
                    ans[0] = nums[i];
                    ans[1] = rem;
                    break;
                }
            }
        }
        
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == ans[0]) {
                ans[0] = i;
                break;
            }
        }
        
        for (int i = nums.length - 1; i >= 0; i--) {
            if (nums[i] == ans[1]) {
                ans[1] = i;
                break;
            }
        }
        
        return ans;
    }
}




