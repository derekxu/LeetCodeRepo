
public class RangeBitwiseAnd {

}

class Solution {
    public int rangeBitwiseAnd(int m, int n) {
        if(m<0||n<0||m>n) return -1;
        
        int len=n-m+1;
        int result=0;
        if(((m&1)==1)&&m==n){
            result=1;
        }else{
            result=0;
        }
        
        for(int i=1;i<31;i++){
            if(((m>>i)&1)==1 && len<=((1<<i)-(m&((1<<i)-1)))){
                result=result|(1<<i);
            }
        }
        return result;
    }
}
