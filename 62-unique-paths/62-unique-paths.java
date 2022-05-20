class Solution {
    public int uniquePaths(int m, int n) {
        //Optimal solution using combination method
        int N = m + n - 2;
        int r = m - 1;
        double res = 1;
        for(int i=1; i<=r; i++)
            res = res * (N - r + i) / i;
        return (int)res;
        // return countPaths(0,0,m,n);
    }  
    
    // Solution using recursion
    // public int countPaths(int i, int j, int m, int n) {
    //     if(i == m-1 && j == n-1) return 1;
    //     if(i >=m || j >=n) return 0;
    //     return countPaths(i+1,j,m,n) + countPaths(i,j+1,m,n);
    // }
    
    
}