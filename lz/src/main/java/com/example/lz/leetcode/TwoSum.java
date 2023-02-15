package com.example.lz.leetcode;

import java.util.*;

/**
 * 给定一个整数数组 nums 和一个整数目标值 target，请你在该数组中找出 和为目标值 target  的那 两个 整数，并返回它们的数组下标。

 你可以假设每种输入只会对应一个答案。但是，数组中同一个元素在答案里不能重复出现。

 你可以按任意顺序返回答案。

 来源：力扣（LeetCode）
 链接：https://leetcode.cn/problems/two-sum
 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 * @author: lz
 * @date 2023-02-15
 */
public class TwoSum {

    public static int[] twoSum(int[] nums,int target){
        //key = num ,value = target - num
        Map<Integer,Integer> map = new HashMap<>(nums.length);
        //key = num ,value = num 下角标
        Map<Integer,Integer> indexMap = new HashMap<>(nums.length);

        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            map.put(num,target-num);
            indexMap.put(num,i);
        }

        for (Integer key  : map.keySet()) {
            Integer value = map.get(key);
            Integer index = indexMap.get(value);
            if(Objects.nonNull(index)){
                return new int[]{indexMap.get(key),index};
            }

        }
        return null;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{2,7,6,9};
        int[] ints = twoSum(nums, 11);
        for (int anInt : ints) {
            System.out.println(anInt);
        }


    }


}
