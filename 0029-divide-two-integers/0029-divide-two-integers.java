class Solution {
    public int divide(int dividend, int divisor) {
        if(dividend==Integer.MIN_VALUE && divisor==-1) return Integer.MAX_VALUE;

       int temp=0;
       int ans=0;
       int sign = (dividend<0) ^ (divisor <0 ) ? -1 : 1 ;

        dividend=Math.abs(dividend);
        divisor=Math.abs(divisor);
        int subq=0;
        int quotient=0;
         while(dividend-divisor>=0){

            for(subq=0;dividend - (divisor<<subq<<1)>=0;subq++);

            quotient += 1<<subq;
            dividend -= divisor<<subq;
       }

      return sign * quotient;
    }
}

