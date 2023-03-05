class Solution {
    public long coloredCells(int n) {
        long sum=0;
        sum+=1l*n*n;
        sum+=1l*(n-1)*(n-1);
        return sum;
    }
}