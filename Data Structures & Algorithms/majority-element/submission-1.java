class Solution {
    public int majorityElement(int[] nums) {
        int cand= Integer.MIN_VALUE;
        int votes=0;

        for(int num: nums){
            if(votes==0){
                cand= num;
                votes++;
            }
            else{
                if(cand==num){
                    votes++;
                }
                else{
                    votes--;
                }
            }
        }

        int count=0;
        for(int num: nums){
            if(num==cand){
                count++;
            }
        }

        if(count> nums.length/2){
            return cand;
        }

        return -1;
    }
}