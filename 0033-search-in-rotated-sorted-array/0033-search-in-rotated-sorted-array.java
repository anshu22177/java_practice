class Solution {
    public int search(int[] nums, int target) {
        int pivotIndex = pivot(nums);
        
        if(pivotIndex==-1){
            return binarySearch(nums,target,0,nums.length-1);
        }
        if(target==nums[pivotIndex]){
            return pivotIndex;
        }
        if(target>=nums[0]){
            return binarySearch(nums,target,0,pivotIndex-1);
        }
        else{
            return binarySearch(nums,target,pivotIndex+1,nums.length-1);
        }
       
    }
    int binarySearch(int[] nums, int target, int start, int end){
        while(start<=end){
            int mid = start + (end-start)/2;
            if(target==nums[mid]){
                return mid;
            }
            else if(target<nums[mid]){
                end=mid-1;
            }
            else{
                start=mid+1;
            }
        }
        return -1;
    }
    int pivot(int[] nums){
        int start = 0;
        int end = nums.length-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(mid!=end && nums[mid]>nums[mid+1]){
                return mid;
            }
            if(mid!=start && nums[mid]<nums[mid-1]){
                return mid;
            }
            if(nums[start]>=nums[mid]){
                end=mid-1;
            }
            else{
                start=mid+1;
            }
        }
        return -1;
    }
}