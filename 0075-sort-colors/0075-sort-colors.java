class Solution {
    public void sortColors(int[] nums) {
        int high = nums.length - 1;
        int mid = 0;
        int low = 0;
        while(mid<=high){
            if(nums[mid]==0){
                int temp = nums[mid];
                nums[mid] = nums[low];
                nums[low] = temp;
                mid++;
                low++;
            }
            else if(nums[mid]==1){
                int temp1 = nums[mid];
                nums[mid] = nums[low];
                nums[low] = temp1;
                mid++;
            }
            else{
                int temp2 = nums[mid];
                nums[mid] = nums[high];
                nums[high] = temp2;
                high--;
            }
        }
        
    }
}