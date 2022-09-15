class Solution {
    public boolean canArrange(int[] arr, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int val : arr) {
            int rem = val % k; 
            if(rem < 0) 
                rem += k;
            map.put(rem, map.getOrDefault(rem,0)+1);
        }

        for(int rem : map.keySet()) {
            if(rem == 0) {
                if(map.get(rem) % 2 != 0) 
                    return false;
            } else if(rem * 2 == k) {
                if(map.get(rem) % 2 != 0) 
                    return false;
            } else {
               int freq1 = map.get(rem); 
               int freq2 = map.getOrDefault(k-rem, 0); 
               if(freq1 != freq2) 
                   return false; 
            }
        }
        
        return true;
    }
}