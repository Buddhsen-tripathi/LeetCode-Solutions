class Solution {
    int[] memo;
    public int numDecodings(String s) {
        memo = new int[s.length()];
        return dfs(s, 0);
    }
    
    public int dfs(String in, int index){
        if(index>=in.length()) return 1;
        if(memo[index]!=0) return memo[index];
        else{
            int result = 0;
            if(in.charAt(index)!='0'){
                result+=dfs(in, index+1);
                if(index+1<in.length()){
                    char temp = in.charAt(index);
                    char temp1 = in.charAt(index+1);
                    if(temp<'2' || (temp=='2' && temp1<'7')){
                        result+=dfs(in, index+2);
                    }
                }
            }
            
            return memo[index]= result;
        }
    }
}