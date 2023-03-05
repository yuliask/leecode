class Solution {
    public int passThePillow(int n, int time) {
        time=time%(2*n-2);
        if(time<=n-1)return 1+time;
        time-=n-1;
        return n-time;
    }
}