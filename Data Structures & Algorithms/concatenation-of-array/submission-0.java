class Solution {
    public int[] getConcatenation(int[] nums) {
        int length= nums.length;
        int[] res= new int[length*2];

        for(int i=0;i<length;i++){
            res[i]= nums[i];
        }

        for(int i=0;i<length;i++){
            res[i+length]= nums[i];
        }

        return res;
    }
}