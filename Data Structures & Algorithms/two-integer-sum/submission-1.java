class Solution {
    public int[] twoSum(int[] nums, int target) {
        int n= nums.length;
        
        Map<Integer,Integer> freq= new HashMap<>();

        for(int i=0; i<n; i++){
            int diff= target-nums[i];
            if(freq.containsKey(diff)){
                return new int[]{freq.get(diff),i};
            }
            else if(freq.containsKey(nums[i])){
                continue;
            }
            else{
                freq.put(nums[i],i);
            }
        }
        
        return new int[]{-1,-1};
    }
}
