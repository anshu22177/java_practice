class Solution {
    public int findNumbers(int[] nums) {
        int count = 0;
        for(int i = 0;i<nums.length;i++){
            if(even(nums[i])){
                count++;
            }
            
        }
        return count;
    }
    boolean even(int num){
        int numOfDigit = digits(num);
        return numOfDigit%2==0;
    }
    int digits(int num){
        int count = 0;
        if(num<0){
            num = num*-1;
        }
        if(num==0){
            return 1;
        }
        while(num>0){
            count++;
            num = num/10;
        }
        return count;
    }
}