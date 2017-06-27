package map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * Created by liuzhigang on 2017/6/19.
 *

 Example:
 Given nums = [2, 7, 11, 15], target = 9,

 Because nums[0] + nums[1] = 2 + 7 = 9,
 return [0, 1].

 */
public class leetcode_1_twoSum {

    public static void main(String[] args) {
        int[] nums = {2,2, 7, 15};
        int target = 4;
        int[] result = towSum(nums, target);
        System.out.println(result[0]+" "+result[1]);
    }

    public static int[] towSum (int[] numbers, int target) {
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        int[] result = new int[2];
        for (int i = 0; i < numbers.length; i++) {
            if (map.containsKey(numbers[i])) {
                int index = map.get(numbers[i]);
                result[0] = index ;
                result[1] = i;
                break;
            } else {
                map.put(target - numbers[i], i);
            }
        }
        return result;
    }
}
