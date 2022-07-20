class Solution {
   public int numMatchingSubseq(String s, String[] words) {
       
        Map<String,Integer> hmap = new HashMap<>();
        for(String str:words){
            hmap.put(str,hmap.getOrDefault(str,0)+1);
        }
        
        int ans = 0;
        char ch[] = s.toCharArray();
        
        for(String str:hmap.keySet()){
            
            char temp[] = str.toCharArray();
            int i = 0;
            int j = 0;
            
            while(i<ch.length && j<temp.length){
                if(ch[i]==temp[j]){
                    i++;
                    j++;
                }else{
                    i++;
                }
            }
            
            if(j==temp.length){
                ans+=hmap.get(str);
            }
            
        }
        
      return ans;  
    }
}