class Solution {
    public int countPalindromicSubsequence(String s) {
        int[] fir = new int[26];
        int[] las = new int[26];
        Arrays.fill(fir, -1);
        Arrays.fill(las, -1);
        
        for(int i = 0; i < s.length(); i++){
            int pos = s.charAt(i) - 'a';
            if(fir[pos] == -1)
                fir[pos] = i;
            
                las[pos] = i;
        }
        
        int ans = 0;
        for(int i = 0; i < 26; i++){
            if(fir[i] < las[i]){
                int val = 0;
                HashMap<Character, Integer> hash = new HashMap<>();
                for(int j = fir[i] + 1; j < las[i]; j++){
                    if(hash.containsKey(s.charAt(j)))
                        continue;
                    else{
                        hash.put(s.charAt(j), 1);
                        val++;
                    }
                }
                ans += val;
            }
        }
        
        return ans; 
    }
}