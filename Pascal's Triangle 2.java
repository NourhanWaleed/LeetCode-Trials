class Solution {
    public List<Integer> getRow(int rowIndex) {
    Integer[] A = new Integer[rowIndex + 1];
        Arrays.fill(A, 0);
        A[0] = 1;
     for(int i=0;i<=rowIndex;i++)
         for(int j=i;j>=1;j--)
             A[j] +=A[j-1];
 return Arrays.asList(A);
    }
}