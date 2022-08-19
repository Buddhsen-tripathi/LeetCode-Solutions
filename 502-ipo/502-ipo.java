class Solution {
    class Pair{
        int p;
        int c;
        
        Pair(int p,int c){
            this.p=p;
            this.c=c;
        }
    }
    
    public int findMaximizedCapital(int k, int w, int[] p, int[] c) {
        int i=0;
        Pair arr[]= new Pair[p.length];
        while(i<p.length){
            arr[i]=new Pair(p[i],c[i]);
            i++;
        }
        Arrays.sort(arr,(m,n)->(m.c-n.c));
        i=0;
        
        int sum=w;
        
        PriorityQueue<Pair> pq = new PriorityQueue<>((m,n)->(n.p-m.p));
        
        while(i<p.length && k>0){
            if(arr[i].c<=sum){
                pq.add(arr[i]);
                i++;
            }
            else{
                if(pq.isEmpty())break;
                sum+=pq.poll().p;
                k--;
            }
            
        }
        while(k>0 && !pq.isEmpty()){
            sum+=pq.poll().p;
            k--;
        }
        
        return sum;
    }
}