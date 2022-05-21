class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> list = new ArrayList<>();
        int n = rowIndex;
        for(int i=0; i<=rowIndex;i++) {
            list.add(ncr(n, i));
        }
        return list;
    }
    
    int ncr(int m, int n) {
            int N = m ;
            int r = n; 
            double res = 1;
            
            for (int i = 1; i <= r; i++)
                res = res * (N - r + i) / i;
            return (int)res;
    }
}