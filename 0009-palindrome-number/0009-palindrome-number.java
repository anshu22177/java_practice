class Solution {
    public boolean isPalindrome(int x) {
        int rev = 0;
        int y = x;
        while(y!=0){
            int last = y%10;
            rev = (rev*10) + last;
            y = y/10;
        }
        if(x!=rev || x<0)
            return false;
        else{
            return true;
        }
    }
}