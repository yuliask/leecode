class Solution {
    public int splitNum(int num) {
        int[] ab=new int[10];
        int count=0;
        for(int ii=num;ii>0;ii/=10){
           ab[ii%10]++;
            count++;
        }
        int sum=0;boolean flag=count%2==1;
        int cur=0;
        while(count>0){
            while(ab[cur]==0)cur++;
            if(flag){sum=cur;count--;ab[cur]--;
            System.out.println("0:"+cur);
            flag=false;continue;}
            if(ab[cur]>=2){
            sum=sum*10+2*cur;ab[cur]-=2;
                count-=2;
            System.out.println("3:"+cur);
            }else{
            sum=sum*10+cur;ab[cur]=0;
            System.out.println("1:"+cur);
            while(ab[cur]==0)cur++;
            sum+=cur;ab[cur]--;count-=2;                
            System.out.println("2:"+cur);
            }
        }
        return sum;
        
    }
}