package com.example.lz.leetcode;

/**
 * @author: lz
 * @date 2023-02-15
 *给你一个正整数数组 nums，你需要从中任选一些子集，然后将子集中每一个数乘以一个 任意整数，并求出他们的和。
 *
 * 假如该和结果为 1，那么原数组就是一个「好数组」，则返回 True；否则请返回 False。
 *
 * 根据 裴蜀定理 正整数a1到an的最大公约数是1的充分必要条件是存在n个整数x1到xn满足
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode.cn/problems/check-if-it-is-a-good-array
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 *
 */
public class GoodArray {

    /**
     * 判断是不是好数组
     * 判断数组中全部元素的最大公约数是不是1
     * 优化：1和任意正整数的最大公约数都是1，所以过程中公约数为1时可以提前结束判断
     *
     * @param nums
     * @return
     */
    public static boolean isGoodArray(int[] nums){

        int divisor = nums[0];
        for (int num : nums) {
            divisor = gcd(divisor,num);
            if(divisor == 1){
                break;
            }
        }

        return divisor == 1;
    }

    /**
     * 获取两数最大公约数
     * @param n1
     * @param n2
     * @return
     */
    public static int gcd(int n1,int n2){

        while (n2 != 0){
            int temp = n1;
            n1 = n2;
            n2 = temp % n2;
        }

        return n1;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{12,3,5,7};
        System.out.println(isGoodArray(nums));

    }


}
