class Solution {
    public int[] countBits(int n) {
        int[] sol =  new int[n+1];
        for(int i=0; i<n+1; i++)
        sol[i] = Integer.bitCount(i);
        return sol;
    }
}