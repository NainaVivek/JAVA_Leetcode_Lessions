import java.util.HashMap;
import java.util.Map;

class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> numToIndex = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            System.out.println((target - nums[i]) + " " + numToIndex.containsKey(target - nums[i]));
            if (numToIndex.containsKey(target - nums[i])) {
                return new int[]{numToIndex.get(target - nums[i]), i};
            }
            numToIndex.put(nums[i], i);
            System.out.println("["+nums[i]+", "+i+"]");
        }
        return new int[]{};
    }

    public static void main(String[] args) {
        TwoSum t = new TwoSum();
        int[] a = t.twoSum(new int[]{2, 7, 11, 15}, 18);
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }
}