class Solution {
    public int maximumWealth(int[][] accounts) {
        int maxAmmount = Integer.MIN_VALUE;
        for(int m=0;m<accounts.length;m++){
            int sum = 0;
            for(int n=0;n<accounts[m].length;n++){
                
                sum = sum+accounts[m][n];
                 
            }
           if(sum>maxAmmount){
                    maxAmmount=sum;
            }
        }
        return maxAmmount;
    }
}