class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> al = new ArrayList<>();
        
        for(int i = 0; i < numRows; i++){
            List<Integer> ithRow = new ArrayList<>();
            for(int j = 0; j <= i; j++){
                
                if(j == 0 || j == i )
                    ithRow.add(1);
                else
                    ithRow.add(al.get(i-1).get(j-1) + al.get(i-1).get(j));
            }
            
            al.add(ithRow);
        }
        return al;
    }
}