class Solution {
    int[] fib =  new int[50];
    int fibLike(int n){
        if(n <3) return n;
        if(fib[n] !=0) return fib[n];
        int ans = fibLike(n-1) + fibLike(n-2);
        return fib[n] = ans;
    }
    public int climbStairs(int n) {
        return fibLike(n);
    }
}