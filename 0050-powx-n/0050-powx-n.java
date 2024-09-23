class Solution {
    public double myPow(double x, long n) { 
        //changed original method signature becoz of case
        //when value of n get greater than range of int, So make it long
        // to handle the case
        if(n==0) return 1.0;

        if(n < 0){
            x = 1/x;
            return myPow(x, -n);
        }
        double half = myPow(x, n/2);

        if(n%2 == 0){
            return half*half;
        }else{
            return x*half*half;
        }
    }
}