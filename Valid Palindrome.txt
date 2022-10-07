class Solution {
    public boolean isPalindrome(String s) {
        String reverse = "";
        for (char c: s.toCharArray()){
            if( Character.isDigit(c) || Character.isLetter(c)){
                reverse += c;
            }
        }
        reverse = reverse.toUpperCase();
        int a =0, b= reverse.length()-1;
        while(a<=b){
            if(reverse.charAt(a) != reverse.charAt(b)) {return false;}
            a++;
            b--;
        } 
        return true;
    }
}