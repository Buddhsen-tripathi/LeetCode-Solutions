class Solution {
    public int lengthOfLongestSubstring(String s) {
        int st =0;
        int end = 0;  
        int max=0;
        
        HashSet<Character> hs= new HashSet();
        while(end<s.length()){
            if(!hs.contains(s.charAt(end))){
                hs.add(s.charAt(end));
                end++;
                max= Math.max(hs.size(),max);
            }else{
                hs.remove(s.charAt(st));
                st++;
            }
        }
        return max;
    }
}