class Solution {
    public int bagOfTokensScore(int[] tokens, int power) {
        
        Arrays.sort(tokens);
        int n = tokens.length;
        if(n==0)
            return 0;     
        int score=0;
        int end=n-1;
        int start=0;
        while(start<=end){
            while(start<n && power>=tokens[start]){
                power-=tokens[start];
                score+=1;
                start++;
            }
            if(start<end && score>0){
                power+=tokens[end];
                end--;
                score--;
            }
            else{
                start++;
                end--;
            }
        }
        return score;
    }
}