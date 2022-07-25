class Solution {
    public boolean validPath(int n, int[][] edges, int source, int destination) {
        boolean check = false;
        HashMap<Integer,ArrayList<Integer>> gh = new HashMap<>();
				
        for(int i=0;i<n;i++) {
			gh.put(i, new ArrayList<>());
		}
        
		for(int i=0;i<edges.length;i++) {
			 gh.get(edges[i][0]).add(edges[i][1]);
             gh.get(edges[i][1]).add(edges[i][0]);
		}
        
        check = pathexists(gh,source,destination,n);
        
        return check;
    }
    
    static boolean pathexists(HashMap<Integer,ArrayList<Integer>> gh,int s,int d,int n){
		int [] v = new int[n+1];
		Queue<Integer> q = new LinkedList<>();
		
		q.add(s);
		while(!q.isEmpty()) {
			int temp = q.poll();
			v[temp] = 1;
			if(temp == d) return true;
            
			for(int i:gh.get(temp)) {
				
				if(v[i] == 0)
					q.add(i);
				if(i == d) return true;
			}
		}
		return false;
	}
}