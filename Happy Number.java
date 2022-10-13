class Solution {
    public int getNext(int n){
        int totalsum = 0;
        while(n > 0){
            int d =n%10;
            totalsum += d*d;
            n /= 10;
        }
        return totalsum;
    }
    
    public boolean isHappy(int n) {
        while ( n != 1 && n != 4)
            n = getNext(n);
        return n == 1;
    }
}