public class firstmissingpositivenumbers {

    class Solution {
    public int firstMissingPositive(int[] nums) {

        int n = nums.length;
        int i = 0;

        while (i < n) {

            if (nums[i] > 0 && nums[i] <= n) {

                int index = nums[i] - 1;

                if (nums[index] != nums[i]) {
                    int temp = nums[i];
                    nums[i] = nums[index];
                    nums[index] = temp;
                } 
                else {
                    i++;
                }

            } 
            else {
                i++;
            }
        }

        i = 0;

        while (i < n) {

            if (nums[i] != i + 1) {
                return i + 1;
            }

            i++;
        }

        return n + 1;
    }
}
    
}
