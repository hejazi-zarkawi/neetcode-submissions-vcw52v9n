class Solution {
    public boolean isAnagram(String s, String t) {
        Map<Character,Integer> freq= new HashMap<>();
        for(char ch: s.toCharArray()){
            if(!freq.containsKey(ch)){
                freq.put(ch,1);
            }
            else{
                freq.put(ch,freq.get(ch)+1);
            }
        }

        for(char ch: t.toCharArray()){
            if(!freq.containsKey(ch)){
                return false;
            }
            else{
                freq.put(ch,freq.get(ch)-1);
            }
        }

        for(Map.Entry<Character,Integer> entry: freq.entrySet()){
            if(entry.getValue()!=0){
                return false;
            }
        }

        return true;
    }
}
