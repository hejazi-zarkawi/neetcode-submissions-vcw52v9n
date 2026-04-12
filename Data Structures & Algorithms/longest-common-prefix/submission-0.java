class Solution {
    public String longestCommonPrefix(String[] strs) {
        String prefix= strs[0];
        int n= prefix.length();

        for(int i=0; i<n;i++){
            for(String str: strs){
                if(i==str.length() || str.charAt(i)!=prefix.charAt(i)){
                    return prefix.substring(0,i);
                }
            }
        }

        return prefix;
    }
}