package easy;

public class SearchInsertPosition {

    public static int searchInsert(int[] nums, int target) {
        int mid = nums.length / 2;
        if (nums[mid] > target) {
            for (int i = 0; i < mid; i++) {
                if (target == nums[i])
                    return i;
            }
        } else {
            for (int i = mid; i < nums.length; i++) {
                if (target == nums[i])
                    return i;
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{1, 3, 5, 6};
        System.out.println(searchInsert(arr, 0));
    }

}
