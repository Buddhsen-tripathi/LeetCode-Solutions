class Solution {
    public int candy(int[] ratings) {
        int min = 0;
        int[] buf = new int[ratings.length];
        Arrays.fill(buf,1);
        
        for(int i = 1;i < ratings.length;i++)
            if(ratings[i] > ratings[i-1])
               buf[i] = buf[i-1]+1;
                
        for(int i = ratings.length-2;i >= 0;i--)
            if(ratings[i] > ratings[i+1]){
                if(i-1 >= 0 && ratings[i-1] <= ratings[i])
                    buf[i] = Math.max(buf[i+1]+1, buf[i]);
                else
                    buf[i] = buf[i+1] + 1;
            }
        
        for(int i=0;i<ratings.length;i++){
            min+= buf[i];
        }
        
        return min;
    }
}