class Solution {
    public int fib(int n) {
        return(fibo(n,new int[n+1]));
    }
    
    static int fibo(int n, int[] mem){
        if(n == 0 || n == 1)
            return n;
        if(mem[n]!=0)
            return mem[n];
        int fibn = fibo(n-1,mem) + fibo(n-2,mem);
        mem[n] = fibn;
        return fibn;
    }
}