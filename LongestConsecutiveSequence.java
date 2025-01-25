import java.util.*;
public class LongestConsecutiveSequence {

    public static void main(String[] args) {
        int[] nums = {100, 4, 200, 1, 3, 2};
        longestConsecutive(nums);
    }

    public static int longestConsecutive(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int maxLength = 0;
        for (int i = 0; i < nums.length; i++) {
            int x = nums[i];
            if (!map.containsKey(nums[i])) {
                int left = map.getOrDefault(x - 1, 0);
                int right = map.getOrDefault(x + 1, 0);
                int len = 1 + left + right;

                map.put(x, 1);
                map.put(x, len);
                map.put(x - 1, len);
                map.put(x + 1, len);
                maxLength = Math.max(maxLength, len);

            }
        }
        return maxLength;


    }
}
