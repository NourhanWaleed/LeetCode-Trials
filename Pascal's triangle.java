class Solution {
    public List<List<Integer>> generate(int numRows) {
      List<List<Integer>> list = new ArrayList<>();
        list.add(new ArrayList<Integer>(Arrays.asList(1)));
        for(int i=1;i<numRows;i++){
            List<Integer> list1 = new ArrayList<>();
            for(int j=0;j<=i;j++){
                if(j==0 || j==i)
                    list1.add(1);
                else
                    list1.add(list.get(i-1).get(j)+list.get(i-1).get(j-1));
            }
            list.add(list1);
        }
        return list;
    }
}